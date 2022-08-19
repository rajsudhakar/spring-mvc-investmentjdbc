package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetController {

	@RequestMapping("/greet")
	public String greetUser(Model model) {
		model.addAttribute("message","Have a great day");
		return "success";
	}
	@RequestMapping("/sayHello")
	public String helloUser(ModelMap map) {
		map.addAttribute("message","Hello there");
		return "success";
	}
	@RequestMapping("/welcome")
	public ModelAndView welcomeUser() {
	 ModelAndView modelAndView = new ModelAndView("success","mymessage","Welcome to MVC");
	return modelAndView;
}
}
