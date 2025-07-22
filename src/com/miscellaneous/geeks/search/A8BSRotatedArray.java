package com.miscellaneous.geeks.search;

public class A8BSRotatedArray {

	public static void main(String[] args) {
		int[] array = {7,8,9,0,1,2,3,4,5,6};
		rotatedSearch(array, 4);
	}

	private static void rotatedSearch(int[] array, int target) {
		int left = 0, right = array.length-1, index = -1, mid = 0;
		
		while(left <= right) {
			mid = (left + right) / 2;
			if(array[mid] == target) {
				index = mid;
				break;
			} else if(array[left] <= array[mid]) {
				if(array[left] <= target && target < array[mid]) {
					right = mid-1;
				} else {
					left = mid+1;
				}
			} else {
				if(array[mid] <= target && target < array[right]) {
					left = mid+1;
				} else {
					right = mid-1;
				}
			}
		}
		
		if(index == -1) {
			System.out.println(target + " is not found in the array");
		} else {
			System.out.println(target + " is found at the index :: " + index);
		}
	}

}
