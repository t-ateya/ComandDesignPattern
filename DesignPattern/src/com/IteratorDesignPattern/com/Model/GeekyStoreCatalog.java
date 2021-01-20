package com.IteratorDesignPattern.com.Model;

import java.util.ArrayList;

import com.IteratorDesignPattern.com.Product;

public class GeekyStoreCatalog implements Catalog {
	private ArrayList <Product>catalog;

	
	
	public GeekyStoreCatalog() {
		catalog = new ArrayList<>();
		
		
		//Add a few products to catalog
		addItem("Superman Comic", "The best in town", 12.99);
		addItem("Batman Comic", "OKAY, but still good", 11.99);
		addItem("Star Wars", "Can't live withouh it", 39.99);
		addItem("Jedi T-shirt", "Gotta have it", 29.99);
	}
	
	
	public void addItem(String name, String description, double price) {
		Product product = new Product(name, description, price);
		catalog.add(product);
	}
	
	
	public ArrayList<Product>getCatalog(){
		return catalog;
	}
	
	public GeekyStoreIterator createIterator() {
		return new GeekyStoreIterator(catalog);
	}
}
