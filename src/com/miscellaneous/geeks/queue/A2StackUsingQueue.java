package com.miscellaneous.geeks.queue;

import java.util.LinkedList;
import java.util.Queue;

public class A2StackUsingQueue {
	
	private Queue<Integer> queue = new LinkedList<Integer>();

	public static void main(String[] args) {
		A2StackUsingQueue stack = new A2StackUsingQueue();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		while(!stack.isEmpty()) {
			stack.pop();
		}
	}
	
	private void push(int data) {
		queue.add(data);
		for (int i = 1; i < queue.size(); i++) {
			queue.add(queue.poll());
		}
	}
	
	private int pop() {
		System.out.println(top() + " :: removed from the stack");
		return queue.poll();
	}
	
	private int top() {
		return queue.peek();
	}
	
	public boolean isEmpty() {
		return queue.isEmpty();
	}

}
