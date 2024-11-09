package com.miscellaneous.sdp.proxy.caseb;

public class DemoProxyDPCaseb {

	public static void main(String[] args) {
		VideoDownloader vd = new ProxyVideoDownloader();
		vd.downloadVideo("Telugu");
		vd.downloadVideo("Hindi");
		vd.downloadVideo("English");
		vd.downloadVideo("Telugu");
		vd.downloadVideo("Sanskrit");
	}

}
