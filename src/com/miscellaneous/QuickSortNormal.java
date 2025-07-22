package com.miscellaneous;

import java.util.Random;
import java.util.stream.IntStream;

import com.miscellaneous.util.CommonUtil;

public class QuickSortNormal {

	public static void main(String[] args) {
		QuickSortNormal qs = new QuickSortNormal();
		Random random = new Random();
		int[] array = new int[10];
		IntStream.range(0, 10).forEach(i ->{
			array[i] = random.nextInt(-100,100);
		});
		qs.quickSort(array);
	}

	private void quickSort(int[] array) {
		CommonUtil.printIntArray(array);
		quickSort(array, 0, array.length-1);
		CommonUtil.printIntArray(array);
	}

	private void quickSort(int[] array, int left, int right) {
		if(left >= right) {
			return;
		}
		
		int pivotIndex = partition(array, left, right);
		quickSort(array, left, pivotIndex-1);
		quickSort(array, pivotIndex+1, right);
	}

	private int partition(int[] array, int left, int right) {
		int pivot = array[right];
		int pivotIndex = right;
		
		int lp = left;
		int i = left;
		while(lp < right) {
			if(array[lp] < pivot) {
				swap(array, i, lp);
				i++;
			}
			lp++;
		}
		swap(array, i, pivotIndex);
		return i;
	}
	
	public void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}
