package com.simple.board.dao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simple.board.service.BoardDAO;
import com.simple.command.BoardVO;

@Service("boardService")
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDAO boardDAO;
	
	@Override
	public void regist(BoardVO vo) {
		
		boardDAO.regist(vo);
		
	}
	
	@Override
	public ArrayList<BoardVO> getList() {
		
		return boardDAO.getList();
	}
	
	@Override
	public void delete(String bno) {
		
		boardDAO.delete(bno);
		
	}
	
}