package com.miscellaneous.geeks.deque;

import java.util.Arrays;

public class A4CircularTour {

	public static void main(String[] args) {
		int[] petrol = {4,8,7,4};
		int[] distance = {6,5,3,5};
		
		System.out.println(Arrays.toString(petrol));
		System.out.println(Arrays.toString(distance));
		
		for (int start = 0; start < petrol.length; start++) {
			int currPetrol = 0;
			int end = start;
			while(true) {
				currPetrol = currPetrol + (petrol[end] - distance[end]);
				if(currPetrol < 0) {
					break;
				}
				end = (end+1) % petrol.length;
				if(end == start) {
					System.out.println("Start at the index :: " + start);
					break;
				}
			}
			
		}
	}

}
