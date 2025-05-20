package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class NavController {
	
	@GetMapping("/greet")
	public String greet() {
		System.out.println("Data Received");
		return "Have a good day!";
	}
	
	@GetMapping("/welcome")
	public String welcomePage() {
		System.out.println("welcome received");
		return "Welcome to the home page!";
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello from server";
	}
	
	@GetMapping("/acceptData")
	public String acceptData(@RequestParam String data) {
		System.out.println(data + " Data received");
		return "accept data: " + data;
	}
	
	@GetMapping("/companyData")
	public String data(@RequestParam String datas) {
		System.out.println(datas + " received");
		return "received data :" + datas;
	}
	
	@GetMapping("/company")
	public String companyName(@RequestParam String name) {
		return "This company Infosys from " + name;
	}

}
