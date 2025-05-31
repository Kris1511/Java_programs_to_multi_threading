package SecureAuthX.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String postReg(@ModelAttribute SecureEntities se, Model m) {
		
		String username = se.getUsername();
		
		boolean userExist = service.userExist(username);
		
		if (userExist == false) {
			service.addRegister(se);
			m.addAttribute("regMsg", "Register successfully...");	
			return "register";
		} else {
			m.addAttribute("regMsg", "User already exist...");
			return "register";
		}		
		
		
	}
	
	@GetMapping("/sign_in")
	public String openLogin() {
		return "login";
	}
	
	@PostMapping("/login")
	public String postLogin(@ModelAttribute SecureEntities se, Model m) {
		
		System.out.println("Email: " + se.getUsername());
		System.out.println("Password: " + se.getPassword());
				
		SecureEntities entity = service.addLogin(se);
		
		if (entity != null) {
			m.addAttribute("success", "Login successfully...");
			return "login";
		} else {
			m.addAttribute("errormsg", "Wrong credentials write the correct one...");			
			return "login";
		}
	}

}
