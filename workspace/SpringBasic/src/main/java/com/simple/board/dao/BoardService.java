package com.simple.board.dao;

import java.util.ArrayList;

import com.simple.command.BoardVO;

public interface BoardService {

	void regist(BoardVO vo); //insert구문
	
	ArrayList<BoardVO> getList(); //select구문
	
	void delete(String bno); //delete구문
	
}