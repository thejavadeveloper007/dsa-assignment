package com.rakesh;

public class Program8 {
	public static int[] shuffle(int[] nums, int n) {
		int arr[] = new int[2 * n];
		int k = 0;
		for (int i = 0; i < n; i++) {
			arr[k++] = nums[i];
			arr[k++] = nums[n + i];
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 5, 1, 3, 4, 7 };
		int k = 3;
		System.out.println(shuffle(nums, k));
	}
}
