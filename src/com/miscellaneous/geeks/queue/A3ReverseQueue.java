package com.miscellaneous.geeks.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class A3ReverseQueue {

	public static void main(String[] args) {
		A3ReverseQueue rq = new A3ReverseQueue();
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);
		queue.add(60);
		System.out.println(queue);
		rq.reverse(queue);
		rq.recursiveReverse(queue);
		System.out.println(queue);
	}
	
	private void reverse(Queue<Integer> queue) {
		Stack<Integer> st = new Stack<>();
		while(!queue.isEmpty()) {
//			st.push(queue.remove());
			st.push(queue.poll());
		}
		
		while(!st.isEmpty()) {
			queue.add(st.pop());
		}
		System.out.println(queue);
	}
	
	private void recursiveReverse(Queue<Integer> queue) {
		if(queue.isEmpty()) {
			return;
		} else {
			int x = queue.poll();
			recursiveReverse(queue);
			queue.add(x);
		}
	}
	

}
