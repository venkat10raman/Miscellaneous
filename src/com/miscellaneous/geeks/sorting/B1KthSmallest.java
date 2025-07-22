package com.miscellaneous.geeks.sorting;

import java.util.Arrays;

public class B1KthSmallest {

	public static void main(String[] args) {
		//assume all elements are distinct
		int[] array = {7,8,9,4,0,1,2,3,5};
		kthSmallest(array,4);
	}

	private static void kthSmallest(int[] array,int i) {
		System.out.println(Arrays.toString(array));
		int left=0, right=array.length-1;
		while(left <= right) {
			int pivotIndex = lomutoPartition(array, left, right);
			if(pivotIndex == i-1) {
				System.out.println(array[pivotIndex]);
				break;
			} else if(pivotIndex < i-1) {
				left = pivotIndex+1;
			} else {
				right = pivotIndex-1;
			}
		}
		
		if(left > right) {
			System.out.println("Invalid input");
		} else {
			System.out.println(Arrays.toString(array));
		}
	}
	
	private static int lomutoPartition(int[] array, int low, int high) {
		int index = low, pivotIndex = high;
		
		for(int i=low; i<pivotIndex; i++) {
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
		return index;
	}

}
