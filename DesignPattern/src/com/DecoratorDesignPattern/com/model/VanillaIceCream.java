package com.DecoratorDesignPattern.com.model;

import com.DecoratorDesignPattern.com.interfaces.IceCream;
import com.DecoratorDesignPattern.com.interfaces.IceCreamDecorator;

public class VanillaIceCream extends IceCreamDecorator {

	public VanillaIceCream(IceCream iceCream) {
		super(iceCream);
	}
	
	@Override
	public double cost() {
		System.out.println("Adding Vanilla Ice-Cream!");
		return 1.50 + super.cost();
	}

}
