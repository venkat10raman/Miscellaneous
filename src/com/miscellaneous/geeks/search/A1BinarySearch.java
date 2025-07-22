package com.miscellaneous.geeks.search;

public class A1BinarySearch {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9};
		int element = 8;
		binarySearch(array, element);
	}

	private static void binarySearch(int[] array, int element) {
		if(array == null) {
			System.out.println("Given array is null");
			return;
		}
		
		int left =0, right = array.length, mid = 0, index = -1;
		
		while(left < right) {
			mid = (left + right) / 2;
			if(array[mid] == element) {
				index = mid;
				break;
			} else if(array[mid] > element) {
				right = mid-1;
			} else {
				left = mid+1;
			}
		}
		if(index > -1) {
			System.out.println("Given Element " + element + "is found at the index :: " + index);
		} else {
			System.out.println("Given Element " + element + "is not found");
		}
		
	}

}
