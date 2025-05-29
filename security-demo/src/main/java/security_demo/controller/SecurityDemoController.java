package security_demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class SecurityDemoController {
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello from spring boot";
	}
	
	@GetMapping("/good")
	public String good() {
		return "Good from spring boot";
	}
	
	@GetMapping("/morning")
	public String morning() {
		return "Morning from spring boot";
	}
	
	@GetMapping("/evening")
	public String evening() {
		return "Hello from spring boot";
	}

}
