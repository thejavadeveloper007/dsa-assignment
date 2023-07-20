package com.rakesh;

import java.util.LinkedList;
import java.util.List;

public class Program1 {
	public static  int[][] construct2DArray(int[] original, int m, int n) {
		int[][] arr = new int[m][n];
		if (original.length != m * n) {
			return new int[0][0];
		}
		for (int i = 0; i < original.length; i++) {
			int row = i / n;
			int col = i % n;
			arr[row][col] = original[i];
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr1 = { 1,2,3,4 };
		System.out.println(construct2DArray(arr1, 2, 2));
	}
}
