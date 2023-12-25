package com.miscellaneous.cfuture;

import java.util.concurrent.CompletableFuture;

/*
handle() method takes BiFunction which is executed when stage
completes either normally and exceptionally

It takes result and exception as arguments

it is like finally-block but with arguments
-------------------------------------------

exceptionally() method takes Function as argument
which is executed when stage is completed exceptionally

exception is argument
*/

public class CFH_ExceptionHandling {
	
	public static void main(String[] args) {
		boolean cfh = false;
		boolean cfe = true;
		CompletableFuture<String> futureHandle = CompletableFuture.supplyAsync(() -> {
			if(cfh) throw new RuntimeException("Error@FutureHandle");
			return "success-cfh";
		}).handle((s,e)->{
			if(e != null) {
				System.out.println(e.getMessage());
				return "CFH-Exception";
			}
			return s;
		});
		
		CompletableFuture<String> futureExceptionally = CompletableFuture.supplyAsync(() -> {
			if(cfe) throw new RuntimeException("Error@FutureExceptionally");
			return "success-cfe";
		}).exceptionally(e -> {
			System.out.println(e.getMessage());
			return "CFE-Exception";
		});
		System.out.println(futureHandle.join());
		System.out.println(futureExceptionally.join());
	}

}
