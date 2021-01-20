package com.DecoratorDesignPattern.com.model;

import com.DecoratorDesignPattern.com.interfaces.IceCream;
import com.DecoratorDesignPattern.com.interfaces.IceCreamDecorator;

public class MintIceCream extends IceCreamDecorator{

	public MintIceCream(IceCream iceCream) {
		super(iceCream);
	}

		@Override
		public double cost() {
			System.out.println("Adding Mint Ice-Cream");
			return 2.00 + super.cost();
		}
	
	
}
