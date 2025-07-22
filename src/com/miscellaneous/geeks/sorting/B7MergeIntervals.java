package com.miscellaneous.geeks.sorting;

import java.util.Arrays;

public class B7MergeIntervals {

	public static void main(String[] args) {
		Interval[] intervals = {
				new Interval(1, 4),
				new Interval(2, 5),
				new Interval(7, 9),
				new Interval(8, 11),
				new Interval(11, 15),
				new Interval(16, 17)
				
		};
		System.out.println("Input:");
		
		mergeIntervals(intervals);
		

	}


	private static void mergeIntervals(Interval[] intervals) {
		if (intervals == null || intervals.length <= 1) {
			return; 
		}
		
		printIntervals(intervals);
		Arrays.sort(intervals, (a,b) -> a.getStart() == b.getStart()
				? Integer.compare(a.getEnd(), b.getEnd()) 
						: Integer.compare(a.getEnd(), b.getEnd()));
		int result = 0;
		for (int i = 1; i < intervals.length; i++) {
			if(intervals[result].getEnd() >= intervals[i].getStart()) {
				intervals[i].setEnd(Math.max(intervals[result].getEnd(), intervals[i].getEnd()));
				intervals[i].setStart(Math.min(intervals[result].getStart(), intervals[i].getStart()));
				
				intervals[result] = new Interval(0, 0);
			} 
			result++;
		}
		printIntervals(intervals);
		System.out.println("------------------");
	}


	private static void printIntervals(Interval[] appointments) {
		System.out.print("[");
		for (int i = 0; i < appointments.length; i++) {
			System.out.print(appointments[i]);
			if (i < appointments.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}

}
