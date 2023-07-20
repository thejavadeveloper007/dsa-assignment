package com.rakesh;

public class Program3 {
	public static int missingNumber(int[] nums) {
		int result;
		int n = nums.length;

		result = n * (n + 1) / 2;
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			count += nums[i];
		}
		return result - count;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 0, 1 };
		System.out.println(missingNumber(arr));
	}
}
