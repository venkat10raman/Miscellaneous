package com.miscellaneous.cfuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class RunAsync {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool();
		Runnable runnable = () -> {
			delay(1);
			System.out.println("I am in Runnable - " + Thread.currentThread().getName());
		};
		
		CompletableFuture<Void> completableFuture = 
				CompletableFuture.runAsync(runnable, executorService);
		
		System.out.println("I am in Main - " + Thread.currentThread().getName());
		
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
