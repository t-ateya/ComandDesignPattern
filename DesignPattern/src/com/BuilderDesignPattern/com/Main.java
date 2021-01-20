package com.BuilderDesignPattern.com;

public class Main {
	public static void main(String[] args) {
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(" Hello World ")
					.append("I don't know")
					.append("This is the end");
		System.out.println(stringBuilder);
		        
		
		User James = new User.UserBuilder("James", "Bond")
				
				.address("123, London")
				.age(45)
				.phoneNumber("807")
				.build();
		
		//System.out.println(James);
	} 
}
