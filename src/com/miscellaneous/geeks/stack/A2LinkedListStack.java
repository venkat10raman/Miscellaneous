package com.miscellaneous.geeks.stack;

public class A2LinkedListStack {

	private StackNode head;
	private int size = 0;
	
	public static void main(String[] args) {
		A2LinkedListStack stack = new A2LinkedListStack();
		int count = 1;
		while(count <= 10) {
			stack.push(count*10);
			count++;
		}
		
		while(stack.peek() != Integer.MAX_VALUE) {
			System.out.print(" --> " + stack.pop());
		}
		System.out.println();
	}
	
	private void push(int data) {
		StackNode temp = new StackNode(data);
		if(head == null) {
			head = temp;
		} else {
			temp.next = (head);
			head = temp;
		}
		size++;
	}
	
	private int pop() {
		if(head == null) {
			return Integer.MAX_VALUE;
		}
		int result = head.data;
		head = head.next;
		size--;
		return result;
	}
	
	private int peek() {
		if(head == null) {
			return Integer.MAX_VALUE;
		}
		return head.data;
	}
	
	private int size() {
		return size;
	}
	
	private boolean isEmpty() {
		return head == null;
	}
}
