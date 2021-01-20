package com.SingletonDesignPattern.com;

public class MyClass {
	//Eagerly creating singleton class
	private static MyClass uniqueInstance = new MyClass();
	
	String name;                     
	private  MyClass() {
		
	}
	
	
	//public static synchronized  MyClass getInstance() {
		//Adding the synchronized key word makes our Singleton thread safe.
		//if (uniqueInstance == null) {
			//uniqueInstance = new MyClass();
		//}
		
		//return uniqueInstance;
	//}
	
	public static MyClass getInstance() {
		return uniqueInstance;
		
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

}
