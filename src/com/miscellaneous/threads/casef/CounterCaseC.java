package com.miscellaneous.threads.casef;

public class CounterCaseC {

	// Shared variable
	private static int count = 0;

	public static synchronized void increment() {
		count++;
	}

	public static synchronized int getCount() {
		return count;
	}

	public static void main(String[] args) throws InterruptedException {

		Runnable counterA = ()->{
			for (int i = 0; i < 1000; i++) {
				CounterCaseC.increment();
            }
		};
		
		Runnable counterB = ()->{
			for (int i = 0; i < 1000; i++) {
				CounterCaseC.increment();
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
        System.out.println("Counter: " + CounterCaseC.getCount());
	}

}
