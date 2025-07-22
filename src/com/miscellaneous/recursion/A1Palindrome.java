package com.miscellaneous.recursion;

public class A1Palindrome {

	public static void main(String[] args) {
		checkPalindrome("malayalam");
		checkPalindrome("english");
	}
	
	private static void checkPalindrome(String input) {
		boolean isPalindrome = checkPalindrome(input.toCharArray(), 0, input.length()-1);
		if(isPalindrome) {
			System.out.println(input + " is a Palindrome");
		} else {
			System.out.println(input + " is not a Palindrome");
		}
	}
	
	private static boolean checkPalindrome(char[] input, int start, int end) {
		if(start >= end) return true;
		return input[start] == input[end] && checkPalindrome(input, start+1, end-1);
	}

}
