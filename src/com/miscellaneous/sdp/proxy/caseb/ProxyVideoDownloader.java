package com.miscellaneous.sdp.proxy.caseb;

import java.util.HashSet;
import java.util.Set;

public class ProxyVideoDownloader implements VideoDownloader {
	
	private final Set<String> videoSet = new HashSet<>();
	private final VideoDownloader videoDownlaoder = new RealVideoDownloader();

	@Override
	public void downloadVideo(String videoName) {
		if(videoSet.contains(videoName)) {
			System.out.println(videoName + " :: has already been downloaded");
		} else {
			videoDownlaoder.downloadVideo(videoName);
			videoSet.add(videoName);
		}
		
	}

}
