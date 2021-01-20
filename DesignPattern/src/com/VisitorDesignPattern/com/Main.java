package com.VisitorDesignPattern.com;

import com.VisitorDesignPattern.com.Model.*;

public class Main {

	public static void main(String[] args) {
		TaxVisitor taxVisitor = new TaxVisitor();
		
		Jacket jacket = new Jacket(45.99);
		Shirt shirt = new Shirt(24.99);
		Tshirt tshirt = new Tshirt(22.89);
		
		//Use our tax Calculations
		System.out.println(jacket.accept(taxVisitor));
		System.out.println(shirt.accept(taxVisitor));
		System.out.println(tshirt.accept(taxVisitor));
		
	}

}
