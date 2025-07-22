package com.miscellaneous.producerConsumer;

import java.util.LinkedList;
import java.util.Queue;

public class A2BlockingQueue {

	private final Queue<Integer> queue;
	private final int capacity;
	private final Object lock = new Object();

	public A2BlockingQueue(int capacity) {
		if (capacity <= 0) {
			throw new IllegalArgumentException("Capacity must be positive");
		}
		this.capacity = capacity;
		this.queue = new LinkedList<>();
	}

	// Add an element to the queue, block if full
	public void put(Integer item) throws InterruptedException {
		if (item == null) {
			throw new NullPointerException("Null elements not allowed");
		}

		synchronized (lock) {
			// Wait while queue is full
			while(queue.size() >= capacity ) {
				System.out.println(Thread.currentThread().getName() + " waiting: Queue full");
				lock.wait();
			}
			queue.add(item);
			System.out.println(Thread.currentThread().getName() + " put: " + item);
			lock.notifyAll();
			// Notify waiting consumers
		}
	}

	// Remove and return an element, block if empty
	public Integer take() throws InterruptedException {
		synchronized (lock) {
			while(queue.isEmpty()) {
				lock.wait();
			}
			Integer item = queue.remove();
			System.out.println(Thread.currentThread().getName() + " took: " + item);
			lock.notifyAll(); 
			// Notify waiting producers
			return item;
		}
	}

	// Return current size
	public int size() {
		synchronized (lock) {
			return queue.size();
		}
	}

	// Check if queue is empty
	public boolean isEmpty() {
		synchronized (lock) {
			return queue.isEmpty();
		}
	}
}
