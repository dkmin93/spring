package com.simple.board.dao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simple.command.BoardVO;

@Service("boardService")
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardMapper boardMapper;
	
	@Override
	public void regist(BoardVO vo) {
		
		boardMapper.insert(vo);
		
	}
	
	@Override
	public ArrayList<BoardVO> getList() {
		
		return boardMapper.select();
	}
	
	@Override
	public void delete(String bno) {
		
		boardMapper.delete(bno);
		
	}
	
}