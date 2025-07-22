package com.miscellaneous.geeks.hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class A9LongestIncreasingSubSequence {

	public static void main(String[] args) {
		int[] array = {1,3,9,2,8,4};
		
		Set<Integer> set = new HashSet<>();
		int temp=0, count=0, result=0,start=0;
		for (Integer num : array) {
			set.add(num);
			count = 1;
			temp=num;
			while(set.contains(--temp)) {
				count++;
			}
			if(count > result) {
				result = count;
				start=temp+1;
			}
		}
		count++;
		System.out.println(Arrays.toString(array));
		IntStream.range(start, count).forEach(e -> System.out.print(e + " "));
	}

}
