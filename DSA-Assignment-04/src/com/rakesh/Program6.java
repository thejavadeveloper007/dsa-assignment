package com.rakesh;

import java.util.Arrays;

public class Program6 {
	public static int[] sortedSquares(int[] A) {
		int[] res = new int[A.length];
		for (int i = 0; i < A.length; i++) {
			res[i] = A[i] * A[i];
		}
		Arrays.sort(res);
		return res;
	}

	public static void main(String[] args) {
		int[] nums = { -4, -1, 0, 3, 10 };
		System.out.println(sortedSquares(nums));
	}

}
