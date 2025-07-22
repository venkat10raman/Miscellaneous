package com.miscellaneous.geeks.hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class B1DistinctElements {

	public static void main(String[] args) {
		int[] array = {10,20,20,30,10,20,40,10,40,30};
		int window = 4;
		slidingWindow(array, window);
	}

	private static void slidingWindow(int[] array, int window) {
		Map<Integer, Integer> map = new LinkedHashMap<>();
		int start=0, end=window, result = 0;
		
		for (int i = 0; i < window; i++) {
			map.put(array[i], map.getOrDefault(array[i], 0)+1);
		}
		result = map.size();
		
		for (int i = window; i < array.length; i++) {
			map.put(array[i-window], map.get(array[i-window])-1);
			if(map.get(array[i-window]) == 0) {
				map.remove(array[i-window]);
			}
			map.put(array[i], map.getOrDefault(array[i], 0)+1);
			if(map.size() > result) {
				start = i-window+1;
				end = i;
				result = map.size();
			}
		}
		System.out.println(Arrays.toString(array));
		System.out.println("Largest Distinct elements Subset");
		System.out.println("Index from " + start + " to " + end);
		for (int i = start; i <= end; i++) {
			System.out.print(array[i] + " ");
		}
		
	}

}
