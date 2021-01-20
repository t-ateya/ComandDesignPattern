package com.MediatorDesignPattern.com;

import java.util.ArrayList;
import java.util.List;

public class ATCMediatorImpl implements ATCMediator {
	
	private List<AirCraft> airCraftList; //contains list of all airCrafts
	public ATCMediatorImpl() {
		this.airCraftList = new ArrayList<AirCraft>(); //new ArrayList<>() also works
	}

	@Override
	public void sendMessage(String msg, AirCraft airCraft) {
		//We need to loop through all our aircrafts
		for (AirCraft a: airCraftList) {
			//message should not be received by the airCraft sending the message
			if (a != airCraft) {
				a.receive(msg);
			}
		}
		
	}

	@Override
	public void addAircraft(AirCraft airCraft) {
		airCraftList.add(airCraft);
		
	}

}
