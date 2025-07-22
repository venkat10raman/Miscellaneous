package com.miscellaneous.recursion;

import java.util.ArrayList;
import java.util.List;

public class A4Josephus {

	public static void main(String[] args) {
		josephusIterative(5, 2);
		int result = josephus(5, 2);
		System.out.println("The Person survives is :: " + result);
		System.out.println("----------");
	}
	
	
	private static int josephus(int n, int k) {
		if(n==1) {
			return 0;
		}
		return (josephus(n-1, k) + k) % n;
	}
	
	private static void josephusIterative(int n, int k) {
		List<Integer> people = new ArrayList<>();
		
		// Initialize the list with people numbered from 0 to n-1
		for(int i=0; i<n; i++) {
			people.add(i);
		}
		
		int index = 0;
        // Continue until only one person remains
		while(people.size() > 1) {
			// Calculate the index of the person to be eliminated
			index = (index + k - 1) % people.size();
			people.remove(index);
		}
		
		System.out.println("The Person survives is :: " + people.get(0));
	}

}
