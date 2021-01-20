package com.IteratorDesignPattern.com.Model;

import java.util.Iterator;

import com.IteratorDesignPattern.com.Product;

public class Seller {
	
//	GeekyStoreCatalog geekyStoreCatalog;
//	DevStoreCatalog devStoreCatalog;
	Catalog geekyStoreCatalog;
	Catalog devStoreCatalog;
	
	public Seller(Catalog geekyStoreCatalog, Catalog devStoreCatalog){
		this.geekyStoreCatalog = geekyStoreCatalog;
		this.devStoreCatalog =devStoreCatalog;
	}
	
	public void printCatalog() {
		//GeekyStoreIterator geekyStoreIterator = geekyStoreCatalog.createIterator();
		Iterator geekyStoreIterator = geekyStoreCatalog.createIterator();
		System.out.println("Printing Geeky Catalog:");
		printCatalog(geekyStoreIterator);
		
		System.out.println("Printing Dev Catalog: ");
		
		//DevStoreIterator devStoreIterator  = devStoreCatalog.createIterator();
		Iterator devStoreIterator = devStoreCatalog.createIterator();
		printCatalog(devStoreIterator);
		
	}
	
//	private void printCatalog(DevStoreIterator iterator) {
//		while(iterator.hasNext()) {
//			Product product = (Product)iterator.next();
//			System.out.print(product.getName() + ", ");
//			System.out.print(product.getDescription() + " ");
//			System.out.println(product.getPrice());
//		}
		
//	}
	
	
	private void printCatalog(Iterator iterator) {
		while(iterator.hasNext()) {
			Product product = (Product)iterator.next();
			System.out.print(product.getName() + ", ");
			System.out.print(product.getDescription() + " ");
			System.out.println(product.getPrice());
		}
	}
}
