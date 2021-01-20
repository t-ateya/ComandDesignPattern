package com.SingletonDesignPattern.com;

public class Main {
	public static void main(String [] args) {
		
//		Person person = new Person();
//		Person secondPerson = new Person();
//		
		MyClass myClass = MyClass.getInstance();
		
//		MyClass secondClass = MyClass.getInstance();
		
		myClass.name = "Class";
		
		System.out.println(myClass);
		
		
		
//		System.out.println("second Instance: " + secondClass);
//		
//		System.out.println("firtPerson Object: "+ person);
//		System.out.println("secondPerson Object: "+ secondPerson);
	}

}
