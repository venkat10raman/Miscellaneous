package com.miscellaneous.geeks.hashing;

import java.util.Arrays;
import java.util.HashSet;

public class A1CountDistinct {

	public static void main(String[] args) {
		int[] array = {10,20,10,20,30};
		
		HashSet<Integer> set = new HashSet<>();
		for (Integer num : array) {
			set.add(num);
		}
		System.out.println(Arrays.toString(array));
		System.out.println("Distinct Element Count :: " + set.size());
	}

}
