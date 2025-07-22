package com.miscellaneous.geeks.deque;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class A3MaxInSubarray {

	public static void main(String[] args) {
		int[] array = {10,8,5,12,15,7,6};
		int window = 3;
		maxInSubarray(array, window);
		maxInSubarray(new int[]{1,2,3,4,5,6,7,8,9}, window);
		maxInSubarray(new int[]{9,8,7,6,5,4,3,2,1}, 4);
		
		maxInSubarray(new int[]{8,9,7,8,6,7,5,6,4,5,3,4,2,3,1}, 5);
		
	}
	
	private static void maxInSubarray(int[] array, int window) {
		System.out.println(Arrays.toString(array));
		Deque<Integer> dq = new LinkedList<>();
		for (int i = 0; i < window; i++) {
			while(!dq.isEmpty() && array[dq.peekLast()] <= array[i]) {
				dq.removeLast();
			}
			dq.addLast(i);
		}
		for (int i = window; i < array.length; i++) {
			System.out.println("Max in the range :: " + (i-window+1) + " to " + i + " --> " + array[dq.peekFirst()]);
			if(!dq.isEmpty() && dq.peekFirst() <= i-window) {
				dq.removeFirst();
			}
			while(!dq.isEmpty() && array[dq.peekLast()] <= array[i]) {
				dq.removeLast();
			}
			dq.addLast(i);
		}
		System.out.println("Max in the range :: " + (array.length-window) + " to " + (array.length-1) + " --> " + array[dq.peekFirst()]);
		System.out.print("-----------------------------");
	}

}
