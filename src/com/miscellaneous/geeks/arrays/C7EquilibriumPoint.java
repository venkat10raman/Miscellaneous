package com.miscellaneous.geeks.arrays;

public class C7EquilibriumPoint {

	public static void main(String[] args) {
		int[] array = {3,4,8,-9,9,7};
		naive(array);
		equilibriumPoint(array);
	}
	
	private static void equilibriumPoint(int[] array) {
		int rs=0,ls=0, size = array.length;
		for(int i=0; i<size; i++) {
			rs = rs + array[i];
		}
		for(int i=0; i<size; i++) {
			rs = rs - array[i];
			if(ls == rs) {
				System.out.println(i + " is the equilibrium point :: "+ array[i]);
			}
			ls = ls + array[i];
			
		}
		System.out.println("--------------");
	}

	private static void naive(int[] array) {
		int size = array.length;
		for(int i=0; i<size; i++) {
			int ls=0, rs=0;
			for(int j=0; j<i; j++) {
				ls = ls + array[j];
			}
			
			for(int j=i+1; j<size; j++) {
				rs = rs + array[j];
			}
			if(ls == rs) {
				System.out.println(i + " is the equilibrium point :: "+ array[i]);
			}
		}
		System.out.println("--------------");
	}

}
