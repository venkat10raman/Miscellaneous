package com.miscellaneous.geeks.sorting;

import java.util.Arrays;

public class B3ChacoloateDistribution {

	public static void main(String[] args) {
		int[] array = {7,3,1,8,9,12,56};
		int children = 3;
		chacolateDistribution(array, children);
	}

	private static void chacolateDistribution(int[] array, int children) {
		if(children > array.length) {
			System.out.println("Cannot be distributed");
			return;
		}
		
		Arrays.sort(array);
		int result = array[children-1] - array[0];
		int start = 0, end = children-1, currDiff=0;
		for (int i = 1; (i+children-1) < array.length; i++) {
			currDiff = array[i+children-1]-array[i];
			if(currDiff < result) {
				result = currDiff;
				start=i;
				end=i+children-1;
			}
		}
		
		System.out.println(Arrays.toString(array));
		System.out.println(start + " to " + end);
	}

}
