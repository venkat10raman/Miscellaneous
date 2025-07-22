package com.miscellaneous.geeks.arrays;

import java.util.Arrays;

public class B3SortedArrayFrequency {

	public static void main(String[] args) {
		int[] array = {10,10,10,30,30,40};
		printFrequency(array);
		array = new int[] {10,10,10,30,30,40,40};
		printFrequency(array);
	}
	
	private static void printFrequency(int[] array) {
		System.out.println(Arrays.toString(array));
		int left=1, right = array.length;
		int index=0, freq = 1;
		while(left < right) {
			if(array[index] == array[left]) {
				freq++;
			} else {
				System.out.println("Frequency of " + array[index] + " -> " + freq);
				index = left;
				freq = 1;
			}
			left++;
		}
		
		System.out.println("Frequency of " + array[index] + " -> " + freq);
		System.out.println("---------------");
	}

}
