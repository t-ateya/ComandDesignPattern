package com.ChainOfResponsibilityDesignPattern.com;

public class DirectorPurchasePower extends PurchasePower {

	@Override
	protected double getAllowable() {
		
		return BASE*20;
	}

	@Override
	protected String getRole() {
		
		return "Director";
	}
	

}
