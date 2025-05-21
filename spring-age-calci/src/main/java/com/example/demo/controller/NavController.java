package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.service.AgeCalculatorService;

@Controller
public class NavController {
	
	@Autowired
    AgeCalculatorService ageService;

    @GetMapping("/")
    public String showForm() {
        return "index";
    }

    @PostMapping("/calculate")
    public String calculateAge(@RequestParam("dob") String dob, Model model) {
        String result = ageService.calculateAge(dob);
        model.addAttribute("result", result);
        return "index";
    }

}
