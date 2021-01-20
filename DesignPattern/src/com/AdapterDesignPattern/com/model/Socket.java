package com.AdapterDesignPattern.com.model;

public class Socket {
	
	public Volt getVolt() {
		return new Volt(120);
	}

}
