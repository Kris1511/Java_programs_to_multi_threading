package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class CalciServiceImplement implements CalciService {
	
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public int sub(int num1, int num2) {
		return num1 - num2;
	}
	
	public int mul(int num1, int num2) {
		return num1 * num2;
	}
	
	public int div(int num1, int num2) {
		return num1 / num2;
	}

}
