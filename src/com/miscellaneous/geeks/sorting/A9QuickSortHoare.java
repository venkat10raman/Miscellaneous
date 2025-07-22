package com.miscellaneous.geeks.sorting;

import java.util.Arrays;

public class A9QuickSortHoare {

	public static void main(String[] args) {
		int[] array = {7,7,8,9,4,1,2,3,5};
		quickSort(array);
	}
	
	private static void quickSort(int[] array) {
		System.out.println(Arrays.toString(array));
		quickSort(array, 0, array.length-1);
		System.out.println(Arrays.toString(array));
	}

	private static void quickSort(int[] array, int left, int right) {
		if(left < right) {
			int pivotIndex = hoarePartition(array, left, right);
			if(pivotIndex > 0 && pivotIndex < array.length) {
				quickSort(array, left, pivotIndex);
				quickSort(array, pivotIndex+1, right);
			}
		}
		
	}

	private static int hoarePartition(int[] array, int left, int right) {
		int pivot = array[right];
		int i=left-1, j=right+1;
		while(true) {
			do {
				i++;
			} while(array[i] < pivot);
			do {
				j--;
			} while(array[j] > pivot);
			
			if(i >= j) return j;
			swap(array, i, j);
		}
	}
	
	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}
