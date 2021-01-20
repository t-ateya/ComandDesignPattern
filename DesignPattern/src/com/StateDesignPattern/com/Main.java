package com.StateDesignPattern.com;

public class Main {
	public static void main(String[] args) {
		SodaMachineObviousSolution sodaMachine= new SodaMachineObviousSolution(10);
		
		sodaMachine.insertMoney();
		sodaMachine.selectSoda();
		
		System.out.println("Inventory: " + sodaMachine.count);
		
		System.out.println("=================================");
		
		sodaMachine.insertMoney();
		sodaMachine.ejectMoney();
		sodaMachine.selectSoda();
		
		System.out.println("Inventory: " + sodaMachine.count);
		
		System.out.println("=================================");
		
		sodaMachine.insertMoney();
		sodaMachine.selectSoda();
		sodaMachine.insertMoney();
		sodaMachine.selectSoda();
		sodaMachine.ejectMoney();
		
		System.out.println("Inventory: " + sodaMachine.count);
		
		System.out.println("=================================");
		
		
		
	}

}
