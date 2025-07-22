package com.miscellaneous.geeks.sorting;

import java.util.Arrays;

public class B5DutchFlag {

	public static void main(String[] args) {
		int[] array = {2, 0, 1, 2, 1, 0, 0, 1, 2};
		sortDutchFlag(array);
	}

	private static void sortDutchFlag(int[] array) {
		System.out.println(Arrays.toString(array));
		int low = 0;           // Points to the start of the 1s section
        int mid = 0;           // Iterates through the array
        int high = array.length - 1; // Points to the end of the 1s section
        
        while(mid <= high) {
        	if(array[mid] == 0) {
        		int temp = array[low];
        		array[low] = array[mid];
        		array[mid] = temp;
        		low++;
        		mid++;
        	} else if(array[mid] == 1) {
        		mid++;
        	} else {
        		int temp = array[high];
        		array[high] = array[mid];
        		array[mid] = temp;
        		high--;
        	}
        }
        System.out.println(Arrays.toString(array));
	}

}
