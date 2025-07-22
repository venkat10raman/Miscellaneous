package com.miscellaneous;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		
		int[] array = {2,5,2,9,3,4,8,7,5};
		System.out.println(Arrays.toString(array));
		System.out.println("Merge Sort");
		mergeSort(array);
		System.out.println(Arrays.toString(array));
	}
	
	private static void mergeSort(int[] array) {
		int inputArrayLenght = array.length;
		if(inputArrayLenght < 2) {
			return;
		}
		
		int midIndex = inputArrayLenght/2;
		int[] leftHalf = new int[midIndex];
		int[] rightHalf = new int[inputArrayLenght-midIndex];
		
		for(int i=0; i < midIndex ; i++) {
			leftHalf[i] = array[i];
		}
		
		for(int i=midIndex; i < inputArrayLenght ; i++) {
			rightHalf[i - midIndex] = array[i];
		}
		
		mergeSort(leftHalf);
		mergeSort(rightHalf);
		
		merge(array, leftHalf, rightHalf);
	}
	
	private static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf) {
		int leftSize = leftHalf.length;
		int rightSize = rightHalf.length;
		
		int i = 0, j = 0, k = 0;
		
		while(i < leftSize && j < rightSize) {
			if(leftHalf[i] < rightHalf[j]) {
				inputArray[k] = leftHalf[i];
				i++;
			} else {
				inputArray[k] = rightHalf[j];
				j++;
			}
			k++;
		}
		
		while(i < leftSize) {
			inputArray[k] = leftHalf[i];
			i++;
			k++;
		}
		
		while(j < rightSize) {
			inputArray[k] = rightHalf[j];
			j++;
			k++;
		}
	}
	
}
