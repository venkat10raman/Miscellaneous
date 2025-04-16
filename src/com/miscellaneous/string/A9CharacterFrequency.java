package com.miscellaneous.string;

import java.util.HashMap;
import java.util.Map;

public class A9CharacterFrequency {

	public static void main(String[] args) {
		String input = "hello world";
        Map<Character, Integer> result = getCharFrequency(input);
        System.out.println("Character frequencies: " + result);
	}

	private static Map<Character, Integer> getCharFrequency(String input) {
		if(input == null || input.isBlank()) {
			return new HashMap<>();
		}
		Map<Character, Integer> frequencyMap = new HashMap<>();
		for(char c : input.toCharArray()) {
			if(c != ' ') {
				frequencyMap.put(c, frequencyMap.getOrDefault(c, 0)+1);
			}
		}
		return frequencyMap;
	}

}
