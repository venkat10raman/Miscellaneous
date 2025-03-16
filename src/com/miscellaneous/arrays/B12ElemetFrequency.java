package com.miscellaneous.arrays;

import java.util.HashMap;
import java.util.Map;

import com.miscellaneous.util.CommonUtil;

public class B12ElemetFrequency {

	public static void main(String[] args) {
		arrayElementCount(new int[]{4, 5, 4, 5, 4, 6});

		arrayElementCount(new int[]{12, 9, 12, 9, 10, 9, 10, 11});

		arrayElementCount(new int[]{891, 187, 891, 187, 891, 476, 555, 741});
	}

	private static void arrayElementCount(int[] array) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : array) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			} else {
				map.put(i, 1);
			}
		}
		CommonUtil.printIntArray(array);
		System.out.println("Element Count : "+map);
		System.out.println("-------------------------");
	}
}
