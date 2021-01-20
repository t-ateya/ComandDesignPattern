package com.BridgeDesignPattern.com;

public abstract class Vehicle {
	protected WorkShop workShop;
	protected WorkShop workShop2;
	
	public Vehicle (WorkShop workShop, WorkShop workShop2) {
		this.workShop = workShop;
		this.workShop = workShop2;
	}
	
	public abstract void manufacture();
}
