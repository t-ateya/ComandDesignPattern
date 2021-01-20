package com.VisitorDesignPattern.com.Model;
import java.text.DecimalFormat;

import com.VisitorDesignPattern.com.Interfaces.*;

public class TaxVisitor implements Visitor {
	DecimalFormat decimalFormat = new DecimalFormat("#.##");
	
	public TaxVisitor() {
		
	}

	@Override
	public double Visitor(Shirt shirtItem) {
		System.out.println("Shirt final price with tax: ");
		//return Double.parseDouble(decimalFormat.format(shirtItem.getPrice()*.10) + shirtItem.getPrice());
		return (int) ((shirtItem.getPrice()*.18) + shirtItem.getPrice());
	}

	@Override
	public double Visitor(Tshirt tShirtItem) {
		System.out.println("Tshirt final price with tax: ");
		//return Double.parseDouble(decimalFormat.format(tShirtItem.getPrice()*.18) + tShirtItem.getPrice());
		return (int) ((tShirtItem.getPrice()*.20) + tShirtItem.getPrice());
	}

	@Override
	public double Visitor(Jacket jacketItem) {
		System.out.println("Jacket final price with tax: ");
		//return Double.parseDouble(decimalFormat.format(jacketItem.getPrice()*.20) + jacketItem.getPrice());
		return (int) ((jacketItem.getPrice()*.56) + jacketItem.getPrice());
	}

}
