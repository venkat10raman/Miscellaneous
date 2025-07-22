package com.miscellaneous.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.miscellaneous.util.CommonUtil;

public class B10MoveZerosToFront {

	public static void main(String[] args) {
		moveZerosToFront(new int[] {12, 0, 7, 0, 8, 0, 3});
		  
        moveZerosToFront(new int[] {1, -5, 0, 0, 8, 0, 1});
  
        moveZerosToFront(new int[] {0, 1, 0, 1, -5, 0, 4});
  
        moveZerosToFront(new int[] {-4, 1, 0, 0, 2, 21, 4});
	}

	private static void moveZerosToFront(int[] array) {
		CommonUtil.printIntArray(array);
		int elements = array.length-1;
		//Initializing counter to position of last element
		int counter = elements;
		
		//Traversing the inputArray from right to left
		for(int i=elements; i >= 0; i--) {
			if(array[i] != 0) {
				//Assigning inputArray[i] to inputArray[counter]
				array[counter] = array[i];
				counter--;
			}
		}
		
		//Assigning 0 to remaining elements
		  
        while (counter >= 0){
            array[counter] = 0;
            counter--;
        }
        
        CommonUtil.printIntArray(array);
        
        System.out.println("Using streams");
        List<Integer> list = Stream.concat(Arrays.stream(array).boxed().filter(n -> n == 0), 
        		Arrays.stream(array).boxed().filter(n -> n !=0))
    		.collect(Collectors.toList());
        System.out.println(list);
        System.out.println("------------------");
	}
}
