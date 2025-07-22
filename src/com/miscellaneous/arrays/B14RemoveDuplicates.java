package com.miscellaneous.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.miscellaneous.util.CommonUtil;

public class B14RemoveDuplicates {

	public static void main(String[] args) {
		removeDuplicates(new int[] {4, 3, 2, 4, 9, 2});
        
        removeDuplicates(new int[] {1, 2, 1, 2, 1, 2});
          
        removeDuplicates(new int[] {15, 21, 11, 21, 51, 21, 11});
          
        removeDuplicates(new int[] {7, 3, 21, 7, 34, 18, 3, 21});
	}
	
	private static void removeDuplicates(int[] array) {
		CommonUtil.printIntArray(array);
		int noOfUniqueElements = array.length;
		
		Set<Integer> set = new HashSet<>();
		
		int index = 0, left =0;
		while(left < noOfUniqueElements) {
			if(set.add(array[left])) {
				array[index] = array[left];
				index++;
			}
			left++;
		}
		
		System.out.println("Unique Elements are :::");
		CommonUtil.printIntArray(array, 0, index-1);
		
		for(int i=0; i<noOfUniqueElements; i++) {
			for(int j=i+1; j<noOfUniqueElements; j++) {
				//If any two elements are found equal
				if(array[i]==array[j]) {
					//Replace duplicate element with last element
					array[j] = array[noOfUniqueElements-1];
					
					//Decrementing noOfUniqueElements
					noOfUniqueElements--;
					
					j--;
				}
			}
		}
		System.out.println("Unique Elements are :::");
		CommonUtil.printIntArray(array, 0, noOfUniqueElements-1);
		
		set.clear();
		Arrays.stream(array)
				.boxed()
				.filter(e -> set.add(e))
				.map(i-> i+" ")
				.forEach(System.out::print);
		System.out.println();
		System.out.println("-------------------");
		
	}

}
