package com.miscellaneous.sdp.bridge.casea;

public class VeggiePizza extends Pizza {

	@Override
	public void assemble() {
		System.out.println("Adding sause :: " + sause);
		System.out.println("Adding toppings :: " + toppings);
		System.out.println("Adding crust :: " + crust);
	}

	@Override
	public void qualityCheck() {
		System.out.println("Crust is :: " + crust);
	}

}
