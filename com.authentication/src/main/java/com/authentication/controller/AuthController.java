package com.authentication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.authentication.entities.Users;
import com.authentication.services.UsersService;

@Controller
public class AuthController {
	
	@Autowired
	UsersService users;
	
	@GetMapping("/sign_up")
	public String signUp() {
		return "sign_up";
	}
	
	@PostMapping("/register")
	public String register(@ModelAttribute Users user) {
		users.userRegister(user);
		System.out.println("Successfully signed up...");
		return "index";
	}
	
	@GetMapping("/sign_in")
	public String signIn() {
		return "sign_in";
	}
	
	@PostMapping("/login")
	public String login() {
		return "";
	}

}
