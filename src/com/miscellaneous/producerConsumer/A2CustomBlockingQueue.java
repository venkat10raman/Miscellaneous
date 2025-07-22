package com.miscellaneous.producerConsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class A2CustomBlockingQueue {

	public static void main(String[] args) {
		// Create BlockingQueue with capacity 5
		A2BlockingQueue queue = new A2BlockingQueue(5);

		// Create ExecutorService with 2 threads
		ExecutorService executor = Executors.newFixedThreadPool(2);

		executor.submit(() -> {
			Thread.currentThread().setName("Producer");
			try {
				for (int i = 1; i <= 10; i++) {
					queue.put(i);
					Thread.sleep(100); // Simulate work
				}
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				System.err.println("Producer interrupted");
			}
		});
		
		// Consumer task: Take 10 numbers
        executor.submit(() -> {
            Thread.currentThread().setName("Consumer");
            try {
                for (int i = 1; i <= 10; i++) {
                    queue.take();
                    Thread.sleep(200); // Simulate slower consumption
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Consumer interrupted");
            }
        });
        executor.shutdown();
	}

}
