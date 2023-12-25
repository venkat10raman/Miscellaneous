package com.miscellaneous.cfuture;

import java.util.concurrent.CountDownLatch;

/*
Its used when a thread needs to wait for other
threads before starting its work
 */
public class CountDownLatchDemo {

	public static void main(String[] args) throws InterruptedException {

		// Let us create task that is going to
		// wait for 2 threads before it starts
		CountDownLatch countDownLatch = new CountDownLatch(2);

		// Creating worker threads
		Worker one = new Worker(1000, countDownLatch);
		Worker two = new Worker(2000, countDownLatch);
		Worker three = new Worker(3000, countDownLatch);
		Worker four = new Worker(4000, countDownLatch);

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

		// The main task waits for two threads
		countDownLatch.await();


		// Main thread has started
		System.out.println(Thread.currentThread().getName()
				+ " has finished");
	}

}

/*
 * A class to represent threads 
 * for which the main thread waits
 */
class Worker implements Runnable {
	private int waitTime;
	private CountDownLatch countDowmLatch;

	public Worker(int waitTime, CountDownLatch latch) {
		this.waitTime = waitTime;
		this.countDowmLatch = latch;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(waitTime);
			
			System.out.println(
					Thread.currentThread().getName()
					+ " finished");
		} catch (InterruptedException e) {
			System.out.println("Exception handled in runnable");
		}
		// on completion of task we decrease the countdownlatch count
		countDowmLatch.countDown();
	}
}
