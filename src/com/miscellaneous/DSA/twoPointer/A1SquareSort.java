package com.miscellaneous.DSA.twoPointer;

import com.miscellaneous.util.CommonUtil;

public class A1SquareSort {

	public static void main(String[] args) {
		// Test case 1: Mixed numbers
		int[] nums1 = {-4, -1, 0, 3, 10};
		System.out.println("Input:");
		CommonUtil.printIntArray(nums1);
		System.out.println("Squared and sorted:");
		CommonUtil.printIntArray(squareSortedArray(nums1));

		// Test case 2: Empty array
		int[] nums2 = {};
		System.out.println("\nInput (empty):");
		CommonUtil.printIntArray(nums2);
		System.out.println("Squared and sorted:");
		CommonUtil.printIntArray(squareSortedArray(nums2));

		// Test case 3: Single element
		int[] nums3 = {5};
		System.out.println("\nInput (single):");
		CommonUtil.printIntArray(nums3);
		System.out.println("Squared and sorted:");
		CommonUtil.printIntArray(squareSortedArray(nums3));

		// Test case 4: All negative
		int[] nums4 = {-7, -3, -2};
		System.out.println("\nInput (all negative):");
		CommonUtil.printIntArray(nums4);
		System.out.println("Squared and sorted:");
		CommonUtil.printIntArray(squareSortedArray(nums4));

		// Test case 5: All positive
		int[] nums5 = {1, 2, 3};
		System.out.println("\nInput (all positive):");
		CommonUtil.printIntArray(nums5);
		System.out.println("Squared and sorted:");
		CommonUtil.printIntArray(squareSortedArray(nums5));
	}

	private static int[] squareSortedArray(int[] nums) {
		if (nums == null || nums.length == 0) {
			// Handle empty or null input
            return new int[0];
        }
		int n = nums.length;
		int[] result = new int[n];
		int left = 0;
		int right = n-1;
		// Fill result from end
		int index = n-1;
		
		while(left <= right) {
			int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            
            if(leftSquare > rightSquare) {
            	result[index] = leftSquare;
            	left++;
            } else {
            	result[index] = rightSquare;
                right--;
            }
            index--;
		}
		
		return result;
	}

}
