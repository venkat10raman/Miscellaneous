package com.miscellaneous.geeks.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class A7AllSubArraySum {

	public static void main(String[] args) {
		int[] array = {9,5,8,6,13,3,-1,4,-3,1,5,4,9,3};
		int sum = 22;
		longestSubArraySum(array, sum);
	}

	private static void longestSubArraySum(int[] array, int sum) {
		System.out.println(Arrays.toString(array));
		int currSum = 0, diff = 0;
		
		Map<Integer, List<Integer>> map = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			currSum = currSum + array[i];
			diff = currSum - sum;
			if(currSum == sum) {
				printSubArray(array, 0, i);
			}
			if(map.containsKey(diff)) {
				for(Integer index : map.get(diff)) {
					printSubArray(array, index+1, i);
				}
			} else {
				map.put(currSum, new ArrayList<>());
				map.get(currSum).add(i);
			}
			
			
			map.containsKey(diff);
		}
	}
	
	private static void printSubArray(int[] array, int start, int end) {
		System.out.println(" Subarray from " + start + " to " + end);
		for (int i = start; i <= end; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}
