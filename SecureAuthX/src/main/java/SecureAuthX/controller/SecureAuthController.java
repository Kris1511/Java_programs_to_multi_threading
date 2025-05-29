package SecureAuthX.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import SecureAuthX.entities.SecureEntities;
import SecureAuthX.services.SecureAuthService;

@Controller
public class SecureAuthController {
	
	@Autowired
	SecureAuthService service;
	
	@GetMapping("/sign_up")
	public String openReg() {
		return "register";
	}
	
	@PostMapping("/reg")
	public String postReg(@ModelAttribute SecureEntities se) {
		service.addRegister(se);
		System.out.println("Register successfully...");
		return "index";
	}
	
	@GetMapping("/sign_in")
	public String openLogin() {
		return "login";
	}
	
	@PostMapping("/login")
	public String postLogin(@ModelAttribute SecureEntities se) {
		service.addLogin(se);
		System.out.println("Login successfully..");
		return "index";
	}

}
