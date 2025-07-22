package com.miscellaneous.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.miscellaneous.util.CommonUtil;

public class B13ReverseArray {

	public static void main(String[] args) {
		reverseArray(new int[]{4, 5, 8, 9, 10});

		reverseArray(new int[]{12, 9, 21, 17, 33, 7});

		reverseArray(new int[]{891, 569, 921, 187, 343, 476, 555});
	}

	private static void reverseArray(int array[]) {
		CommonUtil.printIntArray(array);
		List<Integer> reverseList = Arrays.stream(array)
			.boxed()
			.sorted(Comparator.reverseOrder())
			.collect(Collectors.toList());

		int left = 0;
		int right = array.length-1;
		while(left < right) {
			CommonUtil.swap(array, left, right);
			left++;
			right--;
		}
		CommonUtil.printIntArray(array);
		System.out.println(reverseList);
		System.out.println("----------------");
	}
}
