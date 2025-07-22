package com.miscellaneous.geeks.sorting;

import java.util.Arrays;

public class A7HoarePartition {

	public static void main(String[] args) {
		int[] array = {7,7,8,9,4,1,2,3,5};
		hoarePartition(array);
	}

	private static void hoarePartition(int[] array) {
		System.out.println(Arrays.toString(array));
		int size = array.length;
		int pivot = array[size-1];
		
		int i = 0, j = size-1;
		while(true) {
			while(array[i] < pivot) {
				i++;
			}
			
			while(array[j] > pivot) {
				j--;
			}
			
			if(i >= j) break;
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
		System.out.println(Arrays.toString(array));
	}

}
