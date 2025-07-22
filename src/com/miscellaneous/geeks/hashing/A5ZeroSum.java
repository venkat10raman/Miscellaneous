package com.miscellaneous.geeks.hashing;

import java.util.ArrayList;
import java.util.List;

public class A5ZeroSum {

	public static void main(String[] args) {
		int[] array = {0,-5,1,4,13,-3,-10,5,4,-3,1,-2,1};
		zeroSum(array);
	}

	private static void zeroSum(int[] array) {
		List<Integer> list = new ArrayList<>();
		int currSum = 0;
		for (int i = 0; i < array.length; i++) {
			currSum = currSum + array[i];
			if(currSum == 0) {
				System.out.println(" Subarray from " + 0 + " to " + i);
			} else if(array[i] == 0) {
				System.out.println(" Subarray from " + i + " to " + i);
			}
			if(list.contains(currSum)) {
				System.out.println(" Subarray from " + (list.indexOf(currSum)+1) + " to " + i);
			}
			list.add(currSum);
		}
		
	}

}
