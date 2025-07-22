package com.miscellaneous.geeks.arrays;

import java.util.Arrays;

public class A1Largest {

	public static void main(String[] args) {
		largest(new int[]{1,7,3,9,4,8});
	}
	
	private static void largest(int[] array) {
		int largest = array[0];
		int size = array.length;
		for(int i=1; i<size; i++) {
			if(array[i] > largest) {
				largest = array[i];
			}
		}
		System.out.println(Arrays.toString(array));
		System.out.println("Largest Element in the array is :: " + largest);
	}

}
