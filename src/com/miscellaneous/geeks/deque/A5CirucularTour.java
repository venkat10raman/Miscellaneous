package com.miscellaneous.geeks.deque;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class A5CirucularTour {

	public static void main(String[] args) {
		int[] petrol = {4,8,7,4};
		int[] distance = {6,5,3,5};
		
		System.out.println(Arrays.toString(petrol));
		System.out.println(Arrays.toString(distance));
		
		Deque<Integer> dq = new ArrayDeque<>();
		
		int currPetrol = 0;
		int start = 0;
		int end = 0;
		while(end < petrol.length) {
			
			currPetrol = currPetrol + (petrol[end]-distance[end]);
			while(!dq.isEmpty() && currPetrol <= 0) {
				int index = dq.peekFirst();
				currPetrol = currPetrol - (petrol[index] - distance[index]);
				dq.removeFirst();
				start = index;
			}
			dq.push(end);
			end++;
			end = end % petrol.length;
//			currPetrol = currPetrol <= 0 ? 0 : currPetrol;
			if(start == end) {
				System.out.println("Start at the index :: " + start);
				break;
			}
		}
	}

}
