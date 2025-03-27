package com.simple.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.simple.command.MemberVO;

@Controller
@RequestMapping("/response")
public class ResponseController {

	//ex01화면을 띄워 준다
	@RequestMapping("/ex01")
	public String ex01() {
		
		return "response/ex01";
		
	}
	
	//ex01_ok화면
	//Model객체 방식 - request.setAttibute랑 유사하다
//	@RequestMapping("/ex01_ok")
//	public String ex01_ok(Model model) {
//		model.addAttribute("name", "박인욱");
//		model.addAttribute("serverTime", new Date());
//		
//		return "response/ex01_ok";
//	}
	
	//ModelAndView 방식 - 뷰에 대한 정봐와, 데이터에 대한 정보를 둘 다 저장. 가장 널리 쓰임.
	@RequestMapping("/ex01_ok")
	public ModelAndView ex01_ok() {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", "홍길동");
		mv.addObject("serverTime", new Date());
		
		mv.setViewName("response/ex01_ok"); //뷰에 대한 정보
		
		return mv;
		
	}
	
	//@ModelAttribute : request와 Model의 합성어
	//화면에서 id를 받고 id라는 이름으로 데이터를 넘긴다
//	@RequestMapping("/ex01_result")
//	public String ex01_result(@ModelAttribute("nick") String nick) {
//		
//		System.out.println(nick);
//			
//		return "response/ex01_result";
//	}
	
	//화면에서 vo에 맵핑되는 값을 받고, mtData라는 이름으로 데이터를 넘긴다. DTO or VO가 있으면 유용
	@RequestMapping("/ex01_result")			 //키 값 : 페이지화면에서 ${}로 호출 가능
	public String ex01_result(@ModelAttribute("myData") MemberVO vo) {
		
		System.out.println(vo.toString());
		
		return "response/ex01_result";
		
	}
	
	///////////////////////////////////////////////////////////////////////////////
	//스프링에서의 redirect는 다시 컨트롤러를 태울 때 사용한다
	
	//redirect_join 화면 띄우기!
	@RequestMapping("/redirect_join")
	public String redirect_join() {
		
		return "response/redirect_join";
	}
	
	//가입요청
	
	
	@RequestMapping("/joinForm")
	public String joinForm(MemberVO vo, RedirectAttributes ra) {
		
		//가입에 대한 처리
		
		//리다이렉트시에는 Model을 사용할 수 없다. Model은 RedirectAttributes를 써야한다
		//리다이렉트시에 1회성 데이터를 보낼 수 있다. flash는 일회성이라는 의미.
		ra.addFlashAttribute("msg", "회원가입 성공");
		
		//가입버튼을 누르면 홈화면으로
		return "redirect:/"; //다시 컨트롤러를 태운다.
	}
	
	

	
	
	
	
	
}
