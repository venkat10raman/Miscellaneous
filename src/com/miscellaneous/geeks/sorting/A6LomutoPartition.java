package com.miscellaneous.geeks.sorting;

import java.util.Arrays;

public class A6LomutoPartition {

	public static void main(String[] args) {
		int[] array = {7,7,8,9,4,1,2,3,5};
		lomutoPartition(array);
	}

	private static void lomutoPartition(int[] array) {
		System.out.println(Arrays.toString(array));
		int size = array.length, index = 0;
		int pivotIndex = size-1;
		
		for(int i=0; i<pivotIndex; i++) {
			if(array[i] < array[pivotIndex]) {
				int temp = array[index];
				array[index] = array[i];
				array[i] = temp;
				index++;
			}
		}
		
		int temp = array[index];
		array[index] = array[pivotIndex];
		array[pivotIndex] = temp;
		System.out.println(Arrays.toString(array));
	}
	

}
