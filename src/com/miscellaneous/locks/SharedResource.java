package com.miscellaneous.locks;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SharedResource {

	private final ReadWriteLock lock = new ReentrantReadWriteLock();
	private int data = 0;

	private int readData() {
		// Acquire read lock
		lock.readLock().lock();
		try {
			System.out.println(Thread.currentThread().getName() + " is reading data: " + data);
			return data;
		} finally {
			// Release read lock
			lock.readLock().unlock();
		}
	}

	private void writeData(int newData) {
		lock.writeLock().lock();
		try {
			System.out.println(Thread.currentThread().getName() + " is writing data: " + newData);
			data = newData;
		} finally {
			lock.writeLock().unlock();
		}
	}

	public static void main(String[] args) {
		SharedResource resource = new SharedResource();

		Runnable readerTask = () -> {
			for (int i = 0; i < 5; i++) {
				resource.readData();
				try {
					// Simulate reading time
					Thread.sleep(100);
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			}
		};

		// Create writer threads
		Runnable writerTask = () -> {
			for (int i = 0; i < 3; i++) {
				resource.writeData(i);
				try {
					// Simulate writing time
					Thread.sleep(200);
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			}
		};

		// Start threads
		Thread reader1 = new Thread(readerTask, "Reader-1");
		Thread reader2 = new Thread(readerTask, "Reader-2");
		Thread writer1 = new Thread(writerTask, "Writer-1");
		
		reader1.start();
        reader2.start();
        writer1.start();
	}

}
