package com.RemoteProxyDesignPattern.com;

public class RealBank implements Bank{

	@Override
	public void withDrawMoney(String clientName) throws Exception {
		System.out.println(clientName + " is withdrawing from the ATM...");
		
	}

}
