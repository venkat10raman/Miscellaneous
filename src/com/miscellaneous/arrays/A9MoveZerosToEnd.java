package com.miscellaneous.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.miscellaneous.util.CommonUtil;

public class A9MoveZerosToEnd {

	public static void main(String[] args) {
		moveZerosToEnd(new int[] {12, 0, 7, 0, 8, 0, 3});
		  
        moveZerosToEnd(new int[] {1, -5, 0, 0, 8, 0, 1});
  
        moveZerosToEnd(new int[] {0, 1, 0, 1, -5, 0, 4});
  
        moveZerosToEnd(new int[] {-4, 1, 0, 0, 2, 21, 4});
	}

	private static void moveZerosToEnd(int[] array) {
		CommonUtil.printIntArray(array);
		int arrayLength = array.length;
		int counter = 0;

		for (int i = 0; i < arrayLength; i++) {
			if(array[i] != 0) {
				//Assigning array[i] to array[counter]
				array[counter] = array[i];

				//Incrementing the counter by 1
				counter++;
			}
		}

		while (counter < arrayLength) {
			array[counter] = 0;
			counter++;
		}
		CommonUtil.printIntArray(array);
		System.out.println("Using streams");
		List<Integer> list = Stream.concat(Arrays.stream(array).boxed().filter(n -> n!= 0), 
				Arrays.stream(array).boxed().filter(n -> n ==0))
			.collect(Collectors.toList());
		System.out.println(list);
		System.out.println("----------------------");
	}

}
