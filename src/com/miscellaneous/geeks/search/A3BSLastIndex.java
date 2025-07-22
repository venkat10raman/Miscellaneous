package com.miscellaneous.geeks.search;

public class A3BSLastIndex {

	public static void main(String[] args) {
		int[] array = {1,2,2,2,5,8,9,9,9,9};
		int element = 2;
		lsFirstIndex(array, element);
	}

	private static void lsFirstIndex(int[] array, int element) {
		if(array == null) {
			System.out.println("Given array is null");
			return;
		}
		
		int left =0, right = array.length-1, mid = 0, index = -1;
		int size = right;
		
		while(left <= right) {
			mid = (left+right)/2;
			if(array[mid] < element) {
				left = mid+1;
			} else if(array[mid] > element) {
				right = mid-1;
			} else {
				if(mid == size || array[mid] != array[mid+1]) {
					index = mid;
					break;
				} else {
					left = mid+1;
				}
			}
		}
		
		if(index > -1) {
			System.out.println("Given Element " + element + "is found at the index :: " + index);
		} else {
			System.out.println("Given Element " + element + "is not found");
		}
	}

}
