package com.MementoDesignPattern.com;

public class Originator {
	//This String is just to simplify our undertanding 
	//In the real application, y0ou would have an actual 
	//Java model class: Person.java, Character.java etc
	
	
	private String state;
	
	public Originator() {
		
	}
	public Originator(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	} 

	public Memento createMemento(){
		return new Memento(state);
	}
	
	public void setMemento(Memento memento) {
		state = memento.getState();
	}
}
