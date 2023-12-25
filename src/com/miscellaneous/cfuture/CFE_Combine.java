package com.miscellaneous.cfuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

/*
thenCombine() method is used to run two independent CFs
parallelly and combine to perform an action, which waits
for response from two CFs 

It takes completionStage and BiFunction<T,U,V> as arguments

in simple words if A B are 2 independent CFs
C is an action uses response from both A and B CFs
we run A B parallely and later perform C
we club these 3 items using thenCombine()
to form one CF
*/


public class CFE_Combine {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		CompletableFuture<String> future = getUserEmail()
			.thenCombine(getWeatherReport(), (email, report) -> {
				return sendMailToUser(email, report);
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
	
	private static String sendMailToUser(String mailId, String report){
		System.out.println("Sending email to " + mailId + " with report - " + report);
		delay(1);
		return mailId+report;
	}
	
	private static void delay(int seconds) {
		try {
			TimeUnit.SECONDS.sleep(seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
