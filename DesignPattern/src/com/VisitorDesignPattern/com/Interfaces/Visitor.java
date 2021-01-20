package com.VisitorDesignPattern.com.Interfaces;

import com.VisitorDesignPattern.com.Model.*;

public interface Visitor {
	double Visitor (Shirt shirtItem);
	
	double Visitor (Tshirt tShirtItem);
	
	double Visitor (Jacket jacketItem);
	
	

}
