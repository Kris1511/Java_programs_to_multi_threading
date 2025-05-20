package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavController {
	
	@GetMapping("/java")
	public String openJava() {
		return "java";
	}
	
	@GetMapping("/python")
	public String openPython() {
		return "python";
	}
	
	@GetMapping("/sql")
	public String openSql() {
		return "sql";
	}

}
