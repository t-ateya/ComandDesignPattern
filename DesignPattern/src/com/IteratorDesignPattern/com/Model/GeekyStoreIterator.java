package com.IteratorDesignPattern.com.Model;

import java.util.ArrayList;
import java.util.Iterator;

import com.IteratorDesignPattern.com.Product;


public class GeekyStoreIterator implements Iterator {
	ArrayList <Product>catalog; //composition
	int position = 0; //position of each item that has been saved.
	
	public GeekyStoreIterator(ArrayList<Product>catalog) {
		this.catalog = catalog;
	}
	
	
	@Override
	public boolean hasNext() {
		if (position>=catalog.size() || catalog.get(position) ==null)  { //postion above arraylist size or no product at a certain position
			return false;
			
		}else return true;
	}

	@Override
	public Object next() {
		Product product = catalog.get(position);
		position = position + 1;
		return product;
	}
	

}
