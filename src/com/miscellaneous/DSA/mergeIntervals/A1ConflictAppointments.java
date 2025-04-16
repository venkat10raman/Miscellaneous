package com.miscellaneous.DSA.mergeIntervals;

import java.util.Arrays;

public class A1ConflictAppointments {

	// Class to represent an interval
	static class Interval {
		int start;
		int end;

		Interval(int start, int end) {
			this.start = start;
			this.end = end;
		}

		@Override
		public String toString() {
			return "[" + start + ", " + end + "]";
		}
	}

	// Check for conflicting appointments
	private static boolean canAttendAll(Interval[] appointments) {
		if (appointments == null || appointments.length <= 1) {
			return true; // No conflicts possible
		}

		// Sort intervals by start time
		Arrays.sort(appointments, (a, b) -> a.start != b.start 
				? Integer.compare(a.start, b.start) 
						: Integer.compare(a.end, b.end));

		// Check for any overlap
		for (int i = 1; i < appointments.length; i++) {
			if (appointments[i].start < appointments[i - 1].end) {
				return false; // Conflict found
			}
		}
		return true; // No conflicts
	}

	// Utility to print intervals
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

	public static void main(String[] args) {
		// Test case 1: Conflict
		Interval[] appointments1 = {
				new Interval(1, 4),
				new Interval(2, 5),
				new Interval(7, 9)
		};
		System.out.println("Input:");
		printIntervals(appointments1);
		System.out.println("Can attend all? " + canAttendAll(appointments1));

		// Test case 2: No conflict
		Interval[] appointments2 = {
				new Interval(6, 7),
				new Interval(2, 4),
				new Interval(8, 12)
		};
		System.out.println("\nInput:");
		printIntervals(appointments2);
		System.out.println("Can attend all? " + canAttendAll(appointments2));

		// Test case 3: Empty
		Interval[] appointments3 = {};
		System.out.println("\nInput (empty):");
		printIntervals(appointments3);
		System.out.println("Can attend all? " + canAttendAll(appointments3));

		// Test case 4: Single appointment
		Interval[] appointments4 = {new Interval(1, 2)};
		System.out.println("\nInput (single):");
		printIntervals(appointments4);
		System.out.println("Can attend all? " + canAttendAll(appointments4));

		// Test case 5: Adjacent intervals (no conflict)
		Interval[] appointments5 = {
				new Interval(1, 2),
				new Interval(2, 3),
				new Interval(3, 4)
		};
		System.out.println("\nInput (adjacent):");
		printIntervals(appointments5);
		System.out.println("Can attend all? " + canAttendAll(appointments5));
	}

}
