package com.rakesh;

public class Program1 {
	public static boolean isPowerOfTwo(int n) {
		for (int i = 0; i <= 31; i++) {
			if (Math.pow(2, i) == n) {
				return true;
			}
		}
		return false;

	}

	public static void main(String[] args) {
		int n = 1;
		System.out.println(isPowerOfTwo(n));
	}
}