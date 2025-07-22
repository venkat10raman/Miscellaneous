package com.miscellaneous.arrays.mathematics;

import java.util.ArrayList;
import java.util.List;

public class A7PrimeFactors {

	public static void main(String[] args) {
		primeFactors(126);
	}
	
	private static void primeFactors(int n) {
		System.out.println("Given number is :: "+ n);
		List<Integer> result = new ArrayList<>();
		result.add(1);
		while(n % 2 == 0) {
			result.add(2);
			n = n/2;
		}
		
		while(n % 3 == 0) {
			result.add(3);
			n = n/3;
		}
		
		for(int i = 5; i*i< n; i=i+6) {
			while(n % i == 0) {
				result.add(i);
				n = n/i;
			}
			int j = i+2;
			while(n % j == 0) {
				result.add(j);
				n = n/j;
			}
		}
		if(n > 3) {
			result.add(n);
		}
		System.out.println("Prime factors of given numbers are :: "+ result);
	}

}
