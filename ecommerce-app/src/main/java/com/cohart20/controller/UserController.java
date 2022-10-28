package com.cohart20.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cohart20.entity.User;
import com.cohart20.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService userservice;

	@RequestMapping("/registrationPage")
	public ModelAndView indexPage() {
		ModelAndView mnv = new ModelAndView("registration");
		return mnv;

	}

	@RequestMapping("/register")
	public ModelAndView register(String username, String password, String firstname, String lastname, String email) {
		System.out.println(username + password + firstname + lastname + email);
		userservice.adduser(username, password, firstname, lastname, email);

		ModelAndView mnv = new ModelAndView("index");
		return mnv;

	}
	@RequestMapping(value ="/u", method = RequestMethod.POST)
	public ModelAndView updateregister(String username, String firstname, String lastname, String email) {
		System.out.println("falguni");
		System.out.println(username + firstname + lastname + email);
		userservice.updregister(username, firstname, lastname,email);

		ModelAndView mnv = new ModelAndView("masterUserPage");
		return mnv;

	}


	@RequestMapping("/login")
	public ModelAndView login(String username, String password) {

		String valid = userservice.loginuser(username, password);

		if (valid.equals("valid")) {
			ModelAndView mnv = new ModelAndView("welcomePage");
			
			User user = new User();
			user = userservice.getuser(username, password);
			
			mnv.addObject("userData", user);
			return mnv;
		} else {

			ModelAndView mnv = new ModelAndView("index");
			mnv.addObject("invalid1", "Invalid Credential Pls Try Again :");
			return mnv;
		}
	}
	@RequestMapping("delete/{uid}")
	public ModelAndView deleteUser(@PathVariable String uid) throws Exception {
		
		System.out.println("the userid is "+uid);
		
	
		userservice.deleteUser(uid);
		
		List<User> users = userservice.getAllUsers();
		
		ModelAndView modelAndView = new ModelAndView("masterUserPage");
		
		modelAndView.addObject("allUsers", users);
		
		return modelAndView;	
	}
	
	@RequestMapping("/update/{username}")
	public ModelAndView updateUser(@PathVariable String username) throws Exception {
		
		
		
		ModelAndView modelAndView = new ModelAndView("updateUserPage");
		
		 
		 
		 User user = userservice.getUser(username);
		 
		 
		modelAndView.addObject("userData", user);
		 
		return modelAndView;
		
		
	}
	
}
