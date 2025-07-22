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
		final SyncBlockQueue queue = new SyncBlockQueue(10);
		
		final Runnable producer = () -> {
			while(producerCount.get() < 200) {
				queue.put(producerCount.incrementAndGet());
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		new Thread(producer, "p1").start();
		new Thread(producer, "p2").start();
		
		final Runnable consumer = () -> {
			while(consumerCount.incrementAndGet() <= 200) {
				queue.take();
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		new Thread(consumer, "c1").start();
		new Thread(consumer, "c2").start();
	}

}
