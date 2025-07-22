package com.miscellaneous.producerConsumer;

import java.util.LinkedList;
import java.util.Queue;

public class SyncBlockQueue {
	
	private final Queue<Integer> queue;
	private final Object lock = new Object();
	private final int capacity;
	
	public SyncBlockQueue(int capacity) {
		if (capacity <= 0) {
			throw new IllegalArgumentException("Capacity must be positive");
		}
		this.capacity = capacity;
		this.queue = new LinkedList<>();
	}
	
	public void put(Integer key) {
		synchronized (lock) {
			try {
				while (queue.size() == capacity) {
					lock.wait();
				}
				queue.add(key);
				System.out.println(Thread.currentThread().getName() + " put: " + key);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				lock.notifyAll();
			}
		}
	}
	
	public void take() {
		synchronized (lock) {
			try {
				while (queue.size() == 0) {
					lock.wait();
				}
				Integer item = queue.remove();
				System.out.println(Thread.currentThread().getName() + " took: " + item);
				lock.notifyAll(); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				lock.notifyAll();
			}
		}
	}

}
