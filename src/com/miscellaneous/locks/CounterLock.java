package com.miscellaneous.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import com.miscellaneous.threads.casef.CounterCaseC;

public class CounterLock {
	
	private final Lock lock = new ReentrantLock();
	private int count =0;
	
	private void increment() {
		lock.lock();
		try {
			count++;
		} finally {
			lock.unlock();
		}
	}
	
	private int getCount() {
		lock.lock();
		try {
			return count;
		} finally {
			lock.unlock();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		CounterLock counter = new CounterLock();
		Runnable task = () -> {
			for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
		};
		
		Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Final count: " + counter.getCount());  // Should be 2000
	}

}
