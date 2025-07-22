package com.miscellaneous.geeks.arrays;

public class C6MinimumFlips {

	public static void main(String[] args) {
		int[] array = {0,0,1,1,1,1,1,0,1,1};
		minimumFlips(array);
	}
	
	private static void minimumFlips(int[] array) {
		int size = array.length, start = array[0];
		
		for(int i=1; i<size; i++ ) {
			if(array[i] != array[i-1]) {
				if(array[i] == start) {
					System.out.println(i-1);
				} else {
					System.out.print("From " + (i) + " to ");
				}
			}
		}
		if(array[size-1] != start) {
			System.out.println(size-1);
		}
		System.out.println("---------------------");
	}

}
