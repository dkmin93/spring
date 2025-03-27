package com.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.simple.command.MemberVO;

@Controller
@RequestMapping("/quiz")
public class QuizController {

	//quiz01화면부터 띄우기
	@RequestMapping("/quiz01")
	public String quiz01() {
		
		return "quiz/quiz01";
		
	}
	
	@RequestMapping("/quiz01_ok")
	public String quiz01_ok(@ModelAttribute("myData") MemberVO vo) {
		
		System.out.println(vo.toString());
		
		return "quiz/quiz01_ok";
		
	}
	
	//quiz02화면부터 띄우기
	@RequestMapping("/quiz02")
	public String quiz02() {
			
		return "quiz/quiz02";
			
	}

	//1회성 생축 메세지
	@RequestMapping("/result")
	public String result(MemberVO vo, RedirectAttributes ra) {
			
		String message = vo.getYear() + "년 " + vo.getMonth() + "월 " + vo.getDay() + "일 " + vo.getMsg();
		
		ra.addFlashAttribute("msg", message);
		
		return "redirect:/quiz/result";
	}
	
	@RequestMapping(value = "/result", method = RequestMethod.GET)
	public String resultPage() {
	    return "quiz/result";
	}
	
	
	
	
	
	
}