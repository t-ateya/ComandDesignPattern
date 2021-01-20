package com.DecoratorDesignPattern.com.model;
import com.DecoratorDesignPattern.com.interfaces.*;

public class ChocolateIceCream extends IceCreamDecorator {

	public ChocolateIceCream(IceCream iceCream) {
		super(iceCream);
	}
	
	@Override
	public double cost() {
		System.out.println("Adding Chocolate Ice-Cream!");
		return 1.0 + super.cost();  //super.cost() returns the cost of BasicIcream
	}

}
