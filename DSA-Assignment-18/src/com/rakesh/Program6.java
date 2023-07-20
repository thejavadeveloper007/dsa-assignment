package com.rakesh;

import java.util.*;

public class Program6 {
	public static int findMinArrowShots(int[][] points) {
		Arrays.sort(points, Comparator.comparingInt(p -> p[1]));
		long max = 0, last = Long.MIN_VALUE;
		for (int[] p : points) {
			if (last < p[0]) {
				last = p[1];
				max++;
			}
		}
		return (int) max;
	}

	public static void main(String[] args) {
		int[][] points = { { 10, 16 }, { 2, 8 }, { 1, 6 }, { 7, 12 } };
		System.out.println(findMinArrowShots(points));
	}
}
