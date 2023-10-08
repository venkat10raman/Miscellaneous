package com.miscellaneous.producerConsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class BQProducerConsumer {
	
	private final BlockingQueue<String> queue = new ArrayBlockingQueue<>(10);
	String key = "venkat-";
	private final AtomicInteger atomicInteger = new AtomicInteger(0);
	private final AtomicInteger producerCount = new AtomicInteger(0);
	private final AtomicInteger consumerCount = new AtomicInteger(0);
	
	public static void main(String[] args) {
		new BQProducerConsumer().anonymous();
	}
	
	public void anonymous() {
		
		final Runnable producer = () -> {
			while(producerCount.getAndIncrement() < 200) {
				try {
					StringBuilder sb = new StringBuilder();
					sb.append(key)
					.append(atomicInteger.getAndIncrement());
					
					queue.put(sb.toString());
					
					sb.append(" is produced by :: ")
					.append(Thread.currentThread().getName());
					System.out.println(sb);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		new Thread(producer,"p1").start();
		new Thread(producer,"p2").start();
		
		final Runnable consumer = () -> {
			while(consumerCount.getAndDecrement() < 200) {
				try {
					StringBuilder sb = new StringBuilder();
					atomicInteger.decrementAndGet();
					sb.append(queue.take())
					.append(" is consumed by :: ")
					.append(Thread.currentThread().getName());
					System.out.println(sb);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		new Thread(consumer,"c1").start();
		new Thread(consumer,"c2").start();
		
	}

}
