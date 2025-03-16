package com.miscellaneous.sdp.bridge.casea;

public class AmericanRestaurant extends Restaurant {

	protected AmericanRestaurant(Pizza pizza) {
		super(pizza);
	}

	@Override
	void addSause() {
		pizza.setSause("Super Secret Recipe");
	}

	@Override
	void addToppings() {
		pizza.setToppings("Everything");
	}

	@Override
	void makeCrust() {
		pizza.setCrust("Thick");
	}

}
