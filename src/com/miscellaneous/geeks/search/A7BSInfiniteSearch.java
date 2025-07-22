package com.miscellaneous.geeks.search;

public class A7BSInfiniteSearch {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,15,15,15,16,17,18,19};
		int target = 4;
		infiniteSearch(array, target);
	}

	private static void infiniteSearch(int[] array, int target) {
		if(array[0] == target) {
			System.out.println(target + " is found at the index :: " + 0);
			return;
		} else if(array[1] == target) {
			System.out.println(target + " is found at the index :: " + 1);
			return;
		}
		int low = 1, index = -1;
		
		while(array[low] < target) {
			low = low*2;
			if(array[low] == target) {
				index = low;
				break;
			}
			index = binarySearch(array, (low/2)+1, low, target);
			if(index > 0) {
				break;
			}
		}
		if(index == -1) {
			System.out.println(target + " is not found in the array");
		} else {
			System.out.println(target + " is found at the index :: " + index);
		}
	}

	private static int binarySearch(int[] array, int i, int j, int target) {
		int mid = 0;
		while(i<j) {
			mid = (i+j)/2;
			if(array[mid] == target) {
				return mid;
			} else if(array[mid] < target) {
				i = mid+1;
			} else {
				j = mid-1;
			}
		}
		return -1;
	}
	
	

}
