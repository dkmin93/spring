package com.simple.score.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simple.command.ScoreVO;
import com.simple.score.dao.ScoreMapper;

//서비스 구현체에 어노테이션 붙이고 패키지를 읽어서 빈으로 만드는 전략
//소괄호 안에 빈의 이름을 지정할 수도 있다
//컨트롤러의 오토와이어드된 멤버변수의 이름을 말한다
@Service("scoreService")
public class ScoreServiceImpl implements ScoreService {

//	@Autowired
//	private ScoreDAO scoreDAO;
	
	@Autowired
	private ScoreMapper scoreMapper;
	
	@Override
	public void regist(ScoreVO vo) {
		
		scoreMapper.insertTwo(vo);
	
	}
	
	@Override
	public ArrayList<ScoreVO> getList() {
		
		return scoreMapper.selectThree();
		
	}
	
	@Override
	public void delete(String sno) {
		
		scoreMapper.delete(sno);
		
	}
	
	
	
	
}