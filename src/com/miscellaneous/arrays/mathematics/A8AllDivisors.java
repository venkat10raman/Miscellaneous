package com.miscellaneous.arrays.mathematics;

import java.util.ArrayList;
import java.util.List;

public class A8AllDivisors {

	public static void main(String[] args) {
		printDivisors(126);
		printDivisorsSortedOrder(126);
	}
	
	private static void printDivisors(int n) {
		System.out.println("Given number is :: "+ n);
		List<Integer> result = new ArrayList<>();
		
		for(int i=1; i*i < n; i++) {
			if(n%i == 0) {
				result.add(i);
				if(i != n/i) {
					result.add(n/i);
				}
			}
		}
		System.out.println("Divisors of given numbers are :: "+ result);
	}
	
	private static void printDivisorsSortedOrder(int n) {
		System.out.println("Given number is :: "+ n);
		List<Integer> result = new ArrayList<>();
		int i = 0;
		for(i=1; i*i < n; i++) {
			if(n%i == 0) {
				result.add(i);
			}
		}
		for(; i >= 1; i--) {
			if(n%i == 0) {
				result.add(n/i);
			}
		}
		System.out.println("Divisors of given numbers are :: "+ result);
	}

}
