package com.FactoryDesignPattern.com.model;

public class JamaicanVeggieBurger extends Hamburger {
 
	public JamaicanVeggieBurger() {
		name = "Jamaican Style veggie Burger ";
		sauce = "Spicy jamaican sauce";
		buns = "lettuce wrap!";
	}

	@Override
	public void cook() {
		System.out.println("Cooking Jamaican Style...");
	}
}
