package com.miscellaneous.geeks.arrays;

import java.util.Arrays;

public class B7KadaneAlgorithm {

	public static void main(String[] args) {
		int[] array = {1,-2,3,-1,2};
		naive(array);
		array = new int[] {-5, 4, -2, 3, -1, 2, -2};
		naive(array);
		
		System.out.println("------------");
		negativeKadaneAlgorithm(array);
		array = new int[] {-10,-5,-3,-4,-6};
		negativeKadaneAlgorithm(array);
	}
	
	private static void naive(int[] array) {
		System.out.println(Arrays.toString(array));
		int size = array.length, max = array[0];
		
		for(int i=0; i<size; i++) {
			int currMax = 0;
			for(int j=i; j<size; j++) {
				currMax = currMax+array[j];
				max = Math.max(currMax, max);
			}
		}
		kadaneAlgorithm(array);
		System.out.println("Maximum Sub Array :: " + max);
	}

	private static void kadaneAlgorithm(int[] array) {
		int size = array.length, maxSum = array[0], currSum = 0;
		for(int i=0; i<size; i++) {
			currSum = currSum + array[i];
			if(currSum < 0) {
				currSum = 0;
			}
			maxSum = Math.max(maxSum, currSum);
		}
		System.out.println("Maximum Sub Array Sum :: " + maxSum);
	}
	
	private static void negativeKadaneAlgorithm(int[] array) {
		int size = array.length, currentSum = 0, result = 0;
		
		for(int i=0; i<size; i++) {
			currentSum = currentSum + array[i];
			if(currentSum < 0) {
				currentSum = Math.max(currentSum, array[i]);
			}
			result = Math.max(result, currentSum);
		}
		
		System.out.println(Arrays.toString(array));
		kadaneAlgorithm(array);
		System.out.println("Maximum Sub Array Sum :: " + result);
	}

}
