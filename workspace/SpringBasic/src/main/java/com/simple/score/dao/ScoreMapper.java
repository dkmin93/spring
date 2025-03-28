package com.simple.score.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.simple.command.ScoreVO;

@Mapper //mapper임을 명시하는 어노테이션
//기존과 다르게 구현체를 정적 파일들을 보관하는 resources 폴더에 완전히 동일한! 이름으로 생성한다.
public interface ScoreMapper {

	String getTime();
	
	//update, delete, select 에도 모두 동일하게 적용된다.
	int insertOne(String name); //매개변수가 1개일 때 (#{name})
	int insertTwo(ScoreVO vo); //매개변수가 DTO일 때 (#{getter명})
	int insertThree(Map<String, Object> map); //매개변수가 map (#{key값})
	int insertFour(@Param("name") String name, @Param("kor") String kor, @Param("eng")String eng); //매개변수가 여러개면 @Param("이름")을 사용한다.
	//Param 어노테이션만 붙인다면 순서도 바뀌어도 상관없다.
	
	ScoreVO selectOne(int sno); //반환을 VO(DTO)
	HashMap<String, Object> selectTwo(int sno); //반환을 map
	ArrayList<ScoreVO> selectThree(); //여러행 select
	ArrayList<HashMap<String, Object>> selectFour();
	
	int update(ScoreVO vo);

	void delete(String sno);
	
}
