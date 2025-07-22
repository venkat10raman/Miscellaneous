package com.miscellaneous.arrays.mathematics;

public class A1CountDigits {

	public static void main(String[] args) {
		countDigits(123);
		countDigits(5);
	}
	
	private static int countDigits(int num) {
		int temp = num;
		int result = 0;
		while(temp > 0) {
			temp = temp/10;
			result++;
		}
		System.out.println("The number " + num + " has " +result+ " digits");
		return result;
	}

}
