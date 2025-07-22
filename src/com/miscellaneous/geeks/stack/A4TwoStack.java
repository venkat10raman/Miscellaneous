package com.miscellaneous.geeks.stack;

public class A4TwoStack {
	
	private int[] array;
	private int capacity, top, bottom;
	
	public A4TwoStack(int cap) {
		this.capacity = cap;
		top = -1;
		bottom = cap;
		array = new int[cap];
	}
	
	private boolean pushTop(int data) {
		if(top < bottom-1) {
			top++;
			array[top] = data;
			return true;
		}
		System.out.println("Top Stack is full");
		return false;
	}
	
	private boolean pushBottom(int data) {
		if(top < bottom-1) {
			bottom--;
			array[bottom] = data;
			return true;
		}
		System.out.println("Bottom Stack is full");
		return false;
	}
	
	private Integer popTop() {
		if(top >= 0) {
			int x = array[top];
			top--;
			return x;
		}
		return null;
	}

	
	private Integer popBottom() {
		if(bottom < capacity) {
			int x = array[bottom];
			bottom++;
			return x;
		}
		return null;
	}
	
	private int topSize() {
		return top+1;
	}
	
	private int bottomSize() {
		return capacity-bottom;
	}
	
	public static void main(String[] args) {
		A4TwoStack stack = new A4TwoStack(10);
		
		int count = 1;
		while(count <= 6) {
			stack.pushTop(5 * count);
			stack.pushBottom(3 * count);
			count++;
		}
		
		while(stack.bottomSize() > 0) {
			System.out.print(stack.popBottom() + " --> ");
		}
		System.out.println();
		
		while(stack.topSize() > 0) {
			System.out.print(stack.popTop() + " --> ");
		}
		System.out.println();
		
	}

}
