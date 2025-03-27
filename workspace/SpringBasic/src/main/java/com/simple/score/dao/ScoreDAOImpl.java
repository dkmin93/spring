package com.simple.score.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.simple.command.ScoreVO;

@Repository("scoreDAO") // servlet-context.xml에서 Component scan에 읽힌다
public class ScoreDAOImpl implements ScoreDAO {

	//DB라고 가정
	private ArrayList<ScoreVO> list = new ArrayList<>();
	
	@Override
	public void regist(ScoreVO vo) {
		
		list.add(vo); //insert라고 가정
		
	}
	
	@Override
	public ArrayList<ScoreVO> getList() {
		
		return list;
		
	}
	
	@Override
	public void delete(String sno) {
		list.remove(Integer.parseInt(sno)); //인덱스 번호로 삭제
	}
	
	
}