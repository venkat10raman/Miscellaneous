package com.miscellaneous.producerConsumer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;

public class SyncBlockQueue {
	
	private final Queue<String> queue;
	private final AtomicInteger atomicInteger = new AtomicInteger(10);
	
	public SyncBlockQueue() {
		queue = new LinkedList<>();
	}
	
	public void put(String key) {
		synchronized (queue) {
			try {
				while (queue.size() == 10) {
					queue.wait();
				}
				StringBuilder sb = new StringBuilder();
				sb.append(key).append(atomicInteger.getAndIncrement());
				queue.add(sb.toString());
				sb.append(" is produced by :: ")
				.append(Thread.currentThread().getName());
				System.out.println(sb);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				queue.notifyAll();
			}
		}
	}
	
	public void take() {
		synchronized (queue) {
			try {
				while (queue.size() == 0) {
					queue.wait();
				}
				StringBuilder sb = new StringBuilder();
				sb.append(queue.remove())
				.append(" is consumed by :: ")
				.append(Thread.currentThread().getName());
				atomicInteger.getAndDecrement();
				System.out.println(sb);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				queue.notifyAll();
			}
		}
	}

}
