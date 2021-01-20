package com.PrototypeDesignPattern.com;

import com.PrototypeDesignPattern.com.CloneableInterface.Model.Persons;

public class Main {

	public static void main(String[] args) {
		
//		Person bonni = new Person("bonni", 21);
//		System.out.println("Person 1: " + bonni);
//		
//		Person nina = (Person)bonni.clone();
//		nina.setName("Nina");
//		System.out.println("Person 2: " + nina);
//		
//		Dolphin jerry = new Dolphin ("jerry", 78);
//		System.out.println("Dolphin 1: " + jerry);
//		
//		Dolphin sam = (Dolphin)jerry.clone();
//		System.out.println("Dolphin 2: " + sam);
		
		
		Persons firstperson = new Persons("Ateya", 45);
		System.out.println("Person 1: " + firstperson);
		
		Persons secondPerson = (Persons)firstperson.clone();
		//secondPerson.setName("Arrey");
		System.out.println("Person 2: " + secondPerson);
		
		System.out.println(System.identityHashCode(firstperson) + "\n"
				+ System.identityHashCode(secondPerson)); //have different memory hashcodes indicating that there are in diff locations

	}

}
