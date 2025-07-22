package com.miscellaneous.geeks.search;

public class A2BSFirstIndex {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,8,9,9,9};
		int element = 9;
		bsFirstIndex(array, element);
	}

	private static void bsFirstIndex(int[] array, int element) {
		if(array == null) {
			System.out.println("Given array is null");
			return;
		}
		
		int left =0, right = array.length-1, mid = 0, index = -1;
		
		while(left <= right) {
			mid = (left+right)/2;
			if(array[mid] > element) {
				right = mid-1;
			} else if(array[mid] < element){
				left = mid+1;
			} else {
				if(mid == 0 || array[mid] != array[mid-1]) {
 					index = mid;
 					break;
 				} else {
 					right = mid-1;
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
