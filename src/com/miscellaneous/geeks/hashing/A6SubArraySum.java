package com.miscellaneous.geeks.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A6SubArraySum {

	public static void main(String[] args) {
		int[] array = {9,5,8,6,13,3,-1,4,-3,1,5,4,9,3};
		int sum = 22;
		subArraySum(array, sum);
	}

	private static void subArraySum(int[] array, int sum) {
		System.out.println(Arrays.toString(array));
		int currSum = 0, diff = 0;
		List<Integer> list = new ArrayList<>();
		int start=0, end=0, max=0, firstIndex=0;
		for (int i = 0; i < array.length; i++) {
			currSum = currSum + array[i];
			diff = currSum - sum;
			if(currSum == sum) {
				end = i;
				max = i+1;
				printSubArray(array, 0, i);
			} else if(list.contains(diff)) {
				firstIndex = list.indexOf(diff);
				if(i-firstIndex > max) {
					max = i-firstIndex;
					start = firstIndex+1;
					end = i;
				}
				printSubArray(array, firstIndex+1, i);
			}
			list.add(currSum);
		}
		
		System.out.println("Longest sub array with the sum :: " + sum);
		printSubArray(array, start, end);
	}

	private static void printSubArray(int[] array, int start, int end) {
		System.out.println(" Subarray from " + start + " to " + end);
		for (int i = start; i <= end; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}
