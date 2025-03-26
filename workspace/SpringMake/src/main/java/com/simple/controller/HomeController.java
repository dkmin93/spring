package com.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller //이게 더 편한 방법!!
public class HomeController {

	@RequestMapping("/example/aaa")
	public ModelAndView home() {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("data", "헬로우월드");
		mv.setViewName("aaa");
		return mv;
	}
	
	
}
