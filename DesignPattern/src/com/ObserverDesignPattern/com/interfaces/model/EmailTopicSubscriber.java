package com.ObserverDesignPattern.com.interfaces.model;

import com.ObserverDesignPattern.com.interfaces.Observer;
import com.ObserverDesignPattern.com.interfaces.Subject;

public class EmailTopicSubscriber implements Observer {
		private String name; //name of a topic
	//Reference to our subject class
		private Subject topic;

	public EmailTopicSubscriber(String name) {
		super();
		setName(name);
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public void update() {
		String msg=(String)topic.getUpdate(this);
		if (msg ==null) {
			System.out.println(this.name + " No new message on this topic!" );
		}
		else {
			System.out.println(name + " Retrieving message: " + msg);
		}
		
	}

	@Override
	public void setSubject(Subject subject) {
		this.topic = subject;
		
	}

	

}
