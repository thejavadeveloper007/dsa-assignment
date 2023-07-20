package com.rakesh;

public class Program8 {
	public static boolean checkStraightLine(int[][] c) {
		int xMove = c[1][0] - c[0][0];
		int yMove = c[1][1] - c[0][1];
		for (int i = 1; i < c.length; i++) {
			int x = c[i][0] - c[i - 1][0];
			int y = c[i][1] - c[i - 1][1];
			if (y * xMove != x * yMove)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int[][] nums = { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 4, 5 }, { 5, 6 }, { 6, 7 } };
		System.out.println(checkStraightLine(nums));
	}
}
