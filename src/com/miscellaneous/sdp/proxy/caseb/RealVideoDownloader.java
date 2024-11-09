package com.miscellaneous.sdp.proxy.caseb;

public class RealVideoDownloader implements VideoDownloader {

	@Override
	public void downloadVideo(String videoName) {
		System.out.println("connecting to https://www.youtube.com/");
		System.out.println("Downloading Video :: " + videoName);
		System.out.println("Retrieving Video Metadata");
	}

}
