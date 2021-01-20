package com.FactoryDesignPattern.com;

import com.FactoryDesignPattern.com.interfaces.HamburgerStore;
import com.FactoryDesignPattern.com.model.Hamburger;
import com.FactoryDesignPattern.com.model.JamHamburgerStore;
import com.FactoryDesignPattern.com.model.MozHamburgerStore;

public class Main {
	public static void main(String[] args) {
		
		HamburgerStore mozambicanBurgerStore = new MozHamburgerStore();
		
		HamburgerStore jamaicanBurgerStore  = new JamHamburgerStore();
		
		Hamburger hamburger = mozambicanBurgerStore.orderHamburger("cheese");
		
		System.out.println("Paulo ordered " + hamburger.getName());
		
		hamburger = jamaicanBurgerStore.orderHamburger("veggie");
		
		System.out.println("James Bond ordered: " + hamburger.getName() + "\n");
	}

}
