package com.VisitorDesignPattern.com.Model;

import com.VisitorDesignPattern.com.Interfaces.Visitable;
import com.VisitorDesignPattern.com.Interfaces.Visitor;

public class Shirt implements Visitable {
	private double price;
	
	public Shirt(double price) {
		setPrice(price);
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public double accept(Visitor visitor) {
		
		return visitor.Visitor(this);
	}

}
