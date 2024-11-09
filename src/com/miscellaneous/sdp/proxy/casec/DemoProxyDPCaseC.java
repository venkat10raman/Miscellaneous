package com.miscellaneous.sdp.proxy.casec;

public class DemoProxyDPCaseC {

	public static void main(String[] args) {
		Internet internet = new ProxyInternet();
		internet.connectTo("google.com");
		internet.connectTo("banned.com");
	}

}
