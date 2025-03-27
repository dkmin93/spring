package com.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.simple.command.MemberVO;
import com.simple.command.MemberVO2;
import com.simple.command.MemberVO3;

//진짜 진짜 쉬운방법

@Controller                      
@RequestMapping("/request") //모든 메서드 요청 경로 앞에 /request가 붙는다.
public class RequestController {

//	//ex01화면요청
//	@RequestMapping("/ex01")
//	public String ex01() {
//		
//		return "request/ex01";
//		
//	}
	
	//void형으로 화면 연결 - 요청경로가 나가는 경로가 된다.
	@RequestMapping("/ex01")
	public void ex01() {
		
	}
	
	//basic01
	@RequestMapping(value = "/basic01", method=RequestMethod.GET) //get 요청만 허용, 일반적으로 많이 사용
	//@RequestMapping(value = "/basic01", method=RequestMethod.POST) //post 요청만 허용
	//@RequestMapping("/basic01") //get과 post 둘 다 허용
	//@GetMapping("/basic01") //get 요청만 허용
	//@PostMapping("/basic01") //post 요청만 허용
	public void basic01() {
		System.out.println("basic01 요청");
	}
	
	//완전히 동일한 기능이 있으면 요청을 {} 하나로 배열로 묶어서 사용할 수 있다.
	@RequestMapping({"/basic02", "/basic03"})
	public void basic02() {
		System.out.println("basic02~03 요청 실행됨");
	}
	
	////////////////////////////////////////////////////////////////////////////
	
	//ex02 화면 요청
	@RequestMapping("/ex02")
	public String ex02() {
		return "request/ex02";
	}
	
	//1st
//	@RequestMapping(value="/param", method=RequestMethod.POST)
//	public String param(HttpServletRequest request) {
//		
//		String id = request.getParameter("id"); //단일값
//		String pw = request.getParameter("pw");
//		String[] inter = request.getParameterValues("inter");
//		
//		System.out.println(id);
//		System.out.println(pw);
//		System.out.println(Arrays.toString(inter));
//		
//		//전통적인 방법 짜잔!
//		
//		return "request/ex02_success";
//		
//	}
	
	//2nd - @RequestParam어노테이션으로 단일값 받기
	//@RequestParam은 클라이언트에서 반드시 파라미터 값을 넘겨야 한다. 그렇지 않으면 거절당한다.
	//required 옵션이 필수 여부를 지정한다.
	//defaultValue가 파라미터가 없을때 기본값을 지정한다.
//	@RequestMapping(value="/param", method=RequestMethod.POST)
//	public String param(@RequestParam("id") String id, @RequestParam("pw") String pw, @RequestParam("name") String name, @RequestParam(value="inter", required=false, defaultValue="") ArrayList<String> inter) {
//	
//		System.out.println(id);
//		System.out.println(pw);
//		System.out.println(name);
//		System.out.println(inter.toString());
//		
//		return "request/ex02_success";
//		
//	}
	
	//이게 진짜진짜 제일 쉬운 방법. 이걸로 프로젝트하기
	//3nd - form의 name값이 vo의 setter과 일치해야만 한다(멤버변수 명칭이랑 같아야함)
	@RequestMapping(value="/param", method=RequestMethod.POST)
	public String param(MemberVO vo) {
		
		System.out.println(vo.toString());
		
		return "request/ex02_success";
	}
	
	@RequestMapping("/req_quiz01")
	public String req_quiz01() {
		return "request/req_quiz01";
	}
	
//	@RequestMapping(value="/login", method=RequestMethod.POST)
//	public String login(MemberVO2 vo2) {
//		
//		System.out.println(vo2.toString());
//		
//		if("abc123".equals(vo2.getId()) && "xxx123".equals(vo2.getPw())) {
//			return "request/req_quiz01_ok";
//		} else {
//			return "request/req_quiz01_no";
//		}
//		
//	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(MemberVO2 vo2) {
		
		System.out.println(vo2.toString());
		
		if(vo2.getId().equals("abc123") && vo2.getPw().equals("xxx123")) {
			return "request/req_quiz01_ok";
		} else {
			return "request/req_quiz01_no";
		}
		
	}
	
	@RequestMapping("/selfstudy")
	public String selfstudy() {
		return "request/selfstudy";
	}
	
	@RequestMapping(value="/signup", method=RequestMethod.POST)
	public String signup(MemberVO3 vo3) {
		
		System.out.println(vo3.toString()); // null 값 체크하려면 .equals("")로 해주기
		if(vo3.getId().equals("") || vo3.getPw().equals("") || vo3.getName().equals("")) {
			return "request/signup_fail";
		} else {
			return "request/signup_success";
		}
		
		
		
	}
		
		
		
	
		
		
	
	
}
