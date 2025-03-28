package com.simple.basic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/config/root-context.xml") //로딩시킬 스프링 설정 파일
public class JdbcTest {

	@Autowired
	private DataSource ds;
	
	@Test //메인메서드처럼 동작한다
	//Run As - JUnit Test 를 하면 콘솔창에서 테스트 코드의 동작을 확인할 수 있다
	public void method01() {
		
		Connection conn = null;
		PreparedStatement pstmt = null;;
		ResultSet rs = null;
		
		String sql = "SELECT SYSDATE FROM DUAL";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				String time = rs.getString("sysdate");
				System.out.println(time);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) conn.close();
				if(pstmt != null) pstmt.close();
				if(rs != null) rs.close();
			
			} catch (Exception e2) {
				
			}
		}
		
	}
	
}
