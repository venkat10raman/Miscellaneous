package com.miscellaneous.string;

import java.util.HashSet;
import java.util.Set;

public class A5LongestSubString {

	public static void main(String[] args) {
		longestSubString("javaconceptoftheday");
		longestSubString("thelongestsubstring");
	}
	
	private static void longestSubString(String input) {
		System.out.println("Input String is :: " + input);
		Set<Character> set = new HashSet<>();
		int left=0, maxLength=0;
		
		for(int right=0; right<input.length(); right++) {
			while(set.contains(input.charAt(right))) {
				set.remove(input.charAt(left));
				left++;
			}
			set.add(input.charAt(right));
			maxLength = Math.max(maxLength, right-left+1);
		}
		System.out.println("Longest sub-string is :: " + input.substring(left, left+maxLength));
		System.out.println("==========================");
	}

}
