package com.miscellaneous.sdp.adaptor.casea;

public class WebDriverAdaptor implements WebDriver {
	
	private final EdgeDriver edgeDriver;
	
	public WebDriverAdaptor(EdgeDriver edgeDriver) {
		this.edgeDriver = edgeDriver;
	}

	@Override
	public void getElement() {
		edgeDriver.findElement();
	}

	@Override
	public void selectElement() {
		edgeDriver.clickElement();
	}

}
