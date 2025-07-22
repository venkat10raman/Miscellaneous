package com.miscellaneous.geeks.arrays;

public class C1MajorityElement {

	public static void main(String[] args) {
		int[] array = {10,10,10,9,9,9,9};
		mooreAlgorithm(array);
	}

	private static void mooreAlgorithm(int[] array) {
		
		int size = array.length, votes=1, element=array[0];
		for(int i=1; i<size; i++) {
			if(array[i] == array[i-1]) {
				votes++;
			} else {
				votes--;
			}
			
			if(votes == 0){
				votes = 1;
				element = array[i];
			}
		}
		
		int count = 0;
		for(int i=1; i<size; i++) {
			if(array[i] == element) count++;
		}
		
		if(count > size/2) {
			System.out.println("Majority Element :: " + element);
		} else {
			System.out.println("No Majority Element Found");
		}
		
	}

}
