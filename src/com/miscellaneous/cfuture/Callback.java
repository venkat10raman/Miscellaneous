package com.miscellaneous.cfuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class Callback {
	
	public static void main(String[] args) {
		CompletableFuture<Void> completableFuture = CompletableFuture.supplyAsync(() -> {
			delay(2);
			return "Tech Recipies";
		}).thenApply(s -> {
			return "Hello, " + s;
		}).thenAccept(s -> {
			System.out.println("Result : " + s);
		}).thenRun(() -> {
			System.out.println("Final Cleanup is done");
		});
		
		completableFuture.join();
	}
	
	private static void delay(int seconds) {
		try {
			TimeUnit.SECONDS.sleep(seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
