package com.miscellaneous.geeks.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A8LongestZeroSum {

	public static void main(String[] args) {
		int[] array = {1,1,1,0,0,0,1,1,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1};
		longestZeroSum(array);
	}

	private static void longestZeroSum(int[] array) {
		System.out.println(Arrays.toString(array));
		List<Integer> list = new ArrayList<>();
		int currSum = 0;
		int start=0, end=0, max=0, firstIndex=0;
		for (int i = 0; i < array.length; i++) {
			currSum = array[i] == 0 ? currSum - 1 : currSum + 1;
			if(currSum == 0 ) {
				printSubArray(array, 0, i);
				end = i;
				max = i+1;
			} 
			if(list.contains(currSum)) {
				firstIndex = list.indexOf(currSum);
				if(i-firstIndex > max) {
					start = firstIndex+1;
					end = i;
					max = i-firstIndex;
				}
				printSubArray(array, firstIndex+1, i);
			}
			list.add(currSum);
		}
		System.out.println("Longest Zero Sum SubArray");
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
