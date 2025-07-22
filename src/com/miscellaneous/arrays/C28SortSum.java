package com.miscellaneous.arrays;

import java.util.Arrays;
import java.util.Comparator;


public class C28SortSum {

	public static void main(String[] args) {
		String[] arr = new String[]{"0000", "1011", "8001", "0802", "1001", "1000"};
		Arrays.stream(arr)
			.sorted(Comparator.comparing(C28SortSum::sum))
			.forEach(System.out::println);
	}

	public static Integer sum(String num) {
		int number = Integer.valueOf(num);
		int sum = 0;
		while(number > 0) {
			sum = sum + (number % 10);
			number = number / 10;
		}
		return sum;
	}
}
