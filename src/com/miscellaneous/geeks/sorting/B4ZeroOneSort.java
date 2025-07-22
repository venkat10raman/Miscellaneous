package com.miscellaneous.geeks.sorting;

import java.util.Arrays;

public class B4ZeroOneSort {

	public static void main(String[] args) {
		sortBinaryArray(new int[] {1, 0, 1, 1, 0, 1, 0, 1});
		sortBinaryArray(new int[] {1, 1, 1, 1, 0, 0, 0, 0});
		sortBinaryArray(new int[] {1, 1, 0, 0, 1, 1, 0, 0});
	}

	private static void sortBinaryArray(int[] array) {
		System.out.println(Arrays.toString(array));
		int size = array.length, index = 0;
		for(int i=0; i<size; i++) {
			if(array[i] == 0) {
				int temp = array[index];
				array[index] = array[i];
				array[i] = temp;
				index++;
			}
		}
		System.out.println(Arrays.toString(array));
		System.out.println("--------------------");
	}

}
