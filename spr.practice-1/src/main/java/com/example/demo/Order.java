package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Order {
	
	@Value("${order.orderName}")
	String orderName;
	
	@Value("${order.orderType}")
	String orderType;
	
	@Value("${order.price}")
	int price;
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Order(String orderName, String orderType, int price) {
		this.orderName = orderName;
		this.orderType = orderType;
		this.price = price;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Order [orderName=" + orderName + ", orderType=" + orderType + ", price=" + price + "]";
	}
}
