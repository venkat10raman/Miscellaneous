package com.miscellaneous.geeks.search;

import java.util.Arrays;

public class B3BSMedian {

	public static void main(String[] args) {
		int[] a1= {10, 20, 30};
		int[] a2 = {5,15,25,35,45};
		
		findMedian(a1, a2);
		
		
	}

	private static void findMedian(int[] a1, int[] a2) {
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));
		
		int sl = a1.length, bl = a2.length;
		int l=0, h=sl;
		
		while(l < h) {
			int i1 = (l+h)/2;
			int i2 = (sl+bl+1)/2 - i1;
			
			int min1 = i1==sl ? Integer.MAX_VALUE : a1[i1];
			int max1 = i1==0 ? Integer.MIN_VALUE : a1[i1-1];
			
			int min2 = i2==bl ? Integer.MAX_VALUE : a2[i2];
			int max2 = i2==0 ? Integer.MIN_VALUE : a2[i2-1];
			
			if(max1 <= min2 && max2 <= min1) {
				if((sl+bl)/2 == 0) {
					System.out.println((Math.max(max1, max2) + Math.min(min1, min2))/2);
				} else {
					System.out.println(Math.max(max1, max2));
				}
				break;
			} else if(max1 > min2) {
				h = i1-1;
			} else {
				l = i1+1;
			}
		}
	}

}
