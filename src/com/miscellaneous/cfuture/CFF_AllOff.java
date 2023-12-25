package com.miscellaneous.cfuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;


/*
allOf() method takes array of CF as arguments
and execute all CF in parallell and wait untill
all the CF execute completely

its return type is CompletableFuture<Void>
*/

public class CFF_AllOff {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		CompletableFuture<Void> future = CompletableFuture.allOf(futureOne(), futureTwo(), futureThree());
		future.join();
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken " + (endTime-startTime)/1000);
	}
	
	private static CompletableFuture<String> futureOne() {
		return CompletableFuture.supplyAsync(() -> {
			System.out.println("futureOne() - " + Thread.currentThread().getName());
			delay(2);
			return "One";
		});
	}
	
	private static CompletableFuture<String> futureTwo() {
		return CompletableFuture.supplyAsync(() -> {
			System.out.println("futureTwo() - " + Thread.currentThread().getName());
			delay(4);
			return "Two";
		});
	}
	
	private static CompletableFuture<String> futureThree() {
		return CompletableFuture.supplyAsync(() -> {
			System.out.println("futureThree() - " + Thread.currentThread().getName());
			delay(1);
			return "Three";
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
