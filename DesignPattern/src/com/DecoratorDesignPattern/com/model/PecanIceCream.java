package com.DecoratorDesignPattern.com.model;

import com.DecoratorDesignPattern.com.interfaces.IceCream;
import com.DecoratorDesignPattern.com.interfaces.IceCreamDecorator;

public class PecanIceCream extends IceCreamDecorator {

	public PecanIceCream(IceCream iceCream) {
		super(iceCream);
		
	}
	
	@Override 
	public double cost() {
		System.out.println("Adding Pecan Ice-Cream");
		return 2.50 + super.cost();
	}

}
