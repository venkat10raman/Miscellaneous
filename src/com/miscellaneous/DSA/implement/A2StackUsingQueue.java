package com.miscellaneous.DSA.implement;

import java.util.LinkedList;
import java.util.Queue;

public class A2StackUsingQueue {

	private Queue<Integer> queue;

	public A2StackUsingQueue() {
		this.queue = new LinkedList<>();
	}

	// Push element onto stack
	public void push(int data) {
		// first add the element at the end
		queue.add(data);
		// then reverse the linked-list
		for (int i = 1; i < queue.size(); i++) {
			queue.add(queue.poll());
		}
	}

	// Remove and return top element
	public int pop() {
		if (queue.isEmpty()) {
			throw new RuntimeException("Stack is empty");
		}
		return queue.poll();
	}

	// Get the top element
	public int top() {
		if (queue.isEmpty()) {
			throw new RuntimeException("Stack is empty");
		}
		return queue.peek();
	}

	// Check if stack is empty
	public boolean isEmpty() {
		return queue.isEmpty();
	}

	public static void main(String[] args) {
		A2StackUsingQueue stack = new A2StackUsingQueue();
		stack.push(10);
		stack.push(20);
		stack.push(30);

		System.out.println("Top element: " + stack.top()); // Should print 30
		System.out.println("Popped element: " + stack.pop()); // Should print 30
		System.out.println("Is stack empty? " + stack.isEmpty()); // Should print false
	}

}
