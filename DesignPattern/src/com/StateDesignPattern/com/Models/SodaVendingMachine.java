package com.StateDesignPattern.com.Models;

import com.StateDesignPattern.com.interfaces.State;

public class SodaVendingMachine {
	//Composition
	State soldOutState;
	State noMoneyState;
	State hasMoneyState;
	State soldState;
	
	State state = soldOutState;
	int count = 0;
	
	public SodaVendingMachine(int numberOfSodas) {
		soldOutState=new SoldOutState(this);
		noMoneyState = new NoMoneyState(this);
		hasMoneyState = new HasMoneyState(this);
		soldState = new SoldState(this);
		
		this.count = numberOfSodas;
		
		if (numberOfSodas>0) {
			state = noMoneyState;  //if there are no more than 0 sodas, we set the state to the no money state
		}
	}
	
	
	//Actions
	public void insertMoney() {	state.insertMoney();}
	
	public void ejectMoney() {state.ejectMoney();}
	
	public void selectSoda() {state.select();}
	
	public void dispense() {state.dispense();}
	
	public int getCount() {return count;}
	
	public void setCount(int count) {this.count = count;}

	public State getState() {	return state;}

	public void setState(State state) {this.state = state;}

	public State getSoldOutState() {return soldOutState;}

	public void setSoldOutState(State soldOutState) {this.soldOutState = soldOutState;}

	public State getNoMoneyState() {return noMoneyState;}

	public void setNoMoneyState(State noMoneyState) {this.noMoneyState = noMoneyState;}

	public State getHasMoneyState() {return hasMoneyState;}

	public void setHasMoneyState(State hasMoneyState) {this.hasMoneyState = hasMoneyState;}

	public State getSoldState() {return soldState;}

	public void setSoldState(State soldState) {this.soldState = soldState;}

	@Override 
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nThe SodaMachine, Co");
		result.append("\nInventory: " + count + " soda");
		if (count !=1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Soda Vending Machine is " + state + "\n");
		
		return result.toString();
		
	}
	
}
