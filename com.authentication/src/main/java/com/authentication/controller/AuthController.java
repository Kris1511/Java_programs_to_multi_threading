package com.authentication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String register(@ModelAttribute Users user, Model m) {
		
		String username = user.getUsername();
		
		boolean userExist = users.userExist(username);
		
		if (userExist == false) {
			users.userRegister(user);
			m.addAttribute("msg", "Successfully signed up...");
			return "sign_in";
		} else {
			m.addAttribute("msg", "Username already exist...");
			return "sign_up";
		}		
	}
	
	@GetMapping("/sign_in")
	public String signIn() {
		return "sign_in";
	}
	
	// userExist
	@PostMapping("/login")
	public String login(@ModelAttribute Users user, Model m) {
		
		System.out.println("Form Email: " + user.getEmail());
	    System.out.println("Form Password: " + user.getPassword());
		
		Users loginUser = users.userLogin(user);
		
		if (loginUser != null) {
			m.addAttribute("success", "Login successfully...");
			
			return "sign_in";
		} 
		else {
			m.addAttribute("errormsg", "Wrong credentials write the correct one...");
			return "sign_in";
		}
	}

}
