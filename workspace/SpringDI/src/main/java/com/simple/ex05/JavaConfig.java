package com.simple.ex05;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.simple.ex01.Hello;
import com.simple.ex02.Chef;
import com.simple.ex02.Hotel;
import com.simple.ex03.DataSource;
import com.simple.ex03.MemberDAO;

@Configuration // 스프링의 설정 파일로 java를 사용하겠다는 선언
public class JavaConfig {

	//<bean class="com.simple.ex01.Hello" idgildong" />
	@Bean
	public Hello gildong() {
		return new Hello();
	}
	
//	<bean class="com.simple.ex02.Chef" id="chef" />
//	<bean class="com.simple.ex02.Hotel" id="hotel">
//		<constructor-arg ref="chef" />
//	</bean>
	
	@Bean
	public Chef chef() {
		return new Chef();
	}
	
	@Bean
	public Hotel hotel() {
		return new Hotel(chef());
	}
	
	
//	<bean class="com.simple.ex03.DataSource" id="dataSource">
//	<property name="url" value="오라클주소"/>
//	<property name="uid" value="jsp"/>
//	<property name="upw" value="1234"/>
//	</bean>
	
	
	@Bean
	public DataSource dataSource() {
		DataSource dataSource = new DataSource();
		dataSource.setUrl("postgres주소");
		dataSource.setUid("abc123");
		dataSource.setUpw("1234");
		return dataSource;
	}
	
	
//	<bean class="com.simple.ex03.MemberDAO" id="memberDAO">
//		<property name="dataSource" ref="dataSource" />
//	</bean>
	
	@Bean
	public MemberDAO memberDAO() {
		MemberDAO dao = new MemberDAO();
		dao.setDataSource(dataSource()); //세터 방식으로 의존성을 주입
		return dao;
	}
	
	
	
	
	
}
