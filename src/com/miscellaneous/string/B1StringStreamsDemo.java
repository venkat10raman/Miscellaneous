package com.miscellaneous.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class B1StringStreamsDemo {

	public static void main(String[] args) {
		// Sample data: List of strings
		// Include edge cases: empty, null, spaces
        List<String> names = Arrays.asList(
                "Alice", "Bob", "Charlie", "David", "Eve",
                "", null, "Alice", "  Zara  " 
        );

        // --- Example 1: Filter strings by length ---
        System.out.println("Example 1: Filter strings with length > 3");
        List<String> longNames = names.stream()
                .filter(s -> s != null && s.length() > 3)
                .collect(Collectors.toList());
        System.out.println(longNames); 
        // [Alice, Charlie, David, Zara]

        // --- Example 2: Map strings to uppercase ---
        System.out.println("\nExample 2: Convert strings to uppercase");
        List<String> upperNames = names.stream()
                .filter(Objects::nonNull)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(upperNames); 
        // [ALICE, BOB, CHARLIE, DAVID, EVE, ALICE,   ZARA  ]

        // --- Example 3: Sort strings lexicographically ---
        System.out.println("\nExample 3: Sort strings lexicographically (ignoring null/empty)");
        List<String> sortedNames = names.stream()
                .filter(s -> s != null && !s.trim().isEmpty())
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedNames); 
        // [Alice, Alice, Bob, Charlie, David, Eve, Zara]

        // --- Example 4: Sort strings by length (then lexicographically) ---
        System.out.println("\nExample 4: Sort strings by length, then lexicographically");
        List<String> sortedByLength = names.stream()
                .filter(s -> s != null && !s.trim().isEmpty())
                .sorted(Comparator.comparingInt(String::length)
                        .thenComparing(Comparator.naturalOrder()))
                .collect(Collectors.toList());
        System.out.println(sortedByLength); 
        // [Bob, Eve, Zara, Alice, Alice, David, Charlie]

        // --- Example 5: Group strings by length ---
        System.out.println("\nExample 5: Group strings by length");
        Map<Integer, List<String>> groupedByLength = names.stream()
                .filter(s -> s != null && !s.trim().isEmpty())
                .collect(Collectors.groupingBy(String::length));
        System.out.println(groupedByLength); 
        // {3=[Bob, Eve], 5=[Alice, Alice, David, Zara], 7=[Charlie]}

        // --- Example 6: Count distinct strings ---
        System.out.println("\nExample 6: Count distinct non-null/empty strings");
        long distinctCount = names.stream()
                .filter(s -> s != null && !s.trim().isEmpty())
                .distinct()
                .count();
        System.out.println("Distinct count: " + distinctCount); // 7

        // --- Example 7: Stream characters of a single string ---
        System.out.println("\nExample 7: Filter vowels from a string");
        String text = "Hello, World!";
        String vowels = text.chars()
                .filter(c -> "aeiouAEIOU".indexOf(c) != -1)
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
        System.out.println("Vowels: " + vowels); // eo

        // --- Example 8: Split string and process words ---
        System.out.println("\nExample 8: Process words from a sentence");
        String sentence = "Java is awesome and fun";
        List<String> wordsStartingWithA = Stream.of(sentence.split("\\s+"))
                .filter(word -> word.startsWith("a"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        Map<char[],Long> collect = Stream.of(sentence.toCharArray())
        	.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Words starting with 'a': " + wordsStartingWithA); // [AWESOME, AND]

        // --- Example 9: Handle empty list ---
        System.out.println("\nExample 9: Handle empty list");
        List<String> emptyList = Collections.emptyList();
        List<String> processedEmpty = emptyList.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
        System.out.println("Processed empty list: " + processedEmpty); // []

        // --- Example 10: Join strings with delimiter ---
        System.out.println("\nExample 10: Join non-null/empty strings with comma");
        String joined = names.stream()
                .filter(s -> s != null && !s.trim().isEmpty())
                .collect(Collectors.joining(", "));
        System.out.println("Joined: " + joined); 
        // Alice, Bob, Charlie, David, Eve, Alice, Zara
    
	}
	
	

}
