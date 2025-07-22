package com.miscellaneous.geeks.search;

public class A9BSPeakElement {

	public static void main(String[] args) {
		int[] array = {5,2,0,2,4,1,6};
		naive(array);
		bsPeakElement(array);
	}

	private static void bsPeakElement(int[] array) {
		if(array == null) {
			System.out.println("Array has no elements");
			return;
		}
		
		if(array.length == 1) {
			System.out.println("Only one element in the array");
			return;
		}
		int size = array.length-1, low = 0;
		int high = size, mid = 0;
		if(array[0] > array[1]) {
			System.out.println(array[mid] + " is the peak element");
		}
		
		if(array[size] > array[size-1]) {
			System.out.println(array[size] + " is the peak element");
		}
		
		while(low < high) {
			mid = (low+high)/2;
			if(array[mid] > array[mid-1] && array[mid] > array[mid+1]) {
				System.out.println(array[mid] + " is the peak element");
				break;
			} else if(mid > 0 && array[mid] < array[mid-1]) {
				high = mid;
			} else if(high <= size && array[mid] < array[mid+1]) {
				low = mid;
			}
		}
	}

	private static void naive(int[] array) {
		if(array == null) {
			System.out.println("Array has no elements");
			return;
		}
		
		if(array.length == 1) {
			System.out.println("Only one element in the array");
			return;
		}
		int result = 0, size = array.length;
		if(array[0] > array[1]) {
			result++;
		}
		for(int i=1; i<size-2; i++ ) {
			if(array[i-1] < array[i] && array[i] > array[i+1]) {
				result++;
			}
		}
		if(array[size-2] < array[size-1]) {
			result++;
		}
		System.out.println("No of Peak Elements are :: " + result);
		System.out.println("---------------");
	}

}
