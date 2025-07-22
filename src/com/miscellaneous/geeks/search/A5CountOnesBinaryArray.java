package com.miscellaneous.geeks.search;

import java.util.Arrays;

public class A5CountOnesBinaryArray {

	public static void main(String[] args) {
		int[] array = {1,1,1,1,1,1,1,1,1,1,1};
		countOnes(array);
	}

	private static void countOnes(int[] array) {
		if(array == null) {
			System.out.println("Given array is null");
			return;
		}
		System.out.println(Arrays.toString(array));
		int left =0, right = array.length-1, mid = 0, index = -1;
		while(left <= right) {
			mid = (left+right)/2;
			if(array[mid] == 0 && array[mid] != array[mid+1]) {
				index = mid;
				break;
			} else if(array[mid] == 0) {
				left = mid + 1;
			} else {
				right = mid-1;
			}
		}
		
		System.out.println((array.length-index-1) + " ones are present in the array");
	}
	
	

}
