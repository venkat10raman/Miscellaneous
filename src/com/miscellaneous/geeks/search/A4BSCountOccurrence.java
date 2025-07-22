package com.miscellaneous.geeks.search;

public class A4BSCountOccurrence {

	public static void main(String[] args) {
		int[] array = {1,2,2,2,5,8,9,9,9,9};
		int element = 2;
		countOccurrence(array, element);
	}

	private static void countOccurrence(int[] array, int element) {
		int firstIndex = firstOccurrence(array, element);
		if(firstIndex == -1) {
			System.out.println("No element found in the array ");
		} else {
			int lastIndex = lastOccurrence(array, element);
			System.out.println("Count :: " + (lastIndex - firstIndex + 1));
		}
	}

	private static int firstOccurrence(int[] array, int element) {
		if(array == null) {
			System.out.println("Given array is null");
			return -1;
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
		return index;
	}
	
	private static int lastOccurrence(int[] array, int element) {
		if(array == null) {
			System.out.println("Given array is null");
			return -1;
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
		return index;
	}

}
