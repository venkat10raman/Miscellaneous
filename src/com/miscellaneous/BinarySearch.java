package com.miscellaneous;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		BinarySearch bs = new BinarySearch();
        int arr[] = { 2, 3, 4, 10, 40 };
        int right = arr.length - 1;
        int element = 3;
        
        bs.perform(arr, element);
        int index = bs.performRecursive(arr, element, 0, right);
        System.out.println(element + " is found at index ::: " + index);
	}
	
	public int performRecursive(int[] nums, int element, int left, int right) {
		int mid = (left + right - 1)/2;
		if(left > right) {
			return -1;
		}
		if(nums[mid] == element) {
			return mid;
		} else if(nums[mid] > element) {
			right = mid - 1;
			return performRecursive(nums, element, left, right);
		} else {
			left = mid + 1;
			return performRecursive(nums, element, left, right);
		}
	}
	
	public void perform(int[] nums, int element) {
		Arrays.sort(nums);
		int left = 0, right = nums.length - 1, mid =0;
		
		int index = -1;
		while(left <= right) {
			mid = (left + right - 1)/2;
			if(nums[mid] == element) {
				index = mid;
				break;
			} else if(nums[mid] > element) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		System.out.println(element + " is found at index ::: " + index);
	}
}
