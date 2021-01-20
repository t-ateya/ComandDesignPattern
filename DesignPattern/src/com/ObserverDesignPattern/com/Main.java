package com.ObserverDesignPattern.com;

import com.ObserverDesignPattern.com.interfaces.Observer;
import com.ObserverDesignPattern.com.interfaces.model.EmailTopic;
import com.ObserverDesignPattern.com.interfaces.model.EmailTopicSubscriber;

public class Main {

	public static void main(String[] args) {
		EmailTopic topic = new EmailTopic();
		
		//Create Observer
		Observer firstObserver = new EmailTopicSubscriber("firstObserver");
		Observer secondObserver = new EmailTopicSubscriber("secondObserver");
		Observer thirdObserver = new EmailTopicSubscriber("thirdObserver");
		
		//Register Observers
		topic.register(firstObserver);
		topic.register(secondObserver);
		topic.register(thirdObserver);
		
		//Attaching observer to subject 
		firstObserver.setSubject(topic);
		secondObserver.setSubject(topic);
		thirdObserver.setSubject(topic);
		
		//Check for update 
		firstObserver.update();
		secondObserver.update();
		thirdObserver.update();
		
		
		//Provider / Subject / (broadcaster)
		topic.postMessage("Hellow Subcribers!");
		
		
		topic.unregister(firstObserver);
		topic.postMessage("Hellow Subcribers!");
		

	}

}
