package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.service.CalciService;

@Controller
public class CalciController {
	
	@Autowired
	CalciService cs;
	
	@GetMapping("/calci")
	public String add(@RequestParam int num1, 
					  @RequestParam int num2,
					  @RequestParam String operation, 
					  Model m) {
		System.out.println("Data received!");
		
		// way of approach
		switch(operation) {
		case "add":
			int res1 = cs.add(num1, num2);
			m.addAttribute("result", res1);
			break;
			
		case "sub":
			int res2 = cs.sub(num1, num2);
			m.addAttribute("result", res2);
			break;
			
		case "mul":
			int res3 = cs.mul(num1, num2);
			m.addAttribute("result", res3);
			break;
			
		case "div":
			int res4 = cs.div(num1, num2);
			m.addAttribute("result", res4);
			break;
		}
		
		return "result";
	}

}
