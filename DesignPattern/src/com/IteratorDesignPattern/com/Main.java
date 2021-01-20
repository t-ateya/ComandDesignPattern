package com.IteratorDesignPattern.com;

import java.util.ArrayList;

import com.IteratorDesignPattern.com.Model.Catalog;
import com.IteratorDesignPattern.com.Model.DevStoreCatalog;
import com.IteratorDesignPattern.com.Model.GeekyStoreCatalog;
import com.IteratorDesignPattern.com.Model.Seller;

public class Main {

	public static void main(String[] args) {
		
		Catalog devStoreCatalog =  new DevStoreCatalog();
		
		//Product[]devCatalog = devStoreCatalog.getCatalog();
		
		
		Catalog geekyStoreCatalog = new GeekyStoreCatalog();
		
		//ArrayList geekyCatalog = geekyStoreCatalog.getCatalog();

		Seller seller = new Seller(geekyStoreCatalog, devStoreCatalog); //Seller here represents the client
		
		seller.printCatalog();
		
//		//Looping through Dev Catalog Array
//		for (int i = 0; i<devCatalog.length; i++) {
//			Product product = devCatalog[i];
//			System.out.println(product.getName() + " ");
//			System.out.println(product.getDescription() + " ");
//			System.out.println(product.getPrice());
//		}
//		
//		System.out.println("===================================");
//		//loop through geeky catalog -Arraylist
//		for (int i = 0 ; i<geekyCatalog.size(); i++) {
//			Product product =(Product) geekyCatalog.get(i);
//			System.out.println(product.getName() +  " ");
//			System.out.println(product.getDescription() + " ");
//			System.out.println(product.getPrice());
//		}
//		

	}

}
