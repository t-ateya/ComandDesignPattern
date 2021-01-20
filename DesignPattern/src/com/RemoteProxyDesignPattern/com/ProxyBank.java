package com.RemoteProxyDesignPattern.com;

import java.util.ArrayList;
import java.util.List;

public class ProxyBank implements Bank {

		private RealBank bank = new RealBank();
		private static List <String>bannedClients;
		
		static {
			bannedClients = new ArrayList<>();
			bannedClients.add("ab");
			bannedClients.add("youtube");
			bannedClients.add("facebook");
		}
		
		
	@Override
	public void withDrawMoney(String clientName) throws Exception {
		if (bannedClients.contains(clientName.toLowerCase())){
			throw new Exception(clientName + " Access Denied! You are not who you say you are!");
		}
		
		bank.withDrawMoney(clientName);
	}

}
