package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) {
		ApplicationContext con = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Course cus = con.getBean(Course.class);
		System.out.println(cus);
	}

}
