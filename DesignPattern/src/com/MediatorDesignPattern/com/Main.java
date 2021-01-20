package com.MediatorDesignPattern.com;

public class Main {

	public static void main(String[] args) {
		
		//Main is the client or Test Driving class
		
		ATCMediator mediator = new ATCMediatorImpl();
		
		//Create a few airCrafts
		AirCraft boeing = new AirCraftImpl(mediator, "Boeing");
		AirCraft helicopter = new AirCraftImpl(mediator, "Fly Emirates");
		AirCraft boeing707 = new AirCraftImpl(mediator, "Boeing 707");
		
		
		//Adding aircrafts to mediator
		mediator.addAircraft(boeing);
		mediator.addAircraft(helicopter);
		mediator.addAircraft(boeing707);
		
		boeing.send("Hello from Boeing air plane");
		

	}

}
