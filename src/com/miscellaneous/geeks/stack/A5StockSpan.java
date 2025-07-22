package com.miscellaneous.geeks.stack;

import java.util.Arrays;
import java.util.Stack;

public class A5StockSpan {

	// stock span is :: no of consecutive days where
	// stock price is less than or equal to present day price
	public static void main(String[] args) {
		int[] array = {60,10,20,15,35,50};
		System.out.println(Arrays.toString(array));
		Stack<Integer> stack = new Stack<>();
		stack.push(0);
		System.out.println("Stock Span on Day 1 :: " + 1);
		int span = 0;
		for (int i = 1; i < array.length; i++) {
			while(!stack.isEmpty() && array[stack.peek()] <= array[i]) {
				stack.pop();
			}
			span = stack.isEmpty() ? i+1 : i-stack.peek();
			System.out.println("Stock Span on Day " + (i+1) + " :: " + span);
			stack.push(i);
		}
		stack.clear();
		System.out.println("+++++++++++++++++++++");
		
		for (int i = 0; i < array.length; i++) {
			while(!stack.isEmpty() && array[stack.peek()] <= array[i]) {
				stack.pop();
			}
			span = stack.isEmpty() ? i+1 : i-stack.peek();
			System.out.println("Stock Span on Day " + (i+1) + " :: " + span);
			stack.push(i);
		}
	}

}
