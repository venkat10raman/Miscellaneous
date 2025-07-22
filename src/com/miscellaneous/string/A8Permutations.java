package com.miscellaneous.string;

import java.util.HashSet;
import java.util.Set;

public class A8Permutations {

	public static void main(String[] args) {
		printPermutations("ABC", "", new HashSet<>());
		System.out.println("------");
		printPermutations("ABB", "", new HashSet<>());
		
		System.out.println("-----------");
		permutation("abc".toCharArray(), 0);
		
	}
	
	private static void printPermutations(String curr, String rem, Set<String> seen) {
		if(curr.isEmpty()) {
			if (!seen.contains(rem)) {
				System.out.println(rem);
                seen.add(rem);
			}
			return;
		}
		
		// Iterate over the string and recursively call for the remaining substring
		for (int i = 0; i < curr.length(); i++) {
			// Extract the character at index i
			char ch = curr.charAt(i);
			// Form the remaining string after excluding the character at index i
			String ros = curr.substring(0, i) + curr.substring(i + 1);
			// Recursive call with the remaining string and the accumulated result
			printPermutations(ros, rem + ch, seen);
		}
		
	}
	
	private static void swap(char[] array, int i, int j) {
		char temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	private static void permutation(char[] array, int index) {
		if(index == array.length - 1) {
			String result = new String(array);
			System.out.println(result);
			return;
		}
		
		for(int i=index; i< array.length; i++) {
			swap(array, index, i);
			permutation(array, index+1);
			swap(array, index, i);
		}
		
	}

}
