package com.miscellaneous.geeks.arrays;

import java.util.Arrays;

public class A5MoveZeroToEnd {

	public static void main(String[] args) {
		int[] array = {0,4,0,0,3,4,2,5,0,3,4,5,7};
		moveRight(array);
		array = new int[]{0,4,0,0,3,4,2,5,0,3,4,5,7};;
		moveLeft(array);
	}
	
	private static void moveRight(int[] array) {
		System.out.println(Arrays.toString(array));
		int right = array.length, index = 0;
		
		/*
		while(left < right) {
			if(array[left] != 0) {
				array[index] = array[left];
				index++;
			}
			left++;
		}
		while(index < right) {
			array[index] = 0;
			index++;
		}
		*/
		for(int i=0; i<right; i++) {
			if(array[i] != 0) {
				int temp = array[index];
				array[index] = array[i];
				array[i] = temp;
				index++;
			}
		}
		System.out.println(Arrays.toString(array));
	}
	
	private static void moveLeft(int[] array) {
		System.out.println(Arrays.toString(array));
		int right = array.length-1;
		int index = right;
		
		/*
		while(right >= left) {
			if(array[right] != 0) {
				array[index] = array[right];
				index--;
			}
			right--;
		}
		
		while(index >= left) {
			array[index] = 0;
			index--;
		}
		*/
		
		for(int i = right; i>=0; i--) {
			if(array[i] != 0) {
				int temp = array[index];
				array[index] = array[i];
				array[i] = temp;
				index--;
			}
		}
		System.out.println(Arrays.toString(array));
	}

}
