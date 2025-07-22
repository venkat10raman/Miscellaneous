package com.miscellaneous.geeks.stack;

public class MyArrayStack {

	private int[] array;
	private int capacity;
	private int top;
	
	public MyArrayStack(int capacity) {
		this.capacity = capacity;
		this.array = new int[capacity];
		this.top = -1;
	}
	
	public void push(int x) {
		if(top < capacity) {
			top++;
			array[top] = x;
		} else {
			System.out.println("The stack is full");
		}
	}
	
	public int pop() {
		int result = 0;
		if(top < 0) {
			System.out.println("The stack is empty");
			result = top;
		} else {
			result = array[top];
			top--;
		}
		return result;
	}
	
	public int size() {
		return top+1;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
}
