package com.miscellaneous.geeks.arrays;

import java.util.Arrays;

public class B9MaximumCircularSum {

	public static void main(String[] args) {
		int[] array = {10,-20,4,6,7};
		naive(array);
	}

	private static void naive(int[] array) {
		int size = array.length, result = 0;
		
		for(int i=0; i<size; i++) {
			int currMax = 0;
			int currSum = 0;
			for(int j=0; j <= size; j++) {
				int index = (i+j) % size;
				currSum = currSum + array[index];
				currMax = Math.max(currMax, currSum);
			}
			result = Math.max(currMax, result);
		}
		System.out.println(Arrays.toString(array));
		maximumCircularSum(array);
		System.out.println("Maximum Circular Sub Array :: " + result);
	}

	private static void maximumCircularSum(int[] array) {
		int maxSum = kadaneAlgorithm(array);
		if(maxSum <= 0) {
			System.out.println("Array contains all -ve elements");
			return;
		}
		int arraySum = 0,size = array.length;
		for(int i=0; i<size; i++) {
			arraySum = arraySum + array[i];
			array[i] = -array[i];
		}
		int maxCircular = arraySum + kadaneAlgorithm(array);
		System.out.println("Maximum Circular Sum :: " + Math.max(maxCircular, maxSum));
	}

	private static int kadaneAlgorithm(int[] array) {
		int size = array.length, currentSum = 0, result = 0;
		
		for(int i=0; i<size; i++) {
			currentSum = currentSum + array[i];
			if(currentSum < 0) {
				currentSum = 0;
			}
			result = Math.max(result, currentSum);
		}
		return result;
	}
	
	

}
