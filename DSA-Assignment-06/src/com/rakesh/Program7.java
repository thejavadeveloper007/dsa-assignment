package com.rakesh;

public class Program7 {
	public static int[][] generateMatrix(int n) {
		if (n <= 0)
			return new int[0][];
		int[][] result = new int[n][n];
		int xBeg = 0, xEnd = n - 1;
		int yBeg = 0, yEnd = n - 1;
		int cur = 1;
		while (true) {
			for (int i = yBeg; i <= yEnd; i++)
				result[xBeg][i] = cur++;
			if (++xBeg > xEnd)
				break;
			for (int i = xBeg; i <= xEnd; i++)
				result[i][yEnd] = cur++;
			if (--yEnd < yBeg)
				break;
			for (int i = yEnd; i >= yBeg; i--)
				result[xEnd][i] = cur++;
			if (--xEnd < xBeg)
				break;
			for (int i = xEnd; i >= xBeg; i--)
				result[i][yBeg] = cur++;
			if (++yBeg > yEnd)
				break;
		}
		return result;
	}

	public static void main(String[] args) {
		int nums = 3;
		System.out.println(generateMatrix(nums));
	}
}
