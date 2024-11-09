package com.miscellaneous.sdp.proxy.casea;

public class DemoProxyDPCaseA {

	public static void main(String[] args) {
		Internet internet = new ProxyInternet();
		internet.connectTo("google.com");
		internet.connectTo("banned.com");
	}

}
