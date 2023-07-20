package com.rakesh;

import java.util.Arrays;
import java.util.Comparator;

public class Program8 {
	public static boolean canAttendMeetings(int[][] intervals) {
		Arrays.sort(intervals, new Comparator<int[]>() {
			public int compare(int[] i1, int[] i2) {
				return i1[0] - i2[0];
			}
		});
		for (int i = 0; i < intervals.length - 1; i++) {
			if (intervals[i][1] > intervals[i + 1][0])
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int[][] nums = { { 0, 30 }, { 5, 10 }, { 15, 20 } };
		System.out.println(canAttendMeetings(nums));
	}
}
