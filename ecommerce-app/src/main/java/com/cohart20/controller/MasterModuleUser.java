package com.cohart20.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cohart20.entity.User;
import com.cohart20.service.UserService;

@Controller
public class MasterModuleUser {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/masterModule")

	public ModelAndView masterModule() {

		
			ModelAndView mnv = new ModelAndView("masterModulePage");
			return mnv;
	}
	@RequestMapping("/masterUser")
	public ModelAndView masterUser() throws Exception {
		
		ModelAndView modelAndView = new ModelAndView("masterUserPage");
		
	
		
		List<User> users = userService.getAllUsers();
		
		
		modelAndView.addObject("allUsers", users);
		
		return modelAndView;
	}

}
