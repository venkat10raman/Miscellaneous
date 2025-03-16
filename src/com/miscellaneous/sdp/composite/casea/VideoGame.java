package com.miscellaneous.sdp.composite.casea;

public class VideoGame extends Product {

	protected VideoGame(String title, double price) {
		super(title, price);
	}

	@Override
	public double calculatePrice() {
		return getPrice();
	}

}
