package com.miscellaneous.sdp.adaptor.casea;

public class FirefoxDriver implements WebDriver {

	@Override
	public void getElement() {
		System.out.println("Get element from the Firefox Driver");
	}

	@Override
	public void selectElement() {
		System.out.println("Set element from the Firefox Driver");
	}

}
