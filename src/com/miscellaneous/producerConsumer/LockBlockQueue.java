
package com.miscellaneous.producerConsumer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class LockBlockQueue {
	
	private final Queue<String> queue;
	private final ReentrantLock lock = new ReentrantLock(true);
	private final Condition notFull = lock.newCondition();
	private final Condition notEmpty = lock.newCondition();
	
	private final AtomicInteger atomicInteger = new AtomicInteger(0);
	
	public LockBlockQueue() {
		queue = new LinkedList<>();
	}
	
	public void put(String key) {
		lock.lock();
		try {
			while(queue.size() == 10) {
				notFull.await();
			}
			StringBuilder sb = new StringBuilder();
			sb.append(key).append(atomicInteger.getAndIncrement());
			queue.add(sb.toString());
			sb.append(" is produced by :: ")
			.append(Thread.currentThread().getName());
			System.out.println(sb);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			notEmpty.signalAll();
		}
		lock.unlock();
	}
	
	public void take() {
		lock.lock();
		try {
			while(queue.size() == 0) {
				notFull.await();
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
			notFull.signalAll();
		}
		lock.unlock();
	}

}
