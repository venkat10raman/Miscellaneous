package com.miscellaneous.geeks.sorting;

import java.util.Arrays;

public class A1MergeTwoArray {

	public static void main(String[] args) {
		int[] a1 = {1,2,3,4,5};
		int[] a2 = {6,7,8,9,10,11,12,13,14,15};
		merge(a1,a2);
	}

	private static void merge(int[] a1, int[] a2) {
		int sl = a1.length, bl=a2.length, ss=0, bs=0,index=0;
		int[] result = new int[sl+bl];
		while(ss<sl && bs<bl) {
			if(a1[ss] < a2[bs]) {
				result[index] = a1[ss];
				ss++;
			} else {
				result[index] = a2[bs];
				bs++;
			}
			index++;
		}
		while(ss<sl) {
			result[index] = a1[ss];
			ss++;
			index++;
		}
		while(bs<bl) {
			result[index] = a2[bs];
			bs++;
			index++;
		}
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));
		System.out.println(Arrays.toString(result));
	}

}
