package com.miscellaneous.geeks.arrays;

import java.util.Arrays;

public class A2SecondLargest {

	public static void main(String[] args) {
		secondLargest(new int[]{1,7,3,9,4,8});
		secondLargest(new int[]{8,8,8,8,8,8});
		secondLargest(new int[]{8,8,8,8,8,6});
		secondLargest(new int[]{8,8,-5});
	}
	
	private static void secondLargest(int[] array) {
		
		int secondLargestIndex = -1, largestIndex = 0;
		int size = array.length;
		for(int i=1; i<size; i++) {
			if(array[i] > array[largestIndex]) {
				secondLargestIndex = largestIndex;
				largestIndex = i;
			} else if(array[i] != array[largestIndex]) {
				if(secondLargestIndex == -1 || array[i] > array[secondLargestIndex]) {
					secondLargestIndex = i;
				}
			}
		}
		
		System.out.println(Arrays.toString(array));
		if(secondLargestIndex == -1) {
			System.out.println("All elements are same");
		} else {
			System.out.println("Second Largest Element :: " + array[secondLargestIndex]);
		}
	}

}
