package com.miscellaneous;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LRUCache {

	private final int capacity;
	private final Map<Integer, String> cache;
	private final LinkedList<Integer> order;

	public LRUCache(int capacity) {
		this.capacity = capacity;
		this.cache = new HashMap<>();
		this.order = new LinkedList<>();
	}

	public String get(Integer key) {
		if (cache.containsKey(key)) {
			order.remove(key);
			order.addFirst(key);
		}
		return cache.get(key);
	}

	public void put(Integer key, String value) {
		if(cache.containsKey(key)) {
			order.remove(key);
		} else if(cache.size() >= capacity) {
			int leastUsedKey = order.removeLast();
			cache.remove(leastUsedKey);
		}
		cache.put(key, value);
		order.addFirst(key);
	}

	public static void main(String[] args) {
		LRUCache lru = new LRUCache(2);
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
