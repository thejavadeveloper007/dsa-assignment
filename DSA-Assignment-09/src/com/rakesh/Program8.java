package com.rakesh;

public class Program8 {
	static final int MOD = 1000000007;

	static int product(int ar[], int n) {
		int result = 1;
		for (int i = 0; i < n; i++)
			result = (result * ar[i]) % MOD;

		return result;
	}

	public static void main(String[] args) {
		int ar[] = { 1, 2, 3, 4, 5 };
		int n = ar.length;

		System.out.printf("%d", product(ar, n));
	}
}