package com.miscellaneous.sdp.proxy.casea;

public class RealInternet implements Internet {

	@Override
	public void connectTo(String host) {
		System.out.println("Opened the connection to :: " + host);
	}

}
