package com.miscellaneous.arrays;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class C27ElemetFrequency {

	public static void main(String[] args) {
		String[] array = {"apple", "banana", "apple", "cherry", "banana", "date"};
        System.out.println("Elements occurring more than once:");
        printDuplicates(array);
	}

	private static void printDuplicates(String[] array) {
		Map<String,Long> frequencyMap = Arrays.stream(array)
			.collect(Collectors.groupingBy(
					Function.identity(),
					Collectors.counting()
			));
		
		frequencyMap.entrySet().stream()
			.filter(entry -> entry.getValue() >1)
			.map(Map.Entry::getKey)
			.forEach(System.out::println);
	}

}
