package com.miscellaneous.arrays;

import com.miscellaneous.util.CommonUtil;

public class A7ZOTSort {

	public static void main(String[] args) {
		zotSort(new int[] {1, 0, 2, 2, 0, 2, 1, 2, 1, 1, 2, 0});
		zotSort(new int[] {1, 2, 0, 2, 0, 1, 0, 2, 1, 0, 0, 2});
		zotSort(new int[] {2, 1, 0, 0, 1, 2, 2, 0, 1, 0, 2, 1});
          
	}
	
	private static void zotSort(int[] array) {
		CommonUtil.printIntArray(array);
		
		int low = 0;
		int mid = 0;
		int high = array.length-1;
		
		//Until mid doesn't cross high
		while(mid <= high) {
			
			//If an element is 0, bring it to the beginning
			if(array[mid] == 0) {
				CommonUtil.swap(array, low, mid);
				low++;
				mid++;
			} else if(array[mid] == 2) {
				//If an element is 2, send it to the end
				CommonUtil.swap(array, mid, high);
				high--;
			} else {
				//If an element is 1, let it be there only
				mid++;
			}
		}
		
		CommonUtil.printIntArray(array);
		System.out.println("=====================================");

	}

}
