package com.miscellaneous.threads.casef;

public class CounterCaseD {

	// Shared variable
	private static int count = 0;

	public static void increment() {
		// Synchronize only this block
		synchronized (CounterCaseD.class) {
			count++;
		}
	}

	public static int getCount() {
		synchronized (CounterCaseD.class) {
			return count;
		}
	}

	public static void main(String[] args) throws InterruptedException {
		
		Runnable counterA = ()->{
			for (int i = 0; i < 1000; i++) {
				CounterCaseD.increment();
            }
		};
		
		Runnable counterB = ()->{
			for (int i = 0; i < 1000; i++) {
				CounterCaseD.increment();
            }
		};
		
		Thread t1 = new Thread(counterA);
		Thread t2 = new Thread(counterB);
		
		
		t1.start();
		t2.start();
		
		// main thread waiting for threads to finish
		t1.join();
		t2.join();
		
		// Print final counter value
        System.out.println("Counter: " + CounterCaseD.getCount());
	}

}
