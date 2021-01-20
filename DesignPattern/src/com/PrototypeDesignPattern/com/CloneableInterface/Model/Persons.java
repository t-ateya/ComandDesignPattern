package com.PrototypeDesignPattern.com.CloneableInterface.Model;
import com.PrototypeDesignPattern.com.Prototype;

public class Persons implements Animal{
	private String name;
	private int age;
	
	
	public Persons(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Person is created! ");
	}
	
	@Override
	public Animal clone() {
		System.out.println("Creating Person...");
		Persons person = null;
		try {
			person = (Persons)super.clone();
			//person.age = 32;
			//person.name = "Ateya";
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return person;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override 
	public String toString() {
		return "Person: " + name;
	}
	
	
}
