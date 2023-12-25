package com.miscellaneous.cfuture;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {

	public static void main(String[] args) throws InterruptedException {

		// Let us create task that is going to
		// wait for 2 threads before it starts
		CyclicBarrier barrier = new CyclicBarrier(4);

		// Creating worker threads
		CBWorker one = new CBWorker(1000, barrier);
		CBWorker two = new CBWorker(1000, barrier);
		CBWorker three = new CBWorker(1000, barrier);
		CBWorker four = new CBWorker(1000, barrier);

		Thread t1 = new Thread(one);
		Thread t2 = new Thread(two);
		Thread t3 = new Thread(three);
		Thread t4 = new Thread(four);

		t1.setName("WORKER-1");
		t2.setName("WORKER-2");
		t3.setName("WORKER-3");
		t4.setName("WORKER-4");


		// Starting above 4 threads
		t1.start();
		t2.start();
		t3.start();
		t4.start();

		// Main thread has started
		System.out.println(Thread.currentThread().getName()
				+ " has finished");
	}

}

/*
 * A class to represent threads 
 * for which the main thread waits
 */
class CBWorker implements Runnable {
	
	private int waitTime;
	private CyclicBarrier barrier;

	public CBWorker(int waitTime, CyclicBarrier barrier) {
		this.waitTime = waitTime;
		this.barrier = barrier;
	}

	@Override
	public void run() {
		System.out.println("Service Started " + Thread.currentThread().getName());
		for(int i = 0 ; i < 5 ; i++ ) {
			try {
				Thread.sleep(waitTime);
				System.out.println(Thread.currentThread().getName() + " ::: " + i);
				barrier.await();
			} catch (InterruptedException | BrokenBarrierException e) {
				System.out.println("Exception handled in runnable");
			}
		}
		System.out.println("Service Completed " + Thread.currentThread().getName());

	}

}
