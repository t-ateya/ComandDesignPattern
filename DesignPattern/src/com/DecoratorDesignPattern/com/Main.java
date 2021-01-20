package com.DecoratorDesignPattern.com;

import com.DecoratorDesignPattern.com.interfaces.IceCream;
import com.DecoratorDesignPattern.com.model.BasicIceCream;
import com.DecoratorDesignPattern.com.model.MintIceCream;
import com.DecoratorDesignPattern.com.model.VanillaIceCream;

public class Main {

	public static void main(String[] args) {
		
		IceCream basicIceCream = new BasicIceCream();  //beauty of polymorphism
		System.out.println("Basic Ice-Cream cost $" + basicIceCream.cost());

		//Add Vanilla flavour to the order
		IceCream vanilla = new VanillaIceCream(basicIceCream); //wrapping vanilla in basic ice cream
		System.out.println("Adding vanilla-cost is: $" + vanilla.cost());
		
		//Add Mint to the order
		IceCream mint = new MintIceCream(vanilla); //wrapping vanilla in basic ice cream
		System.out.println("Adding mint-cost is: $" + mint.cost());
	}

}
