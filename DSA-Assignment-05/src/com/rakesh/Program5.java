package com.rakesh;

public class Program5 {
	public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
		int count = 0;
		for (int a : arr1) {
			boolean countIncrease = true;
			for (int b : arr2) {
				int dist = Math.abs(a - b);
				if (dist <= d) {
					countIncrease = false;
					break;
				}
			}
			if (countIncrease)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		int[] digits = { 4, 5, 8 };
		int[] digitss = { 10, 9, 1, 8 };
		System.out.println(findTheDistanceValue(digits, digitss, 2));

	}
}