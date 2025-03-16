package com.miscellaneous.sdp.bridge.casea;

public class ItalianRestaurant extends Restaurant {

	protected ItalianRestaurant(Pizza pizza) {
		super(pizza);
	}

	@Override
	void addSause() {
		pizza.setSause("Oil");
	}

	@Override
	void addToppings() {
		pizza.setToppings(null);
	}

	@Override
	void makeCrust() {
		pizza.setCrust("Thin");
	}

}
