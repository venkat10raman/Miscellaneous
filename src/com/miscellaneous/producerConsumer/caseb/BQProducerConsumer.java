package com.miscellaneous.producerConsumer.caseb;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class BQProducerConsumer {

	private final BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
	private final AtomicInteger atomicInteger = new AtomicInteger(0);

	public static void main(String[] args) {
		BQProducerConsumer b = new BQProducerConsumer();
		b.anonymous();
	}

	public void anonymous() {
		final Runnable producer = ()->{
			while(true) {
				if(queue.size() < 10) {
					try {
						System.out.println(atomicInteger.get() + " ::: is produced");
						queue.put(atomicInteger.getAndIncrement());
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		new Thread(producer).start();
		new Thread(producer).start();


		final Runnable consumer =()->{
			while(true) {
				if(queue.size() > 0) {
					try {
						System.out.println(queue.take() + " ::: is consumed");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}
		};
		new Thread(consumer).start();
		new Thread(consumer).start();
	}

}
