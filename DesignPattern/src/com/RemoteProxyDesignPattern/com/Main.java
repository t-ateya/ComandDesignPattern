package com.RemoteProxyDesignPattern.com;

public class Main {

	public static void main(String[] args) {
		Bank bank = new ProxyBank();
		
		try {
			bank.withDrawMoney("Ateya");
			bank.withDrawMoney("youtube");
			
		}catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
