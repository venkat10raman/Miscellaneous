package com.miscellaneous.geeks.arrays;

import java.util.Arrays;

public class C3SlidingWindow {

	public static void main(String[] args) {
		int[] array = {1,8,30,-5,20,7};
		int k = 4;
		slidingWindowSum(array,k);
	}

	private static void slidingWindowSum(int[] array, int k) {
		int size = array.length, currentSum = 0, result = 0;
		for(int i=0; i<k; i++) {
			currentSum += array[i];
		}
		result = currentSum;
		for(int i=k; i<size; i++) {
			currentSum = currentSum + array[i] - array[i-k];
			result = Math.max(result, currentSum);
		}
		System.out.println(Arrays.toString(array));
		System.out.println("Maximum sliding window sum :: " + result);
	}

}
