package com.miscellaneous.geeks.search;

public class B1BSTwoPointer {

	public static void main(String[] args) {
		int[] array = {2,3,8,9};
		int sum = 11;
		naive(array, sum);
		twoPair(array, sum);
	}

	private static void naive(int[] array, int sum) {
		int size = array.length;
		for(int i=0; i<size-1; i++) {
			for(int j=i+1; j<size; j++) {
				if(array[i]+array[j] == sum) {
					System.out.println( array[i]+" + " + array[j] + " = " + sum);
				}
			}
		}
		System.out.println("-------------------");
	}
	
	private static void twoPair(int[] array, int sum) {
		int size = array.length;
		int left=0, right=size-1, tempSum=0;
		
		while(left <= right) {
			tempSum = array[left]+array[right];
			if(tempSum == sum) {
				System.out.println( array[left]+" + " + array[right] + " = " + sum);
				right--;
			} else if(tempSum > sum) {
				right--;
			} else {
				left++;
			}
		}
	}

}
