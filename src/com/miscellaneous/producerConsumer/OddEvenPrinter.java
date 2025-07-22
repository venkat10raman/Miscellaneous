package com.miscellaneous.producerConsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OddEvenPrinter {
	
	private final int limit;
    private volatile int counter = 1;
    private final Object lock = new Object();
    
    public OddEvenPrinter(int limit) {
        if (limit <= 0) {
            throw new IllegalArgumentException("Limit must be positive");
        }
        this.limit = limit;
    }
    
    private void printOdd() {
    	while(counter <= limit) {
    		synchronized (lock) {
    			if(counter %2 == 1) {
    				System.out.println(Thread.currentThread().getName() + ": " + counter);
                    counter++;
                    lock.notify();
    			} else {
    				try {
    					lock.wait();
					} catch (InterruptedException e) {
						Thread.currentThread().interrupt();
                        System.err.println("Odd thread interrupted");
                        return;
					}
    			}
			}
    	}
    }
    
    private void printEven() {
    	while(counter <= limit) {
    		synchronized (lock) {
    			if(counter %2 == 0) {
    				System.out.println(Thread.currentThread().getName() + ": " + counter);
                    counter++;
                    lock.notify();
    			} else {
    				try {
    					lock.wait();
					} catch (InterruptedException e) {
						Thread.currentThread().interrupt();
                        System.err.println("Even thread interrupted");
                        return;
					}
    			}
			}
    	}
    }

	public static void main(String[] args) {
		int limit = 20;
        OddEvenPrinter printer = new OddEvenPrinter(limit);
        ExecutorService executor = Executors.newFixedThreadPool(2);
        
        executor.submit(() -> {
            Thread.currentThread().setName("Odd-Thread");
            printer.printOdd();
        });
        
        executor.submit(() -> {
            Thread.currentThread().setName("Even-Thread");
            printer.printEven();
        });

        // Shutdown executor
        executor.shutdown();
	}

}
