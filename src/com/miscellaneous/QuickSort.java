package com.miscellaneous;

import java.util.Random;
import java.util.stream.IntStream;

public class QuickSort {

	public static void main(String[] args) {
		QuickSort qs = new QuickSort();
		Random random = new Random();
		int[] array = new int[10];
		IntStream.range(0, 10).forEach(i ->{
			array[i] = random.nextInt(-100,100);
		});
		qs.quickSort(array);
	}
	
	public void quickSort(int[] array) {
		printarrayay(array);
		quickSort(array, 0, array.length-1);
		printarrayay(array);
	}
	
	public void quickSort(int[] array, int lowIndex, int highIndex) {
		if(lowIndex >= highIndex) {
			return;
		}
		
		Random random = new Random();
		int pivotIndex = random.nextInt(lowIndex, highIndex+1);
		int pivot = array[pivotIndex];
		swap(array, pivotIndex, highIndex);
		
		int lp = partition(array, lowIndex, highIndex, pivot);
		quickSort(array,lowIndex, lp-1);
		quickSort(array, lp+1, highIndex);
	}
	
	public int partition(int[] array, int lowIndex, int highIndex, int pivot) {
		int leftPointer = lowIndex;
		
		// Index of smaller element and indicates
        int i = lowIndex;
		
		while(leftPointer < highIndex) {
			if (array[leftPointer] < pivot) {
                swap(array, i, leftPointer);
                i++;
            }
			leftPointer++;
		}
		swap(array, i, highIndex);
		return i;
	}
	
	public void swap(int[] array, int leftPointer, int rightPointer) {
		int temp = array[leftPointer];
		array[leftPointer] = array[rightPointer];
		array[rightPointer] = temp;
	}
	
	public void printarrayay(int[] array) {
		String sep = "";
		for(int a : array) {
			System.out.print(sep + a);
			sep = ", ";
		}
		System.out.println();
	}
}
