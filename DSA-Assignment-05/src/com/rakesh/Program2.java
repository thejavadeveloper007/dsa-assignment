package com.rakesh;

public class Program2 {
	public static int arrangeCoins(int n) {
		long i = 0;
		for (i = 1; i * (i + 1) / 2 <= n; i++)
			;
		return (int) i - 1;
	}

	public static void main(String[] args) {
		int n = 5;
		System.out.println(arrangeCoins(n));
	}
}