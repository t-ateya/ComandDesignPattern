package com.StrategyPattern2.com.controller;

import java.util.ArrayList;
import java.util.List;

import com.StrategyPattern2.com.model.Product;

public class ShoppingCart {
		
	
	List<Product>productList;
	
	public ShoppingCart() {
		this.productList = new ArrayList<Product>();
	}
	
	public void addProduct(Product product) {
		productList.add(product);
	}
	
	public void removeProduct(Product product) {
		productList.remove(product);
	}
	
	
	public int calculateTotalCost() {
		int sum = 0;
		for (Product product: productList) {
			sum+=product.getPrice();
		}
		return sum;
	}
	
	public void pay(Payment paymentStrategy) {
		int amount = calculateTotalCost();
		paymentStrategy.pay(amount);
	}
	
	
	
}

