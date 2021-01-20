package com.StateDesignPattern.com.Models;

import com.StateDesignPattern.com.interfaces.State;

public class SoldState implements State{
	
	SodaVendingMachine sodaVendingMachine; //composition
	
	SoldState(SodaVendingMachine sodaVendingMachine){
		this.sodaVendingMachine = sodaVendingMachine;
	}
	
	

	@Override
	public void insertMoney() {
		System.out.println("Give a second...soda coming right up!");
		
	}

	@Override
	public void ejectMoney() {
		System.out.println("Sorry ...soda is coming..");
		
		
	}

	@Override
	public void select() {
		System.out.println("Nope... you can't eject the money if you have the soda already");
		
	}

	@Override
	public void dispense() {
		System.out.println("Stop trying to get second soda for free ");
		if (sodaVendingMachine.getCount() > 0) {
			sodaVendingMachine.setState(sodaVendingMachine.getNoMoneyState());
		}else {
			System.out.println("Sorry!...Out of Sodas");
			sodaVendingMachine.setState(sodaVendingMachine.soldOutState);
		}
		
	}
	
	@Override 
	public String toString() {
		return "Dispensing Soda...";
	}

}
