package com.miscellaneous.geeks.stack;

import java.util.Arrays;
import java.util.Stack;

public class A6PreviousGreater {

	/*
	 * Given an array of distinct integers, find closet greater
	 * on left side of every element. If there is no greater
	 * element on the left side, then print -1
	 * */
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		int[] array = {15,10,18,12,4,6,2,8};
		System.out.println(Arrays.toString(array));
		
		stack.push(0);
		System.out.println("No Previous Greatere Element for the element -> " + array[0]);
		
		for (int i = 1; i < array.length; i++) {
			while(!stack.isEmpty() && array[stack.peek()] <= array[i]) {
				stack.pop();
			}
			
			if(stack.isEmpty()) {
				System.out.println("No Previous Greatere Element for the element --> " + array[i]);
			} else {
				System.out.println("Previous Greater Element for the element -> " + array[i] + " is :: " + array[stack.peek()]);
			}
			stack.push(i);
		}
		System.out.println("++++++++++++++++++++++++");
		
		stack.clear();
		for (int i = 0; i < array.length; i++) {
			while(!stack.isEmpty() && array[stack.peek()] <= array[i]) {
				stack.pop();
			}
			
			if(stack.isEmpty()) {
				System.out.println("No Previous Greatere Element for the element --> " + array[i]);
			} else {
				System.out.println("Previous Greater Element for the element -> " + array[i] + " is :: " + array[stack.peek()]);
			}
			stack.push(i);
		}
	}

}
