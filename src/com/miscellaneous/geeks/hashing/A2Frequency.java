package com.miscellaneous.geeks.hashing;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class A2Frequency {

	public static void main(String[] args) {
		int[] array = {10,12,10,15,10,20,12,12};
		
		System.out.println(Arrays.toString(array));
		
		Map<Integer, Integer> map = new LinkedHashMap<>();
		for (int num : array) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
		
	}

}
