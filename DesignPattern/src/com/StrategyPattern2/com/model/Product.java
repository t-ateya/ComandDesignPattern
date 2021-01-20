package com.StrategyPattern2.com.model;

public class Product {
	
	

	private String upcCode;
	private int price;
	
	public Product(String upcCode, int price) {
		super();
		this.upcCode = upcCode;
		this.price = price;
	}
	
	
	public String getUpcCode() {
		return upcCode;
	}
	
	public void setUpcCode(String upcCode) {
		this.upcCode = upcCode;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
