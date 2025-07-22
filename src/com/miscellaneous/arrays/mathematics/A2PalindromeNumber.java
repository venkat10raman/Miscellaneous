package com.miscellaneous.arrays.mathematics;

public class A2PalindromeNumber {

	public static void main(String[] args) {
		palindrome(12321);
		palindrome(1729);
	}
	
	private static void palindrome(int num) {
		int temp = num;
		int result = 0;
		
		while(temp > 0) {
			result = (result * 10) + (temp %10);
			temp = temp/10;
		}
		if(result == num) {
			System.out.println(num + " is a palindrome numbers");
		} else {
			System.out.println(num + " is not a palindrome numbers");
		}
	}

}
