package com.miscellaneous.producerConsumer.caseb;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class ESProducerConsumer {

	private final AtomicInteger producerCount = new AtomicInteger(0);
	private final AtomicInteger consumerCount = new AtomicInteger(0);
	private static final int NUM_PRODUCERS = 2;
	private static final int NUM_CONSUMERS = 4;


	public static void main(String[] args) {
		ESProducerConsumer esp = new ESProducerConsumer();
		esp.anonymous();
	}
	
	public void anonymous() {
		ExecutorService executor = 
				Executors.newFixedThreadPool(NUM_PRODUCERS+NUM_CONSUMERS);
		
		SyncBlockQueue syncBlockQueue = new SyncBlockQueue();
		
		Runnable producer = () -> {
			while(producerCount.get() <= 200) {
				syncBlockQueue.put(producerCount.getAndIncrement());
			}
		};
		
		Runnable consumer = () -> {
			while(consumerCount.getAndIncrement() <= 100) {
				syncBlockQueue.take();
			}
		};
		
		IntStream.range(0, NUM_PRODUCERS).forEach(i->{
			executor.submit(producer);
		});
		
		IntStream.range(0, NUM_CONSUMERS).forEach(i->{
			executor.submit(consumer);
		});
		
		executor.shutdown();
	}

}
