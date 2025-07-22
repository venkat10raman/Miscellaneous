package com.miscellaneous.geeks.arrays;

import java.util.Arrays;

public class A8LeftRotate {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7};
		naiveLeftRotate(array, 6);
		
		auxSpaceRotate(array, 3);
		
		leftRotate(array, 4);
	}
	
	private static void naiveLeftRotate(int[] array, int n) {
		System.out.println(Arrays.toString(array));
		int size = array.length;
		n = n % size;
		if(n == 0) {
			System.out.println("Array is already rotated");
			return;
		}
		System.out.println("No of Rotations is :: " + n);
		for(int i=1; i <= n; i++) {
			int temp = array[0];
			for(int j=1; j<size; j++ ) {
				array[j-1] = array[j];
			}
			array[size-1] = temp;
		}
		System.out.println(Arrays.toString(array));
		System.out.println("---------------------");
	}
	
	private static void auxSpaceRotate(int[] array, int n) {
		System.out.println(Arrays.toString(array));
		int size = array.length;
		n = n % size;
		if(n == 0) {
			System.out.println("Array is already rotated");
			return;
		}
		
		System.out.println("No of Rotations is :: " + n);
		int[] temp = new int[n];
		for(int i=0; i<n; i++) {
			temp[i] = array[i];
		}
		
		for(int i=n; i<size; i++) {
			array[i-n] = array[i];
		}
		
		for(int i=0; i<n; i++) {
			array[i+n+1] = temp[i];
		}
		
		System.out.println(Arrays.toString(array));
		System.out.println("---------------------");
	}
	
	private static void leftRotate(int[] array, int n) {
		System.out.println(Arrays.toString(array));
		int size = array.length;
		n = n % size;
		if(n == 0) {
			System.out.println("Array is already rotated");
			return;
		}
		
		System.out.println("No of Rotations is :: " + n);
		reverse(array, 0, n-1);
		reverse(array, n, size-1);
		reverse(array, 0, size-1);
		System.out.println(Arrays.toString(array));
		System.out.println("---------------------");
	}
	
	private static void reverse(int[] array, int start, int end) {
		while(start < end) {
			int temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;
		}
	}

}
