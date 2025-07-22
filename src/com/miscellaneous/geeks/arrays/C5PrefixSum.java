package com.miscellaneous.geeks.arrays;

import java.util.Arrays;

public class C5PrefixSum {
	
	private static int[] prefixSumArray ;

	public static void main(String[] args) {
		int[] array = {2,8,3,9,6,5,4};
		System.out.println(Arrays.toString(array));
		int size = array.length, prefixSum=0;
		prefixSumArray = new int[size];
		for(int i=0; i<size; i++) {
			prefixSum += array[i];
			prefixSumArray[i] = prefixSum;
		}
		
		querySum(3,6);
	}

	private static void querySum(int start, int end) {
		int result = 0;
		if(start == 0) {
			result = prefixSumArray[end];
		} else {
			result = prefixSumArray[end] - prefixSumArray[start-1];
		}
		System.out.println("Sub Array Sum :: " + start + " to " + end + " :: " + result);
	}

}
