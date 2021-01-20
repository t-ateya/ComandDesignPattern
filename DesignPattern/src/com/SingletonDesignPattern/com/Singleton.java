package com.SingletonDesignPattern.com;

public class Singleton {
	//Eagerly creating Singleton class
	//private static Singleton uniqueInstance = new Singleton();
	private volatile static Singleton uniqueInstance;
	String name;
	
	private Singleton() {
		
	}
	
//	public static Singleton getInstance() {
//		return uniqueInstance;
//	}
	
	
	//Double check locking
	public static Singleton getInstance() {
		if (uniqueInstance==null) {
			synchronized((Singleton.class)) {
				if (uniqueInstance ==null) {
					uniqueInstance = new Singleton();
				}
			}
		}
		return uniqueInstance;
	}
	
}

