package com.miscellaneous.threads.casef;

public class CounterCaseB {
	
	// Shared variable
	private int count = 0;
	
	public void increment() {
		// Synchronize only this block
		synchronized (this) {
			count++;
		}
	}
	
	public int getCount() {
		synchronized (this) {
			return this.count;
		}
	}

	public static void main(String[] args) throws InterruptedException {

		// Shared resource
		CounterCaseB counter = new CounterCaseB();
		
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
		
		// main thread waiting for threads to finish
		t1.join();
		t2.join();
		
		// Print final counter value
        System.out.println("Counter: " + counter.getCount());
	}

}
