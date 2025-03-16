package com.miscellaneous.sdp.bridge.casea;

public class BridgeDemo {

	public static void main(String[] args) {
		AmericanRestaurant americanRestaurant = new AmericanRestaurant(new PepperoniPizza());
		americanRestaurant.deliver();
		
		ItalianRestaurant italianRestaurant = new ItalianRestaurant(new VeggiePizza());
		italianRestaurant.deliver();
	}

}
