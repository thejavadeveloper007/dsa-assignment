package com.rakesh;

public class Program1 {
	public static int mySqrt(int x) {
		if (x < 2) {
			return x;
		}
		int lo = 2, hi = x / 2;
		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			long sq = 1L * mid * mid;
			if (sq > x)
				hi = mid - 1;
			else if (sq < x)
				lo = mid + 1;
			else
				return mid;
		}
		return hi;
	}

	public static void main(String[] args) {
		int n = 4;
		System.out.println(mySqrt(n));
	}
}