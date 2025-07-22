package com.miscellaneous.string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class A9CharacterFrequency {

	public static void main(String[] args) {
		String input = "hello world";
        Map<Character, Integer> result = getCharFrequency(input);
        System.out.println("Character frequencies: " + result);
        streamsCharFrequency(input);
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
		System.out.println("--------------");
		return frequencyMap;
	}
	
	
	private static void streamsCharFrequency(String input) {
		if(input == null || input.isBlank()) {
			return;
		}
		
		LinkedHashMap<Character,Long> map = input.chars()
			.mapToObj(c -> (char) c)
			.filter(c -> c != ' ')
			.collect(Collectors.groupingBy(
					Function.identity(),
					LinkedHashMap::new,
					Collectors.counting()
			));
		
		map.forEach((ch, count) -> {
			System.out.println("'" + ch + "' -> " + count);
		});
	}

}
