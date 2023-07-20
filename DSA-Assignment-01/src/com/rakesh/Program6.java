package com.rakesh;

public class Program6 {
	public static void moveZeroes(int[] arr) {
		int n = arr.length;
		if (n <= 1)
			return;
		int s = 0;
		int e = 1;
		while (e < n) {
			if (arr[s] == 0 && arr[e] != 0) {
				int temp = arr[s];
				arr[s] = arr[e];
				arr[e] = temp;
				s++;
				e++;
			} else if (arr[s] == 0 && arr[e] == 0) {
				e++;
			} else {
				s++;
				e++;
			}
		}
	}

	public static void main(String[] args) {
		int[] nums = { 0, 1, 0, 3, 12 };
		moveZeroes(nums);
	}

}
