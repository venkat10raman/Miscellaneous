package com.miscellaneous.sdp.bridge.casea;

public abstract class Restaurant {
	
	protected Pizza pizza;
	
	protected Restaurant(Pizza pizza) {
		this.pizza = pizza;
	}
	
	abstract void addSause();
	abstract void addToppings();
	abstract void makeCrust();
	
	public void deliver() {
		makeCrust();
		addSause();
		addToppings();
		pizza.assemble();
		pizza.qualityCheck();
		System.out.println("Order in Progress!");
	}

}
