package com.miscellaneous.cfuture;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class CountDownLatchExample {
	
	public static void main(String[] args) throws InterruptedException {
		CountDownLatch countDownLatch = new CountDownLatch(1);
		
		new Thread(new Service(countDownLatch, 2)).start();
		new Thread(new Service(countDownLatch, 3)).start();
		new Thread(new Service(countDownLatch, 7)).start();
		
		countDownLatch.await();
		System.out.println("Main Thread Completed");
	}

}

class Service implements Runnable {
	
	private final CountDownLatch countDownLatch;
	private final int waitTime;
	
	public Service(CountDownLatch countDownLatch, int waitTime) {
		this.countDownLatch = countDownLatch;
		this.waitTime = waitTime;
	}

	@Override
	public void run() {
		System.out.println("Service Started " + Thread.currentThread().getName());
		try {
			TimeUnit.SECONDS.sleep(waitTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		countDownLatch.countDown();
		System.out.println("Service Completed " + Thread.currentThread().getName());
	}
	
}
