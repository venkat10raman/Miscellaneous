package com.miscellaneous.arrays;

import com.miscellaneous.util.CommonUtil;

public class C20SearchRotatedArray {

	public static void main(String[] args) {
		search(new int[] {5,4,1,2,3}, 5);
		search(new int[] {4,5,1,2,3}, 2);
	}
	
	private static void search(int[] array, int target) {
		int left = 0, right = array.length - 1;
		int targetIndex = -1;
		while(left <= right) {
			int mid = (left+right)/2;
			if(array[mid]==target) {
				targetIndex = mid;
			}
			if(array[left] <= array[mid]) {
				if(array[left] <= target && target < array[mid]) {
					right = mid-1;
				} else {
					left = mid+1;
				}
			} else {
				if(array[right] >= target && target > array[mid]) {
					left = mid+1;
				} else {
					right = mid-1;
				}
			}
		}
		CommonUtil.printIntArray(array);
		if(targetIndex == -1) {
			System.out.println(target +" :: not found in the array");
		} else {
			System.out.println(target +" is found at the index " + targetIndex);
		}
	}

}
