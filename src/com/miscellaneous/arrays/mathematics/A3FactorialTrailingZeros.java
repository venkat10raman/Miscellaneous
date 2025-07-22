package com.miscellaneous.arrays.mathematics;

public class A3FactorialTrailingZeros {

	public static void main(String[] args) {
		trailingZerosinFactorial(126);
		trailingZerosinFactorial(256);
	}
	
	private static void trailingZerosinFactorial(int num) {
		int result = 0;
		for(int i = 5; i < num; i = i*5) {
			result = result + (num/i);
		}
		System.out.println("The factorial of " + num + " has "+ result + " trailing zeros in its factorial");
	}

}
