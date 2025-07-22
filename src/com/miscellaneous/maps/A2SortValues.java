package com.miscellaneous.maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class A2SortValues {

	public static void main(String[] args) {
		Map<Integer, Integer> frequencyMap = new HashMap<>();
		int[] nums = new int[]{1,1,1,1,2,2,2,3,3,3,3,4,4,5,5,5,5,5};
		Arrays.stream(nums).forEach(i->{
			frequencyMap.put(i, frequencyMap.getOrDefault(i, 0)+1);
		});
        
		frequencyMap.entrySet().stream().
			sorted(Map.Entry.<Integer, Integer>comparingByValue(Comparator.reverseOrder())
//					.reversed()
					.thenComparing(Map.Entry.comparingByKey(Comparator.naturalOrder()))
//					.reversed()
					)
			.forEach(e -> {
				System.out.println(e.getKey() + " :: " + e.getValue());
			});
		
		
		System.out.println();
		
		frequencyMap.entrySet().stream().
		sorted(Map.Entry.<Integer, Integer>comparingByValue(Comparator.naturalOrder())
				.thenComparing(Map.Entry.comparingByKey(Comparator.naturalOrder()))
				)
		.forEach(e -> {
			System.out.println(e.getKey() + " :: " + e.getValue());
		}); 
		
		System.out.println();
		
		ArrayList<Entry<Integer, Integer>> entryList = new ArrayList<>(frequencyMap.entrySet());
		Collections.sort(entryList, (e1, e2)->{
			 int valueCompare = e1.getValue().compareTo(e2.getValue());
			 return valueCompare == 0 ? e1.getKey().compareTo(e2.getKey()) : valueCompare;
		});
		
		for(Map.Entry<Integer, Integer> e : entryList) {
			System.out.println(e.getKey() + " :: " + e.getValue());
		}
		
		System.out.println();
		
		entryList = new ArrayList<>(frequencyMap.entrySet());
		Collections.sort(entryList, (e1, e2) -> {
			int valueCompare = e2.getValue().compareTo(e1.getValue());
			return valueCompare == 0 ? e2.getKey().compareTo(e1.getKey()) : valueCompare;
		});
		for(Map.Entry<Integer, Integer> e : entryList) {
			System.out.println(e.getKey() + " :: " + e.getValue());
		}
		
		System.out.println();
		
		Comparator<Integer> valueThenKeyComparator = (k1, k2)->{
			int valueCompare = frequencyMap.get(k1).compareTo(frequencyMap.get(k2));
            return valueCompare == 0 ? k1.compareTo(k2) : valueCompare;
		};
		
		TreeMap<Integer, Integer> treeMap = new TreeMap<>(valueThenKeyComparator);
		treeMap.putAll(frequencyMap);
        for(Map.Entry<Integer, Integer> e : treeMap.entrySet()) {
        	System.out.println(e.getKey() + " :: " + e.getValue());
        }
	}

}
