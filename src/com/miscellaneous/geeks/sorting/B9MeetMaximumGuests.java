package com.miscellaneous.geeks.sorting;

import java.util.Arrays;

public class B9MeetMaximumGuests {

	public static void main(String[] args) {
		int[] arv = {900, 600, 700};
		int[] dep = {1000, 800, 730};
		
		System.out.println(Arrays.toString(arv));
		System.out.println(Arrays.toString(dep));
		Arrays.sort(arv);
		Arrays.sort(dep);
		System.out.println("--------");
		System.out.println(Arrays.toString(arv));
		System.out.println(Arrays.toString(dep));
		
		int i=0, j=0, res=0, curr=0;
		int startTime=0, endTime=0;
		while(i < arv.length && j < dep.length) {
			if(arv[i] < dep[j]) {
				i++;
				curr++;
			} else {
				j++;
				curr--;
			}
			if(res < curr) {
				res = curr;
				startTime=j;
				endTime=i-1;
			}
		}
		
		System.out.println(res + " :: " + arv[startTime] + " to " + dep[endTime]);
	}

}
