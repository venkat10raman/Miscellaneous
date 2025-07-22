package com.miscellaneous.geeks.hashing;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class A3Intersection {

	public static void main(String[] args) {
		int[] a = {10,15,20,25,30,50};
		int[] b = {30,5,15,80};
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		intersection(a, b);
		union(a,b);
	}

	private static void union(int[] a, int[] b) {
		Set<Integer> set = new LinkedHashSet<>();
		for (Integer num : a) {
			set.add(num);
		}
		for (Integer num : b) {
			set.add(num);
		}
		System.out.println(set);
	}

	private static void intersection(int[] a, int[] b) {
		Set<Integer> set = new LinkedHashSet<>();
		for (Integer num : a) {
			set.add(num);
		}
		for (Integer num : b) {
			if(set.contains(num)) {
				System.out.print(num + " --> ");
			}
		}
		System.out.println();
	}

}
