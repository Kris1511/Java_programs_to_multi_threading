package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	
	@Autowired
	Order order;

	@Override
	public String toString() {
		return "Customer [order=" + order + "]";
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Customer(Order order) {
		super();
		this.order = order;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

}
