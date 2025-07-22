package com.miscellaneous.geeks.stack;

import java.util.Stack;

public class B3Minimum {
	
	private Stack<Integer> stack = new Stack<>();
	private int minimum;

	public static void main(String[] args) {
		B3Minimum st = new B3Minimum();
		st.push(10);
		st.push(5);
		System.out.println(st.minimum);
		st.push(2);
		st.push(2);
		st.pop();
		st.push(0);
		st.peek();
		st.pop();
		st.pop();
	}
	
	private void push(int data) {
		if(stack.isEmpty()) {
			minimum = data;
			stack.push(data);
		} else if (data <= minimum){
			stack.push(2*data-minimum);
			minimum = data;
		} else {
			stack.push(data);
		}
	}
	
	private void peek() {
		int top = stack.peek();
		top = top <= 0 ? minimum : top;
		System.out.println("Peek Element in the stack is :: " + top );
	}

	private void pop() {
		if(stack.isEmpty()) {
			System.out.println("The stack is Empty");
		} else {
			int top = stack.pop();
			if(top <= 0) {
				int result = minimum;
				minimum = 2*minimum - top;
				System.out.println("Popped Element in the stack is :: " + result );
			} else {
				System.out.println("Popped Element in the stack is :: " + top );
			}
		}
	}
}
