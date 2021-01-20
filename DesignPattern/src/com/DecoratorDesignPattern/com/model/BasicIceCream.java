package com.DecoratorDesignPattern.com.model;

import com.DecoratorDesignPattern.com.interfaces.IceCream;

public class BasicIceCream implements IceCream{
	
	//Basic icream is one without flavor
	
	public BasicIceCream() {
		System.out.println("Creating basic Ice-Cream!");
	}
	
	@Override
	public double cost() {
		
		return 0.50;   //basic icecream cost is 50cent
	}
	
}
