package com.miscellaneous.geeks.sorting;

import java.util.Arrays;

public class C1CycleSort {

	public static void main(String[] args) {
		int[] array = {10,20,50,40,30};
		cycleSort(array);
		System.out.println(Arrays.toString(array));
	}

	private static void cycleSort(int[] array) {
		int size = array.length;
		for (int cs = 0; cs < size; cs++) {
			int item = array[cs], pos=cs;
			for (int i = cs+1; i < size; i++) {
				if(array[i] < item) {
					pos++;
				}
			}
			
			int temp = array[pos];
			array[pos] = item;
			item = temp;
			while(pos != cs) {
				pos = cs;
				for (int i = cs+1; i < size; i++) {
					if(array[i] < item) {
						pos++;
					}
				}
				
				temp = array[pos];
				array[pos] = item;
				item = temp;
			}
			
		}
	}

}
