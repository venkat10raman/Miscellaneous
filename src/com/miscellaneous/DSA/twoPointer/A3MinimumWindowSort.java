package com.miscellaneous.DSA.twoPointer;

import com.miscellaneous.util.CommonUtil;

public class A3MinimumWindowSort {

	public static void main(String[] args) {
		// Test case 1: Mixed unsorted subarray
		int[] nums1 = {2, 6, 4, 8, 10, 9, 15};
		System.out.println("Input:");
		CommonUtil.printIntArray(nums1);
		System.out.println("Minimum window length: " + findUnsortedSubarray(nums1));

		// Test case 2: Empty array
        int[] nums2 = {};
        System.out.println("\nInput (empty):");
        CommonUtil.printIntArray(nums2);
        System.out.println("Minimum window length: " + findUnsortedSubarray(nums2));
        
        // Test case 3: Single element
        int[] nums3 = {1};
        System.out.println("\nInput (single):");
        CommonUtil.printIntArray(nums3);
        System.out.println("Minimum window length: " + findUnsortedSubarray(nums3));
        
        // Test case 4: Fully sorted
        int[] nums4 = {1, 2, 3, 4, 5};
        System.out.println("\nInput (sorted):");
        CommonUtil.printIntArray(nums4);
        System.out.println("Minimum window length: " + findUnsortedSubarray(nums4));
        
        // Test case 5: Fully unsorted
        int[] nums5 = {5, 4, 3, 2, 1};
        System.out.println("\nInput (fully unsorted):");
        CommonUtil.printIntArray(nums5);
        System.out.println("Minimum window length: " + findUnsortedSubarray(nums5));
        
        // Test case 6: Duplicates
        int[] nums6 = {1, 3, 2, 2, 2};
        System.out.println("\nInput (duplicates):");
        CommonUtil.printIntArray(nums6);
        System.out.println("Minimum window length: " + findUnsortedSubarray(nums6));
	}

	private static int findUnsortedSubarray(int[] nums) {
		if (nums == null || nums.length <= 1) {
			// Empty or single element
			return 0; 
		}

		// Step 1: Find left and right boundaries of unsorted subarray
		int left = -1;
		int right = -1;


		// Find first element from left that's out of order
		for(int i=0; i < nums.length-1; i++) {
			if(nums[i] > nums[i+1]) {
				left = i;
				break;
			}
		}

		// If no such element, array is sorted
		if (left == -1) {
			return 0;
		}

		// Find last element from right that's out of order
		for (int i = nums.length - 1; i > 0; i--) {
			if(nums[i] < nums[i-1]) {
				right = i;
				break;
			}
		}

		// Step 2: Find min and max in the unsorted subarray
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = left; i <= right; i++) {
			min = Math.min(min, nums[i]);
			max = Math.max(max, nums[i]);
		}

		// Step 3: Extend boundaries
		// Move left to include elements greater than min
		while (left > 0 && nums[left - 1] > min) {
			left--;
		}

		// Move right to include elements less than max
		while (right < nums.length - 1 && nums[right + 1] < max) {
			right++;
		}
		// Step 4: Return length of unsorted subarray
		return right - left + 1;
	}

}
