package com.StateDesignPattern.com;

import com.StateDesignPattern.com.Models.SodaVendingMachine;

public class RealSolutionTestRunner {

	public static void main(String[] args) {
	
		SodaVendingMachine sodaVendingMachine = new SodaVendingMachine(10);
		
		System.out.println(sodaVendingMachine);
		
		sodaVendingMachine.insertMoney();
		sodaVendingMachine.selectSoda();
		
		System.out.println(sodaVendingMachine);
		
		sodaVendingMachine.insertMoney();
		sodaVendingMachine.selectSoda();
		
		System.out.println(sodaVendingMachine);
		
		
	}

}
