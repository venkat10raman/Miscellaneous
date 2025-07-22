package com.miscellaneous.recursion;

public class A2Subsets {

	public static void main(String[] args) {
		subsets("abc");
	}
	
	private static void subsets(String input) {
		subsets(input.toCharArray(), "", 0);
	}

	private static void subsets(char[] input, String curr, int i) {
		if(i == input.length) {
			System.out.println(curr);
			return;
		}
		subsets(input, curr, i+1);
		
		subsets(input, curr+input[i], i+1);
	}
	
	

}
