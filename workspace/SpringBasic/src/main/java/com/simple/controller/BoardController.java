package com.simple.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simple.board.dao.BoardService;
import com.simple.command.BoardVO;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	@Qualifier("boardService")
	private BoardService boardService;
	
	@RequestMapping("/boardList")
	public String boardList(Model model) {
		
		ArrayList<BoardVO> list = boardService.getList();
		model.addAttribute("list", list);
		
		return "board/boardList";
		
	}
	
	@RequestMapping("/boardRegist")
	public String boardRegist() {
		
		return "board/boardRegist";
	
	}
	
	@RequestMapping("/boardResult")
	public String boardResult() {
		
		return "board/boardResult";
	
	}
	
	@RequestMapping(value="boardForm", method = RequestMethod.POST)
	public String boardRegist(BoardVO vo) {
		
		boardService.regist(vo);
		
		return "redirect:/board/boardResult";
	
	}

	@RequestMapping("/boardDelete")
	public String boardDelete(@RequestParam("bno") String bno) {
	
		boardService.delete(bno);
		
		return "redirect:/board/boardList";
		
	}
	
	
}