package com.ObserverDesignPattern.com.interfaces.model;

import java.util.ArrayList;
import java.util.List;

import com.ObserverDesignPattern.com.interfaces.Observer;
import com.ObserverDesignPattern.com.interfaces.Subject;

public class EmailTopic implements Subject{
	
	private List<Observer>observers;
	private String message;
	
	
	public EmailTopic() {
		this.observers = new ArrayList<>();

	}

	
	@Override
	public void register(Observer observer) {
		if (observer == null) {
			throw new NullPointerException("Null Object/Observer");
		}
		
		if (!observers.contains(observer)) {//this prevents duplicate
			observers.add(observer);
		}
		
	}

	@Override
	public void unregister(Observer observer) {
		observers.remove(observer);
		
	}

	@Override
	public void notifyObservers() {
		for (Observer observer:observers) {
			observer.update();
		}
		
	}

	@Override
	public Object getUpdate(Observer observer) {
		
		return this.message;
	}
	
	public void postMessage(String msg) {
		System.out.println("Message posted to: " + msg);
		this.message = msg;
		notifyObservers();
		
	}
	
}
