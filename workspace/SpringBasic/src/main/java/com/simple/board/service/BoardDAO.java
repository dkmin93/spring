package com.simple.board.service;

import java.util.ArrayList;

import com.simple.command.BoardVO;

public interface BoardDAO {

	void regist(BoardVO vo); //insert구문
	
	ArrayList<BoardVO> getList(); //select구문
	
	void delete(String bno); //delete구문
	
}