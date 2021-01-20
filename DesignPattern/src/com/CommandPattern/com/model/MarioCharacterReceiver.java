package com.CommandPattern.com.model;

public class MarioCharacterReceiver {
	private String name;
	
	//function defs
	public void moveUp() {
		System.out.println(getName() + " moving up!");
	}
	
	public void moveDown() {
		System.out.println(getName() + " moving down !");
	}
	
	public void moveRight() {
		System.out.println(getName() + " moving right!");
	}
	
	public void moveLeft() {
		System.out.println(getName() + " moving left!");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
