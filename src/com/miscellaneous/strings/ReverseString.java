package com.miscellaneous.strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseString {

	public static void main(String[] args) {
		ReverseString rs = new ReverseString();
		rs.usingCharAt("Geeks");
		rs.usingToCharArray("GeeksForGeeks");
		rs.reverseSentence("Programming is not fun");
		rs.reverseIndividual("Programming is not fun");
	}
	
	public void usingCharAt(String str) {
		StringBuilder sb = new StringBuilder();
		int maxIndex = str.length()-1;
		for(int i= maxIndex; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		System.out.println(sb.toString());
	}
	
	public void usingToCharArray(String str) {
		StringBuilder sb = new StringBuilder();
		char[] arr = str.toCharArray();
		int maxIndex = arr.length-1;
		for(int i=maxIndex; i>=0; i--) {
			sb.append(arr[i]);
		}
		System.out.println(sb.toString());
	}
	
	public void reverseSentence(String sentence) {
		String[] arr = sentence.split(" ");
		int maxIndex = arr.length - 1;
		StringBuilder sb = new StringBuilder();
		String sep = "";
		while(maxIndex >= 0) {
			sb.append(sep).append(arr[maxIndex]);
			--maxIndex;
			sep = " ";
		}
		System.out.println(sb.toString());
	}
	
	public void reverseIndividual(String sentence) {
		String output = Arrays.asList(sentence.split(" ")).stream()
			.map(word -> new StringBuilder(word).reverse())
			.collect(Collectors.joining(" "));
		System.out.println(output);
	}

}
