package com.rakesh;

public class Program7 {
	public static int findMin(int[] nums) {
		int n = nums.length;
		if (nums[0] <= nums[n - 1]) {
			return nums[0];
		}
		int left = 0, right = n - 1;
		while (left < right) {
			int mid = (left + right) >> 1;
			if (nums[0] <= nums[mid]) {
				left = mid + 1;
			} else {
				right = mid;
			}
		}
		return nums[left];
	}

	public static void main(String[] args) {
		int[] nums = { 3, 4, 5, 1, 2 };
		System.out.println(findMin(nums));
	}
}
