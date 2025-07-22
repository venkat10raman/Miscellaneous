package com.miscellaneous.geeks.arrays;

import java.util.Arrays;

public class B5TrippingRainWater {

	public static void main(String[] args) {
		int[] array = {3,0,1,2,5};
		naive(array);
	}

	private static void naive(int[] array) {
		System.out.println(Arrays.toString(array));
		int size = array.length;
		
		int result = 0; 
		for(int i=1; i<size-1; i++) {
			
			int lmax = array[i];
			for(int j=0; j<i; j++) {
				lmax = Math.max(lmax, array[j]);
			}
			
			int rmax = array[i];
			for(int j=i+1; j<size; j++) {
				rmax = Math.max(rmax, array[j]);
			}
			
			result = result + (Math.min(lmax, rmax)) - array[i];
		}
		System.out.println("Maximum water collected :: " + result);
		betterApproch(array);
		System.out.println("-------------------------------");
	}

	private static void betterApproch(int[] array) {
		int result =0, size = array.length;
		int[] lmax = new int[size], rmax = new int[size];
		
		lmax[0] = array[0];
		for(int i=1; i<size; i++) {
			lmax[i] = Math.max(array[i], lmax[i-1]);
		}
		
		rmax[size-1] = array[size-1];
		for(int i=size-2; i >= 0 ; i--) {
			rmax[i] = Math.max(array[i], rmax[i+1]);
		}
		
		for(int i=1; i<size; i++) {
			result = result + Math.min(lmax[i], rmax[i]) - array[i];
		}
		System.out.println("Maximum water collected :: " + result);
	}
}
