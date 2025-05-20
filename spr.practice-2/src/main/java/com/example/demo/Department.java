package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Department {
	
	@Autowired
	Employee emp;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(Employee emp) {
		super();
		this.emp = emp;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Department [emp=" + emp + "]";
	}
}
