package com.miscellaneous.geeks.stack;

public class A1ArrayStack {

	public static void main(String[] args) {
		MyArrayStack stack = new MyArrayStack(5);
		int count = 1;
		while(stack.size() < 5 ) {
			stack.push(10 * count);
			count++;
		}
		while(!stack.isEmpty()) {
			System.out.print(stack.pop() + " --> ");
		}
		System.out.println();
	}

}
