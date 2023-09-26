package com.kosa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("message", "Hello Kosa2222!!!");
		
		return "hello";
	}

}
