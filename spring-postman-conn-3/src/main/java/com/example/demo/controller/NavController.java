package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavController {
	
	@GetMapping("/greet")
	public String greet(Model m) {
		m.addAttribute("greeting", "Good morning");
		return "greet";
	}
	
	@GetMapping("/welcome")
	public String welcomePage(Model m) {
		m.addAttribute("welcome", "Welcome to home page");
		m.addAttribute("hello", "Hello from welcome page");
		return "welcome";
	}

}
