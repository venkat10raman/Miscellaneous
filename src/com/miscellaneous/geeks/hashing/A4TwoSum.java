package com.miscellaneous.geeks.hashing;

import java.util.HashSet;
import java.util.Set;

public class A4TwoSum {

	public static void main(String[] args) {
		int[] array = {1,3,4,2,5};
		int sum = 6;
		twoSum(array, sum);
	}

	private static void twoSum(int[] array, int sum) {
		Set<Integer> set = new HashSet<>();
		for (Integer num : array) {
			if(set.contains(sum-num)) {
				System.out.println(sum-num + " + " + num + " = " + sum);
			}
			set.add(num);
		}
	}

}
