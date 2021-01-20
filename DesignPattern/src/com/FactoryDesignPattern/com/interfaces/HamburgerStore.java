package com.FactoryDesignPattern.com.interfaces;

import com.FactoryDesignPattern.com.model.Hamburger;

public abstract class HamburgerStore {
	
	
	public Hamburger orderHamburger(String type) {
		Hamburger burger;
		
		burger = createHamburger(type);
		burger.prepare();
		burger.cook();
		burger.box();
		
		return burger;
		
	}

	abstract public Hamburger createHamburger(String type);
	
	
} 