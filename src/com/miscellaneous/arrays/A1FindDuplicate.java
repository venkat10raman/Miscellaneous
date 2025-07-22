package com.miscellaneous.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

import com.miscellaneous.util.CommonUtil;

public class A1FindDuplicate {

	public static void main(String[] args) {
		int[] array = new int[10];
		
		Random random = new Random();
		for(int i=0; i < 10; i++) {
			array[i] = random.nextInt(-20, 20);
		}
		CommonUtil.printIntArray(array);
		
		usingHashMap(array);
		usingHashSet(array);
	}

	private static void usingHashSet(int[] array) {
		Set<Integer> uniqueElements = new HashSet<>();
		Set<Integer> duplicateElements = Arrays.stream(array)
			.filter(i -> !uniqueElements.add(i))
			.boxed()
			.collect(Collectors.toSet());
		System.out.println(duplicateElements);
	}

	private static void usingHashMap(int[] array) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int element : array) {
			map.putIfAbsent(element, 0);
			map.put(element, map.get(element)+1);
			
//			map.put(element, map.getOrDefault(element, 0)+1);
		}
		
		Set<Entry<Integer,Integer>> entrySet = map.entrySet();
		for (Entry<Integer, Integer> entry : entrySet) {
			if(entry.getValue() > 1) {
				System.out.print(entry.getKey() + " ");
			}
		}
		System.out.println();
		List<Integer> duplicateList = map.entrySet().stream()
			.filter(es -> es.getValue() > 1)
			.map(es -> es.getKey())
			.collect(Collectors.toList());
		System.out.println(duplicateList);
		
		List<Integer> distinctList = map.entrySet().stream()
			.filter(es -> es.getValue() == 1)
			.map(es -> es.getKey())
			.collect(Collectors.toList());
		
		System.out.println(distinctList);
	}

}
