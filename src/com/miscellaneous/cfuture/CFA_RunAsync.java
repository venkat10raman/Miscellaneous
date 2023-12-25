package com.miscellaneous.cfuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

//Tech Recipes youtube channel

public class CFA_RunAsync {

	public static void main(String[] args) {
		//executor-service is not mandatory
		ExecutorService executorService = Executors.newCachedThreadPool();
		Runnable runnable = () -> {
			delay(1);
			System.out.println("I am in Runnable - " + Thread.currentThread().getName());
		};
		
		
		// if you dont pass our own custom executive-service
		// by-default it will run on ForkJoinPool-executive-service
		CompletableFuture<Void> completableFuture = 
				CompletableFuture.runAsync(runnable, executorService);
		
		System.out.println("I am in Main - " + Thread.currentThread().getName());
		
		// returns the result when complete,
		// or throws and (unchecked) exception,
		// if it runs into any
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
