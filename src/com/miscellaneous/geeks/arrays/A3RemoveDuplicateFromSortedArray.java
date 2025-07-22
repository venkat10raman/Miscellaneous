package com.miscellaneous.geeks.arrays;

import java.util.Arrays;

public class A3RemoveDuplicateFromSortedArray {

	public static void main(String[] args) {
		int[] array = {1,2,2,3,3,4,4,4,5,5,5,88};
		naiveApproach(array);
		array = new int[]{1,2,2,3,3,4,4,4,5,5,5,88};
		removeDuplicate(array);
	}
	
	private static void naiveApproach(int[] array) {
		int size = array.length, index = 1;
		int[] temp = new int[size];
		temp[0] = array[0];
		
		for(int i=1; i<size; i++) {
			if(array[i] != temp[index-1]) {
				temp[index] = array[i];
				index++;
			}
		}
		
		
		for(int i=1; i<index; i++) {
			array[i] = temp[i];
		}
		
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(temp));
		System.out.println(index);
	}
	
	private static void removeDuplicate(int[] array) {
		int size = array.length, index = 1;
		
		for(int i=1; i<size; i++) {
			if(array[i] != array[index-1]) {
				array[index] = array[i];
				index++;
			}
		}
		System.out.println(Arrays.toString(array));
	}

}
