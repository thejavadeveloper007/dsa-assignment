package com.rakesh;

public class Program7 {
	public static int maxCount(int m, int n, int[][] ops) {
		int minM = m;
		int minN = n;
		for (int i = 0; i < ops.length; i++) {
			if (ops[i][0] != 0 && ops[i][0] < minM) {
				minM = ops[i][0];
			}
			if (ops[i][1] != 0 && ops[i][1] < minN) {
				minN = ops[i][1];
			}
		}
		return minM * minN;
	}

	public static void main(String[] args) {
		int[][] nums = { { 2, 2 }, { 3, 3 } };
		System.out.println(maxCount(3, 3, nums));
	}
}
