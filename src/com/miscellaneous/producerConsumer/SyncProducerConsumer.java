package com.miscellaneous.producerConsumer;

import java.util.concurrent.atomic.AtomicInteger;

public class SyncProducerConsumer {
	
	private final AtomicInteger producerCount = new AtomicInteger(0);
	private final AtomicInteger consumerCount = new AtomicInteger(0);

	public static void main(String[] args) {
		System.out.println("start");
		new SyncProducerConsumer().anonymous();
	}
	
	public void anonymous() {
		String key = "venkat-";
		final SyncBlockQueue queue = new SyncBlockQueue();
		
		final Runnable producer = () -> {
			while (producerCount.getAndIncrement() < 200) {
				queue.put(key);
			}
		};
		new Thread(producer, "p1").start();
		new Thread(producer, "p2").start();
		
		final Runnable consumer = () -> {
			while (consumerCount.getAndIncrement() < 200) {
				queue.take();
			}
		};
		new Thread(consumer, "c1").start();
		new Thread(consumer, "c2").start();
	}

}
