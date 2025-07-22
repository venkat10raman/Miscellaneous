package com.miscellaneous.arrays.dynamicProgramming;

import java.util.Arrays;

public class A1SubArraySum {

	public static void main(String[] args) {
		int[] arr = {1, 4, 20, 3, 10, 5};
		int targetSum = 33;
		System.out.println("Array: " + Arrays.toString(arr));
		System.out.println("Target Sum: " + targetSum);
		int[] result = findSubarrayWithSum(arr, targetSum);
		if (result != null) {
			System.out.println("Subarray with sum " + targetSum + ": " + Arrays.toString(result));
		} else {
			System.out.println("No subarray found with the given sum");
		}
	}

	private static int[] findSubarrayWithSum(int[] arr, int targetSum) {
		if (arr == null || arr.length == 0) {
			return null;
		}
		int currSum = 0;
		int start = 0;
		for(int i = 0; i< arr.length; i++) {
			// Add the current element to the sum
			currSum += arr[i];

			// Shrink the window while current sum is greater than target
			while (currSum > targetSum && start < i) {
				currSum -= arr[start];
				start++;
			}

			// Check if we found the target sum
			if (currSum == targetSum) {
				return Arrays.copyOfRange(arr, start, i + 1);
			}
		}
		return null;
	}

}
