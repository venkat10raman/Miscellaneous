package com.miscellaneous.producerConsumer.caseb;

import java.util.concurrent.atomic.AtomicInteger;

public class SyncProducerConsumer {
	
	private final AtomicInteger producerCount = new AtomicInteger(0);
	private final AtomicInteger consumerCount = new AtomicInteger(0);

	public static void main(String[] args) {
		SyncProducerConsumer spc = new SyncProducerConsumer();
		spc.anonymous();
	}
	
	public void anonymous() {
		SyncBlockQueue syncBlockQueue = new SyncBlockQueue();
		Runnable producer = () -> {
			while(producerCount.get() <= 200) {
				syncBlockQueue.put(producerCount.getAndIncrement());
			}
		};
		
		new Thread(producer).start();
		new Thread(producer).start();
		
		Runnable consumer = () -> {
			while(consumerCount.getAndIncrement() <= 200) {
				syncBlockQueue.take();
			}
		};
		
		new Thread(consumer).start();
		new Thread(consumer).start();
		
		
	}

}
