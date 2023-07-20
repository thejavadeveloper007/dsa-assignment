package com.rakesh;

public class Program5 {
	public static int findMinRec(int A[], int n) {
		if (n == 1)
			return A[0];

		return Math.min(A[n - 1], findMinRec(A, n - 1));
	}

	public static void main(String args[]) {
		int A[] = { 1, 4, 3, -5, -4, 8, 6 };
		int n = A.length;
		System.out.println(findMinRec(A, n));
	}
}