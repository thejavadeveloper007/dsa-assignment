package com.rakesh;

public class Program2 {
	public static boolean searchMatrix(int[][] matrix, int target) {
		int m = matrix.length, n = matrix[0].length;
		for (int i = m - 1, j = 0; i >= 0 && j < n;) {
			if (matrix[i][j] == target) {
				return true;
			}
			if (matrix[i][j] > target) {
				--i;
			} else {
				++j;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[][] nums = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
		int n = 5;
		System.out.println(searchMatrix(nums, n));
	}
}