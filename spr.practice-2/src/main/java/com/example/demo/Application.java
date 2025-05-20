package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) {
		ApplicationContext con = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Department de = con.getBean(Department.class);
		System.out.println(de);
	}

}
