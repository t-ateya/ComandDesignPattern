package com.StrategyPattern2.com.controller;

public class PaypalAlgorithm implements Payment{
	
	private String email;
	private String password;
	
	
	public PaypalAlgorithm(String email, String password) {
		setEmail(email);
		setPassword(password);
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPassword() {
		return password;
	}
	
	
	public void setEmail(String email) {
		this.email= email;
	}
	
	public void setPassword(String password) {
		this.password = password;
		
	}
	
	
	
	public void pay(int amount) {
		System.out.println(amount + "  paid with Paypal  ");
	}

}
