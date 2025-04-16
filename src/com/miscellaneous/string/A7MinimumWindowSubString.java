package com.miscellaneous.string;

import java.util.HashMap;
import java.util.Map;

public class A7MinimumWindowSubString {

	public static void main(String[] args) {
		minWindow("bbeessttadumbesta", "east");
	}

	private static void minWindow(String big, String small) {
		if(big.length() < small.length()) {
			System.out.println("Not found");
			System.out.println("---");
		}
		Map<Character, Integer> map = new HashMap<>();
		for(char ch : small.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}

		int left = 0, count = 0, minLen = Integer.MAX_VALUE, start = 0;
		for (int right = 0; right < big.length(); right++) {
			char ch = big.charAt(right);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) - 1);
				if (map.get(ch) >= 0) count++;
			}
			while(count == small.length()) {
				if(right-left+1 < minLen) {
					minLen = right-left+1;
					start = left;
				}
				char lc = big.charAt(left++);
				if (map.containsKey(lc)) {
					map.put(lc, map.get(lc) + 1);
					if (map.get(lc) > 0) count--;
				}
			}
		}
		String minString = minLen == Integer.MAX_VALUE ? "" :
			big.substring(start, start + minLen);
		System.out.println(minString);
		System.out.println("---");
	}

}
