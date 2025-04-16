package com.miscellaneous;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

	public static void main(String[] args) {
		int[] testNumbers = {1, 19, 2, 23, 4, 0};

		for (int num : testNumbers) {
			System.out.println("Is " + num + " a happy number? " + isHappy(num));
		}
	}

	private static boolean isHappy(int num) {
		if(num <=0) {
			return false;
		}
		Set<Integer> seen = new HashSet<>();
		while(num!=1) {
			if (!seen.add(num)) {
                return false; // Cycle detected, not happy
            }
			num = sumOfSquareDigits(num);
		}
		return true;
	}

	private static int sumOfSquareDigits(int num) {
		int sum = 0;
		while(num>0) {
			int digit = num%10;
			digit = digit * digit;
			sum = sum + digit;
			num = num/10;
		}
		return sum;
	}

}
