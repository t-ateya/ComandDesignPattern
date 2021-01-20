package com.StateDesignPattern.com.Models;

import com.StateDesignPattern.com.interfaces.State;

public class HasMoneyState implements State {
	
	SodaVendingMachine sodaVendingMachine ;
	
	public HasMoneyState (SodaVendingMachine sodaVendingMachine) {
		this.sodaVendingMachine = sodaVendingMachine;
	}

	@Override
	public void insertMoney() {
		System.out.println("No need to insert another dollar bill");
		
	}

	@Override
	public void ejectMoney() {
		System.out.println("Returning your dollar");
		sodaVendingMachine.setState(sodaVendingMachine.getNoMoneyState());
		
	}

	@Override
	public void select() {
		System.out.println("Selected item...");
		sodaVendingMachine.setState(sodaVendingMachine.getSoldState());
		
	}

	@Override
	public void dispense() {
		System.out.println("No soda dispensed! ");
		
	}
	
	@Override 
	public String toString() {
		return " Waiting for a new selection...";
	}

}
