package com.simple.score.service;

import java.util.ArrayList;

import com.simple.command.ScoreVO;

public interface ScoreService {
	
	void regist(ScoreVO vo); //insert
	
	ArrayList<ScoreVO> getList(); //select 메서드의 모형
	
	void delete(String sno); //delete 메서드

	
}