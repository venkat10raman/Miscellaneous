package com.miscellaneous.ds.implement;

import java.util.Comparator;
import java.util.LinkedList;

public class A4PriorityQueueUsingLinkedList<T> {
	
	private final LinkedList<T> queue;
	private final Comparator<T> comparator;
	
	public A4PriorityQueueUsingLinkedList(Comparator<T> comparator) {
		this.comparator = comparator;
		this.queue = new LinkedList<>();
	}
	
	public void offer(T item) {
		int i=0;
		while(i< queue.size() && comparator.compare(queue.get(i), item) < 0) {
			i++;
		}
		queue.add(i,item);
	}
	
	public T poll() {
        return queue.isEmpty() ? null : queue.removeFirst();
    }
    
    public T peek() {
        return queue.isEmpty() ? null : queue.getFirst();
    }
    
    public boolean isEmpty() {
        return queue.isEmpty();
    }
	
	public static void main(String[] args) {
		A4PriorityQueueUsingLinkedList<Integer> pq = 
				new A4PriorityQueueUsingLinkedList<>(Integer::compare);
		pq.offer(10);
        pq.offer(5);
        pq.offer(20);
        pq.offer(15);
        
        System.out.println("Priority Queue Elements:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
	}

}
