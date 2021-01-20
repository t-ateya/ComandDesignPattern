package com.MementoDesignPattern.com;

public class Memento {
	public Memento(String state) {
		
		this.state = state;
	}

	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
