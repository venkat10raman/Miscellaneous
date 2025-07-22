package com.miscellaneous.geeks.arrays;

import java.util.Arrays;

public class B2MaximumDifference {

	public static void main(String[] args) {
		int[] array = {2,8,3,7,6,14,5,1};
		maximumDifference(array);
	}
	
	private static void maximumDifference(int[] array) {
		int max = array[0], min = array[0], maxDiff = 0, size = array.length;
		for(int i=0; i<size; i++) {
			if(array[i] > max) {
				max = array[i];
			} else if(array[i] < min) {
				min = array[i];
			}
		}
		maxDiff = max-min;
		System.out.println(Arrays.toString(array));
		System.out.println("Maximum difference is :: " + maxDiff);
	}

}
