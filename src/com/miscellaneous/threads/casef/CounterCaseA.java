package com.miscellaneous.threads.casef;

public class CounterCaseA {

	// Shared variable
	private int count = 0; 

	// Synchronized method to increment counter
	public synchronized void increment() {
		count++;
	}

	// Synchronized method to get counter value
	public synchronized int getCount() {
		return count;
	}
	
	public static void main(String[] args) throws InterruptedException {
		CounterCaseA counter = new CounterCaseA();
		
		Runnable counterA = ()->{
			for (int i = 0; i < 1000; i++) {
				counter.increment();
            }
		};
		
		Runnable counterB = ()->{
			for (int i = 0; i < 1000; i++) {
				counter.increment();
            }
		};
		
		Thread t1 = new Thread(counterA);
		Thread t2 = new Thread(counterB);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		// Print final counter value
        System.out.println("Counter: " + counter.getCount());
		
	}
}
