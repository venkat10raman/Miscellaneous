package com.miscellaneous;

import java.util.Random;
import java.util.stream.IntStream;

import com.miscellaneous.util.CommonUtil;

public class PartitionArray {

	public static void main(String[] args) {
		PartitionArray pa = new PartitionArray();
		Random random = new Random();
		int[] array = new int[10];
		IntStream.range(0, 10).forEach(i ->{
			array[i] = random.nextInt(-10,10);
		});
		CommonUtil.printIntArray(array);
		int pointer = pa.partition(array, 0, array.length-1);
		System.out.println("Pointer Index :: "+ pointer);
		CommonUtil.printIntArray(array);

	}
	
	public int partition(int[] arr, int lp, int rp) {
		int pivot = arr[rp];
		int pointer = lp;
		while(lp < rp) {
			if(arr[lp] < pivot) {
				swap(arr, pointer, lp);
				pointer++;
			}
			lp++;
		}
		swap(arr, pointer, lp);
		return pointer;
	}
	
	public void swap(int[] array, int pointer, int left) {
		int temp = array[pointer];
		array[pointer] = array[left];
		array[left] = temp;
	}

}
