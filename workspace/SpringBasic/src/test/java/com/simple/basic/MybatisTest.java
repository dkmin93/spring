package com.simple.basic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.simple.board.dao.BoardMapper;
import com.simple.command.BoardVO;
import com.simple.score.dao.ScoreMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/config/root-context.xml") //로딩시킬 스프링 설정 파일
public class MybatisTest {

	@Autowired
	private ScoreMapper scoreMapper;
	
	@Autowired
	private BoardMapper boardMapper;
	
//	@Test
//	public void test01() {
//		
//		String time = scoreMapper.getTime();
//		System.out.println(time);
//		
//	}
	
	//insert
//	@Test
//	public void test02() {
		
//		int result = scoreMapper.insertOne("박인욱");
//		System.out.println("성공실패:" + result);
		
//		ScoreVO vo = new ScoreVO("유경초이", "10", "20", "30", 0);
//		int result = scoreMapper.insertTwo(vo);
//		System.out.println("성공실패:" + result);
		
//		Map<String, Object> map = new HashMap<>();
//		map.put("name", "팤인웈");
//		map.put("kor", "10");
//		map.put("eng", "20");
//		map.put("math", "30");
//		int result = scoreMapper.insertThree(map);
//		System.out.println("성공실패:" + result);
		
//		int result = scoreMapper.insertFour("빢인욲", "10", "20");
//		System.out.println("성공실패:" + result);
//		
//	}
	
//	@Test
//	public void test03() {
////		ScoreVO vo = scoreMapper.selectOne(2);
////		System.out.println(vo.toString());
//		
////		HashMap<String, Object> map = scoreMapper.selectTwo(2);
////		System.out.println(map.toString());
//		
////		ArrayList<ScoreVO> list = scoreMapper.selectThree();
////		System.out.println(list.toString());
//			
//			ArrayList<HashMap<String, Object>> list = scoreMapper.selectFour();
//			System.out.println(list.toString());
//		
//	}
	
//	@Test
//	public void test04() {
//		//vo를 통해서 업데이트 할 값을 전달 받고, 1번의 점수를 update하는 sql문을 작성하기.
//		//업데이트 여부는 정수형으로 받아오는 mybatis 구문을 작성하기.
//		
//		ScoreVO vo = new ScoreVO("빢인욲", "10", "20", "40", 1);
//		int result = scoreMapper.update(vo);
//		System.out.println("성공실패:" + result);
//		
//	}
	
	@Test
	public void test05() {
		
		
		int result = boardMapper.insert("가", "타이틀", "컨텐츠", "메모");
		System.out.println();
		
	}
	
	
	
	
	
	
	
	
}