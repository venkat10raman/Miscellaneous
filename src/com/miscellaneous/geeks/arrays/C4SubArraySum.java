package com.miscellaneous.geeks.arrays;

import java.util.Arrays;

public class C4SubArraySum {

	public static void main(String[] args) {
		int[] array = {3,2,0,4,7};
		int sum = 6;
		subArrayWithGivenSum(array, sum);
	}

	private static void subArrayWithGivenSum(int[] array, int sum) {
		System.out.println(Arrays.toString(array));
		int size = array.length, currentSum=0, start=0;
		for(int end=0; end<size; end++) {
			currentSum += array[end];
			while(sum < currentSum) {
				currentSum -= array[start];
				start++;
			}
			if(sum == currentSum) {
				System.out.println("Sub Array " + start + " to " + end);
				break;
			}
		}
	}

}
