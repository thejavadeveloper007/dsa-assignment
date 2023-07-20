package com.rakesh;

import java.util.Arrays;

public class Program3 {
	public static int[][] transpose(int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;
		int ans[][] = new int[n][m];
		int i = 0, j = 0, k = 0;
		while (k < n) {
			ans[k][i] = matrix[i][j];
			i++;
			if (i == m) {
				i -= m;
				j++;
				k++;
			}
		}
		return ans;
	}

	public static void main(String args[]) {
		int[][] num = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println(transpose(num));
	}
}
