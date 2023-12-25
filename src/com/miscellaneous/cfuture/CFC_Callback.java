package com.miscellaneous.cfuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;


/*
thenApply, thenAccept, thenRun are the 3 methods
that can be called on a completableFuture, once
CF is done performing its work

1.thenApply() used to transform the response from CF
and return the transformed output value, its input argument
is Function<T,R>

2.thenAccept() it takes the response from CF and does does not 
return anything, its input argument is Consumer<T>

3.thenRun(), neither takes response from CF, nor it returns,
its input argument is Runnable
*/


public class CFC_Callback {
	
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
