package com.VisitorDesignPattern.com.Model;

import com.VisitorDesignPattern.com.Interfaces.Visitable;
import com.VisitorDesignPattern.com.Interfaces.Visitor;

public class Tshirt implements Visitable{
	public Tshirt(double price) {
		super();
		this.price = price;
	}

	private double price;

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
