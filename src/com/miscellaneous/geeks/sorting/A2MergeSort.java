package com.miscellaneous.geeks.sorting;

import java.util.Random;
import java.util.stream.IntStream;

public class A2MergeSort {

	public static void main(String[] args) {
		Random random = new Random();
		int[] array = new int[10];
		IntStream.range(0, 10).forEach(i ->{
			array[i] = random.nextInt(-100,100);
		});
		
		A2MergeSort ms = new A2MergeSort();
		System.out.println("Merge Sort");
		ms.printArray(array);
		ms.mergeSort(array);
		ms.printArray(array);
	}
	
	public void mergeSort(int[] array) {
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
	
	public void merge(int[] inputArray, int[] leftHalf, int[] rightHalf) {
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
	
	public void printArray(int[] array) {
		String sep = "";
		for(int a : array) {
			System.out.print(sep + a);
			sep = ", ";
		}
		System.out.println();
	}

}
