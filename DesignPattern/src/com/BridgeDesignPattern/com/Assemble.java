package com.BridgeDesignPattern.com;

public class Assemble implements WorkShop{
	
	@Override
	public void make() {
		System.out.println("...also");
		System.out.println("Assemble");
	}

}
