package com.simple.board.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import com.simple.command.BoardVO;

public interface BoardMapper {

		int insert(@Param("name") String name, @Param("title") String title, @Param("content")String content, @Param("memo")String memo);
		
		BoardVO select(int bno);
		
		int update(BoardVO vo);

		void delete(String bno);

		void insert(BoardVO vo);

		ArrayList<BoardVO> select();
	
}
