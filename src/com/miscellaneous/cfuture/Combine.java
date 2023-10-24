package com.miscellaneous.cfuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class Combine {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		CompletableFuture<String> future = getUserEmail()
			.thenCombine(getWeatherReport(), (email, report) -> {
				System.out.println("Sending email to " + email + " with report - " + report);
				delay(1);
				return email+report;
			});
		System.out.println("Do Something...");
		delay(3);
		System.out.println(future.join());
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken " + (endTime-startTime)/1000);
	}
	
	private static CompletableFuture<String> getUserEmail() {
		return CompletableFuture.supplyAsync(() -> {
			System.out.println("getUserEmail() - " + Thread.currentThread().getName());
			delay(3);
			return "tech.recipe@yt.com";
		});
	}
	
	private static CompletableFuture<String> getWeatherReport() {
		return CompletableFuture.supplyAsync(() -> {
			System.out.println("getWeatherReport() - " + Thread.currentThread().getName());
			delay(3);
			return "Weather report of the city - Rainy";
		});
	}
	
	private static void delay(int seconds) {
		try {
			TimeUnit.SECONDS.sleep(seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
