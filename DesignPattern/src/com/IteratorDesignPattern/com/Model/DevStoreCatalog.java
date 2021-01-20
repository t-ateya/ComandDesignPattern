package com.IteratorDesignPattern.com.Model;

import com.IteratorDesignPattern.com.Product;

public class DevStoreCatalog implements Catalog {
	private static final int MAX_ITEMS = 4;
	private int numberOfProducts = 0;
	
	Product[] catalog;
	public DevStoreCatalog() {
		catalog = new Product[MAX_ITEMS];
		addItem("C++ is not dead yet!", "T-Shirt", 39.99);
		addItem("Java Rocks, Yes", "Silky-Mouse-pad", 19.99);
		addItem("Web Development CookBook", "The Best Web Development Cook Book-2020", 139.99);
		addItem("Java Design Patterns", "Book-A must read!", 409.00);
	}
	
	public void addItem(String name, String description, double price) {
		Product product = new Product(name, description, price);
		if (numberOfProducts >=MAX_ITEMS) {
			System.out.println("Catalog is Full - can't add products");
		}else {
			catalog[numberOfProducts] = product;
			numberOfProducts = numberOfProducts + 1;
		}
	}
	
	
//	public Product[] getCatalog() {
//		return catalog;
//	}
	
	public DevStoreIterator createIterator() {
		return new DevStoreIterator(catalog);
	}
}
