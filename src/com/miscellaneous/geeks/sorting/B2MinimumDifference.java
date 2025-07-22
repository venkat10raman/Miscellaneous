package com.miscellaneous.geeks.sorting;

import java.util.Arrays;

public class B2MinimumDifference {

	public static void main(String[] args) {
		int[] array = {1,8,12,5,18};
		minimumDifference(array);
	}

	private static void minimumDifference(int[] array) {
		int size = array.length;
		if(size == 1) {
			System.out.println("Minimum Difference is :: " + Integer.MAX_VALUE);
		} else {
			Arrays.sort(array);
			System.out.println(Arrays.toString(array));
			int start=0, end=size-1, result=array[1]-array[0], currDiff=0;
			for (int i = 2; i < array.length; i++) {
				currDiff = array[i]-array[i-1];
				if(currDiff < result) {
					result = currDiff;
					start = i-1;
					end = i;
				}
			}
			
			System.out.println("Minimum Difference is :: " + result);
			System.out.println(array[start] + " - " + array[end] + " = " + result);
		}
	}

}
