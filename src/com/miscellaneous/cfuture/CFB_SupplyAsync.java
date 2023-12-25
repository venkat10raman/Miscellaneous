package com.miscellaneous.cfuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public class CFB_SupplyAsync {

	public static void main(String[] args) {
		
		//why supplier-functional interface, bcoz
		//supplyAsync method input argument is Supplier<R>
		//Supplier<R> interface excepts no input
		//but returns output
		Supplier<String> supplier = () -> {
			delay(1);
			System.out.println("I am in Supplier - " + Thread.currentThread().getName());
			return "Hello from Supplier";
		};
		
		
		//supplyAsync method input argument is Supplier<R>
		//it excepts no input but it returns output
		CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(supplier);
		
		System.out.println("I am in Main - " + Thread.currentThread().getName());
		
		// returns the result when complete,
		// or throws and (unchecked) exception,
		// if it runs into any
		String value = completableFuture.join();
		
		System.out.println("Value - "+value);
	}
	
	private static void delay(int seconds) {
		try {
			TimeUnit.SECONDS.sleep(seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
