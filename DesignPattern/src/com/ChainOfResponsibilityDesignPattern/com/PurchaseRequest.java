package com.ChainOfResponsibilityDesignPattern.com;

public class PurchaseRequest {
	public PurchaseRequest(double amount, String purpose) {
		super();
		this.amount = amount;
		this.purpose = purpose;
	}
	private double amount;
	private  String purpose; //why are you requesting this amount
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

}
