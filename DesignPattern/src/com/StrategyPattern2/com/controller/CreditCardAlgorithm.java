package com.StrategyPattern2.com.controller;

public class CreditCardAlgorithm implements Payment{
	
	private String name;
	private String cardNumber;
	
	public CreditCardAlgorithm(String name, String cardNumber) {
		super();
		setName(name);
		setCardNumber(cardNumber);
	}

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCardNumber() {
		return cardNumber;
	}


	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	@Override 
	public void pay(int amount) {
		System.out.println(amount + " paid with Card ");
		
	}
	
	
}
