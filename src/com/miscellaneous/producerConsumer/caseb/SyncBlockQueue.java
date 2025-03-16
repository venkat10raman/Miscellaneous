package com.miscellaneous.producerConsumer.caseb;

import java.util.LinkedList;
import java.util.Queue;

public class SyncBlockQueue {
	
	private final Queue<Integer> queue;
	
	public SyncBlockQueue() {
		queue = new LinkedList<>();
	}
	
	public void put(Integer number) {
		synchronized (queue) {
			
			try {
				while(queue.size() == 10) {
					System.out.println("Producer is waiting");
					queue.wait();
				}
				queue.add(number);
				System.out.println(number + " is produced");
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
				while(queue.size() == 0) {
					System.out.println("Consumer is waiting");
					queue.wait();
				}
				System.out.println(queue.remove() + " ::: is consumed");
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				
				queue.notifyAll();
			}
			
		}
	}

}
