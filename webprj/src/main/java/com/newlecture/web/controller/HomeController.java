package com.newlecture.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//     http://.../WEB
@Controller 
@RequestMapping("/")
public class HomeController {
	
	@RequestMapping("index") //servlet.xml에서 mvc:annotation-driven 작성 
	public String index() {
		
		return "root.index";
	}
	
//	@Override
//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		// TODO Auto-generated method stub
//		ModelAndView mv = new ModelAndView("root.index");
//		mv.addObject("data", "Hello Spring MVC~");
//		//mv.setViewName("/WEB-INF/view/index.jsp");
//		return mv;
//	}
	
}
