package com.miscellaneous;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

public class LRUCacheLock {

	private final int capacity;
	private final Map<Integer, String> cache;
	private final LinkedList<Integer> order;
	private final ReentrantLock lock;

	public LRUCacheLock(Integer capacity) {
		this.capacity = capacity;
		order = new LinkedList<>();
		cache = new HashMap<>();
		lock = new ReentrantLock();
	}

	private String get(Integer key) {
		lock.lock();
		try {
			if(cache.containsKey(key)) {
				order.remove(key);
				order.addFirst(key);
			}
			return null;
		} finally {
			lock.unlock();
		}

	}

	private void put(Integer key, String value) {
		lock.lock();
		try {
			if(cache.containsKey(key)) {
				cache.remove(key);
			} else if(cache.size() >= capacity) {
				int leastUsedKey = order.removeLast();
				cache.remove(leastUsedKey);
			}

			order.addFirst(key);
			cache.put(key, value);
		} finally {
			lock.unlock();
		}
	}

	public static void main(String[] args) {
		LRUCacheLock lru = new LRUCacheLock(2);
		lru.put(1, "tom");
		lru.put(2, "pat");
		System.out.println("Get 1: " + lru.get(1)); // Returns 1
		lru.put(3, "lee"); // Evicts key 2
		System.out.println("Get 2: " + lru.get(2)); // Returns -1 (not found)
		lru.put(4, "gilly"); // Evicts key 1
		System.out.println("Get 1: " + lru.get(1)); // Returns -1 (not found)
		System.out.println("Get 3: " + lru.get(3)); // Returns 3
		System.out.println("Get 4: " + lru.get(4)); // Returns 4
	}

}
