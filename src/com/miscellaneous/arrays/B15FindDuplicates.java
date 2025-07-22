package com.miscellaneous.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.miscellaneous.util.CommonUtil;

public class B15FindDuplicates {

	public static void main(String[] args) {
		int[] array = { 1, 6, 5, 2, 3, 3, 2 };
		findDuplicates(array);
	}

	private static void findDuplicates(int[] array) {
		CommonUtil.printIntArray(array);
		
		Set<Integer> set = new HashSet<>();
		Arrays.stream(array)
			.boxed()
			.filter(e -> !set.add(e))
			.map(i-> i+" ")
			.forEach(System.out::print);
		System.out.println();
		List<Integer> res = new ArrayList<>();
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					if (!res.contains(array[i])) {
                        res.add(array[i]);
                    }
                    break; 
				}
			}
		}
		res.stream().map(i-> i+" ").forEach(System.out::print);
		
		
	}
}
