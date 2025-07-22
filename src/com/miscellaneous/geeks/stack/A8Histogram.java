package com.miscellaneous.geeks.stack;

import java.util.Arrays;
import java.util.Stack;

public class A8Histogram {

	public static void main(String[] args) {
		int[] array = {6,5,4,1,5,6};
		int[] ps = new int[array.length];
		int[] ns = new int[array.length];
				
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < array.length; i++) {
			while(!stack.isEmpty() && array[stack.peek()] >= array[i]) {
				stack.pop();
			}
			if(stack.isEmpty()) {
				ps[i] = -1;
			} else {
				ps[i] = stack.peek();
			}
			stack.push(i);
		}
		stack.clear();
		
		for (int i = array.length-1; i >= 0; i--) {
			while(!stack.isEmpty() && array[stack.peek()] >= array[i]) {
				stack.pop();
			}
			if(stack.isEmpty()) {
				ns[i] = array.length;
			} else {
				ns[i] = stack.peek();
			}
			stack.push(i);
		}
		
		int curr = 0, result = 0, start=0, end=0;
		for (int i = 0; i < array.length; i++) {
			curr = (ns[i]-ps[i]-1) * array[i];
			if(curr > result) {
				result = curr;
				start = ps[i];
				end = ns[i];
			}
		}
		System.out.println(Arrays.toString(array));
		System.out.println(result);
		System.out.println(start + "  " + end);
	}

}
