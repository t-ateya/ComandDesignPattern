package com.RemoteProxyDesignPattern.com;

public interface Bank {
	public void withDrawMoney(String clientName) throws Exception;
	//We throw an exception since the proxy withdraw method works over the internet

}
