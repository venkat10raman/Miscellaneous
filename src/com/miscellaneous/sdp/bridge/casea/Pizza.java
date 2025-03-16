package com.miscellaneous.sdp.bridge.casea;

public abstract class Pizza {
	
	protected String sause;
	protected String toppings;
	protected String crust;
	
	public abstract void assemble();
	public abstract void qualityCheck();
	
	public void setSause(String sause) {
		this.sause = sause;
	}
	public void setToppings(String toppings) {
		this.toppings = toppings;
	}
	public void setCrust(String crust) {
		this.crust = crust;
	}

}
