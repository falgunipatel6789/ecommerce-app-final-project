package com.cohart20.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {
	
	@RequestMapping("/")
	public ModelAndView indexPage() {
		ModelAndView mnv = new ModelAndView("index");
		return mnv;
		
	}

}
