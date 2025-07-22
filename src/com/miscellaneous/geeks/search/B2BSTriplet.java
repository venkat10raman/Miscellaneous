package com.miscellaneous.geeks.search;

public class B2BSTriplet {

	public static void main(String[] args) {
		int[] array = {2,3,5,6,15,17};
		int sum = 20;
		tripletSum(array, sum);
	}

	private static void tripletSum(int[] array, int sum) {
		int size=array.length;
		int l=0,h=size-1, tempSum=0;
		
		for(int i=0; i<size-3; i++) {
			tempSum = array[i];
			l = i+1;
			while(l <= h) {
				tempSum = array[l]+array[h];
				if(tempSum == sum) {
					System.out.println( array[l]+" + " + array[h] + " = " + sum);
					h--;
				} else if(tempSum > sum) {
					h--;
				} else {
					l++;
				}
			}
			tempSum=0;
		}
	}

}
