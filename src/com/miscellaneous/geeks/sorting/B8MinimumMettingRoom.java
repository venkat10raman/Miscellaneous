package com.miscellaneous.geeks.sorting;

import java.util.Arrays;

public class B8MinimumMettingRoom {

	// Find minimum meeting rooms required
	private static int minMeetingRooms(Interval[] meetings) {
		if (meetings == null || meetings.length == 0) {
			// No rooms needed
			return 0;
		}

		// Extract start and end times
		int[] starts = new int[meetings.length];
		int[] ends = new int[meetings.length];
		for (int i = 0; i < meetings.length; i++) {
			starts[i] = meetings[i].getStart();
			ends[i] = meetings[i].getEnd();
		}
		
		// Sort start and end times
        Arrays.sort(starts);
        Arrays.sort(ends);
        
        // Two pointers to track concurrent meetings
        int startPtr = 0;
        int endPtr = 0;
        int currentRooms = 0;
        int maxRooms = 0;
        
     // Sweep through all events
        while (startPtr < meetings.length) {
            if (startPtr < meetings.length && starts[startPtr] < ends[endPtr]) {
                // Meeting starts, need a room
                currentRooms++;
                maxRooms = Math.max(maxRooms, currentRooms);
                startPtr++;
            } else {
                // Meeting ends, free a room
                currentRooms--;
                endPtr++;
            }
        }

		return maxRooms;
	}

	// Utility to print intervals
	private static void printIntervals(Interval[] meetings) {
		System.out.print("[");
		for (int i = 0; i < meetings.length; i++) {
			System.out.print(meetings[i]);
			if (i < meetings.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}

	public static void main(String[] args) {
		// Test case 1: Overlapping meetings
        Interval[] meetings1 = {
            new Interval(0, 30),
            new Interval(5, 10),
            new Interval(15, 20)
        };
        System.out.println("Input:");
        printIntervals(meetings1);
        System.out.println("Minimum rooms: " + minMeetingRooms(meetings1));
        
     // Test case 2: Non-overlapping meetings
        Interval[] meetings2 = {
            new Interval(7, 10),
            new Interval(2, 4)
        };
        System.out.println("\nInput:");
        printIntervals(meetings2);
        System.out.println("Minimum rooms: " + minMeetingRooms(meetings2));
        
        // Test case 3: Empty
        Interval[] meetings3 = {};
        System.out.println("\nInput (empty):");
        printIntervals(meetings3);
        System.out.println("Minimum rooms: " + minMeetingRooms(meetings3));
        
     // Test case 4: Single meeting
        Interval[] meetings4 = {new Interval(1, 5)};
        System.out.println("\nInput (single):");
        printIntervals(meetings4);
        System.out.println("Minimum rooms: " + minMeetingRooms(meetings4));
        
        // Test case 5: Adjacent meetings
        Interval[] meetings5 = {
            new Interval(1, 2),
            new Interval(2, 3),
            new Interval(3, 4)
        };
        System.out.println("\nInput (adjacent):");
        printIntervals(meetings5);
        System.out.println("Minimum rooms: " + minMeetingRooms(meetings5));
	}

}
