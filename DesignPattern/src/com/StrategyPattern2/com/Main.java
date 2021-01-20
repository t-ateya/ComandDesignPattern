package com.StrategyPattern2.com;
import com.StrategyPattern2.com.controller.CreditCardAlgorithm;
import com.StrategyPattern2.com.controller.PaypalAlgorithm;
import com.StrategyPattern2.com.controller.ShoppingCart;
import com.StrategyPattern2.com.model.Product;

public class Main {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		
		Product pants = new Product("234", 25);
		Product shirt = new Product ("987", 15);
		
		cart.addProduct(pants);
		cart.addProduct(shirt);
		
		//payment decisions
		cart.pay(new PaypalAlgorithm("ateyaterence@gmail.com", "nowayman"));
		
		cart.pay(new CreditCardAlgorithm("Ateya", "1234567"));

	}

}
