package com.miscellaneous.geeks.stack;

import java.util.Arrays;
import java.util.Stack;

public class A9Histogram {

	public static void main(String[] args) {
		int[] array = {6,5,4,1,5,6};
		Stack<Integer> stack = new Stack<>();
		
		int curr = 0, start = 0, end = 0, result =0;
		int height = 0, width = 0;
		for (int i = 0; i < array.length; i++) {
			while(!stack.isEmpty() && array[stack.peek()] >= array[i]) {
				height = array[stack.pop()];
				width = stack.isEmpty() ? i : (i-stack.peek()-1);
				curr = height * width;
				if(result < curr) {
					result = curr;
					end = i;
					start = stack.isEmpty() ? 0 : stack.peek();
				}
			}
			stack.push(i);
		}
		
		while(!stack.isEmpty()) {
			height = stack.pop();
			width = stack.isEmpty() ? array.length : (array.length - stack.peek() -1);
			curr = array[height] * width;
			if(result < curr) {
				result = curr;
				end = height;
				start = stack.isEmpty() ? 0 : stack.peek();
			}
			
		}
		System.out.println(Arrays.toString(array));
		System.out.println(result);
		System.out.println(start + " " + end);
	}

}
