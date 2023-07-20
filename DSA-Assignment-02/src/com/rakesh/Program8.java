package com.rakesh;



public class Program8 {
	public static int smallestRangeI(int[] nums, int k) {
		int max, min;
		max = min = nums[0];
		for (int i = 0; i < nums.length; i++) {
			max = Math.max(max, nums[i]);
			min = Math.min(min, nums[i]);
		}
		int diff = (max - k) - (min + k);
		return (diff > 0) ? diff : 0;

	}

	public static void main(String[] args) {
		int[] nums = { 1 };
		int k = 0;
		System.out.println(smallestRangeI(nums, k));
	}
}
