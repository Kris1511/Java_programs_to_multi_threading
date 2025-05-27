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
		
		String username = user.getUsername();
		
		boolean userExist = users.userExist(username);
		
		if (userExist == false) {
			users.userRegister(user);
			System.out.println("Successfully signed up...");
		} else {
			System.out.println("Username already exist...");
		}
		return "index";
	}
	
	@GetMapping("/sign_in")
	public String signIn() {
		return "sign_in";
	}
	
	// userExist
	@PostMapping("/login")
	public String login(@ModelAttribute Users user) {
		
		System.out.println("Form Email: " + user.getEmail());
	    System.out.println("Form Password: " + user.getPassword());
		
		Users loginUser = users.userLogin(user);
		
		if (loginUser != null) {
			System.out.println("Login successful for: " + loginUser.getEmail());
			
			return "index";
		} 
		else {
			System.out.println("Login fail...");
			return "sign_in";
		}
	}

}
