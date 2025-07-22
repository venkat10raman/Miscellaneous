package com.miscellaneous.geeks.stack;

public class B1Minimum {
	
	private StackNode stack;
	private StackNode minStack;

	public static void main(String[] args) {
		B1Minimum st = new B1Minimum();
		st.push(10);
		st.min();
		st.push(5);
		st.push(15);
		st.min();
		st.push(2);
		st.push(2);
		st.min();
		st.pop();
		st.min();
		st.pop();
		st.pop();
		st.min();
		st.pop();
		st.pop();
	}
	
	private void push(int data) {
		StackNode temp = new StackNode(data);
		if(stack == null) {
			stack = temp;
			minStack = temp;
		} else {
			if(temp.getData() <= minStack.getData()) {
				StackNode minStackTemp = new StackNode(data);
				minStackTemp.setNext(minStack);
				minStack = minStackTemp;
				
				temp.setNext(stack);
				stack = temp;
			}
		}
	}
	
	private void pop() {
		if(stack == null) {
			System.out.println("The list is Empty");
		} else {
			if(stack.getData() == minStack.getData()) {
				System.out.println(stack.getData() + " is poped");
				stack = stack.getNext();
				minStack = minStack.getNext();
			}
		}
	}
	
	private void min() {
		if(minStack == null) {
			System.out.println("The stack is Empty");
		} else {
			System.out.println("Minimum element in the stack is :: " + minStack.getData());
		}
	}

}
