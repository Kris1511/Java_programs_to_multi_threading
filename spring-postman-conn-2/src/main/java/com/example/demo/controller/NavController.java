package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Employee;
import com.example.demo.entities.Student;

@RestController
public class NavController {
	
	@PostMapping("/manageObject")
	public Student manageObject(@RequestBody Student st) {
		System.out.println("data received.");
		return st;
	}
	
	@PostMapping("/manageEmployee")
	public Employee manageEmp(@RequestBody Employee emp) {
		System.out.println("Employee data received.");
		return emp;
	}

}
