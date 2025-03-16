package com.miscellaneous.sdp.adaptor.casea;

public class AdaptorDemoA {

	public static void main(String[] args) {
		ChromeDriver chrome = new ChromeDriver();
		chrome.getElement();
		chrome.selectElement();
		
		FirefoxDriver fd = new FirefoxDriver();
		fd.getElement();
		fd.selectElement();
		
		EdgeDriver edgeDriver = new EdgeDriver();
		
		WebDriver wd = new WebDriverAdaptor(edgeDriver);
		wd.getElement();
		wd.selectElement();
		
		edgeDriver.findElement();
		edgeDriver.clickElement();
	}

}
