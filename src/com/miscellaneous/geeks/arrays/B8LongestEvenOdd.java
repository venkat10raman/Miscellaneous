package com.miscellaneous.geeks.arrays;

import java.util.Arrays;

public class B8LongestEvenOdd {

	public static void main(String[] args) {
		int[] array = {10,12,14,7,8,9,10};
		naive(array);
	}

	private static void naive(int[] array) {
		int size = array.length, result = 0, count =0;
		
		int prev =0, curr =0;
		for(int i=0; i<size; i++) {
			count =1;
			for(int j=i+1; j<size; j++) {
				prev = array[j-1];
				curr = array[j];
				if(prev%2 != curr%2) {
					count++;
				}
			}
			result = Math.max(count, result);
		}
		
		System.out.println(Arrays.toString(array));
		System.out.println("Max occurance :: " + result);
		kadaneAlgorithm(array);
		System.out.println("--------------------");
	}

	private static void kadaneAlgorithm(int[] array) {
		int size = array.length, result = 0, count =0;
		int prev =0, curr =0;
		for(int i=1; i<size; i++) {
			prev = array[i-1];
			curr = array[i];
			if(prev%2 == curr%2) {
				count = 1;
			} else {
				count++;
			}
			result = Math.max(count, result);
		}
		System.out.println("Max occurance :: " + result);
	}

}
