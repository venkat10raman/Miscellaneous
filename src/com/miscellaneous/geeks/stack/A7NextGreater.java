package com.miscellaneous.geeks.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class A7NextGreater {

	public static void main(String[] args) {
		int[] array = {5,15,10,8,6,12,9,18};
		System.out.println(Arrays.toString(array));
		
		int size = array.length-1;
		Stack<Integer> stack = new Stack<>();
		stack.push(size);
		System.out.println("No Next Greatere Element for the element -> " + array[size]);
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(-1);
		for (int i = size-1; i >= 0; i--) {
			while(!stack.isEmpty() && array[stack.peek()] <= array[i]) {
				stack.pop();
			}
			
			if(stack.isEmpty()) {
				System.out.println("No Next Greatere Element for the element --> " + array[i]);
				list.add(-1);
			} else {
				list.add(stack.peek());
				System.out.println("Next Greater Element for the element -> " + array[i] + " is :: " + array[stack.peek()]);
			}
			stack.push(i);
		}
		
		Collections.reverse(list);
		System.out.println("--------------------");
		
		for (int i = 0; i < array.length; i++) {
			if(list.get(i) == -1) {
				System.out.println("No Next Greatere Element for the element --> " + array[i]);
			} else {
				list.add(stack.peek());
				System.out.println("Next Greater Element for the element -> " + array[i] + " is :: " + array[list.get(i)]);
			}
		}
		
		System.out.println("--------------------");
		
		for (int i = size; i >= 0; i--) {
			while(!stack.isEmpty() && array[stack.peek()] <= array[i]) {
				stack.pop();
			}
			
			if(stack.isEmpty()) {
				System.out.println("No Next Greatere Element for the element --> " + array[i]);
			} else {
				System.out.println("Next Greater Element for the element -> " + array[i] + " is :: " + array[stack.peek()]);
			}
			stack.push(i);
		}
	}

}
