package com.miscellaneous.maps;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class A1SortValues {

	public static void main(String[] args) {
		// Create a sample map
		Map<String, Integer> map = new HashMap<>();
		map.put("Alice", 25);
		map.put("Bob", 30);
		map.put("Charlie", 25);
		map.put("David", 35);
		map.put("Eve", 20);

		// Print original map
		System.out.println("Original Map: " + map);


		Map<String, Integer> sortedByValueAsc = map.entrySet().stream()
				.sorted(Map.Entry.<String, Integer>comparingByValue()
						.thenComparing(Map.Entry.comparingByKey()))
				.collect(Collectors.toMap(
						Map.Entry::getKey, 
						Map.Entry::getValue,
						(e1,e2) -> e2, // Merge function (not used here)
						LinkedHashMap::new // Preserve order
						));

		// Print sorted map (ascending)
		System.out.println("Sorted by Value (Ascending): " + sortedByValueAsc);

		// Sort by values (descending) and by keys for ties
		Map<String, Integer> sortedByValueDesc = map.entrySet().stream()
				.sorted(Map.Entry.<String, Integer>comparingByValue(Comparator.reverseOrder())
						.thenComparing(Map.Entry.comparingByKey()))
				.collect(Collectors.toMap(
						Map.Entry::getKey,
						Map.Entry::getValue,
						(e1, e2) -> e1,
						LinkedHashMap::new
						));

		// Print sorted map (descending)
		System.out.println("Sorted by Value (Descending): " + sortedByValueDesc);


		// Empty map
		Map<String, Integer> emptyMap = new HashMap<>();
		Map<String, Integer> sortedEmpty = emptyMap.entrySet().stream()
				.sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(
						Map.Entry::getKey,
						Map.Entry::getValue,
						(e1, e2) -> e1,
						LinkedHashMap::new
						));
		System.out.println("Sorted Empty Map: " + sortedEmpty);

		// Map with duplicate values
		Map<String, Integer> duplicateValues = new HashMap<>();
		duplicateValues.put("Xavier", 10);
		duplicateValues.put("Yvonne", 10);
		duplicateValues.put("Zoe", 10);
		Map<String, Integer> sortedDuplicates = duplicateValues.entrySet().stream()
				.sorted(Map.Entry.<String, Integer>comparingByValue()
						.thenComparing(Map.Entry.comparingByKey()))
				.collect(Collectors.toMap(
						Map.Entry::getKey,
						Map.Entry::getValue,
						(e1, e2) -> e1,
						LinkedHashMap::new
						));
		System.out.println("Sorted Map with Duplicate Values: " + sortedDuplicates);
	}




}
