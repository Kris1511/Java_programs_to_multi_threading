package OTPAuthentication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import OTPAuthentication.entities.MailEntities;
import OTPAuthentication.serrvice.MailService;

@Controller
public class SendmailController {
	
	@Autowired
	MailService service;
	
	@PostMapping("/sendEmail")
	public String send(@ModelAttribute MailEntities mail) {
		service.sendEmail(mail);
		System.out.println(mail);
		return "index";
	}

}
