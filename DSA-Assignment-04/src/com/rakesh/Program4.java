package com.rakesh;

import java.util.Arrays;

public class Program4 {

	public static int arrayPairSum(int[] nums) {
		Arrays.sort(nums);
		int sum = 0;
		for (int i = 0; i < nums.length - 1; i = i + 2) {
			sum = sum + Math.min(nums[i], nums[i + 1]);
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] digits = { 1, 4, 3, 2 };
		System.out.println(arrayPairSum(digits));
	}
}