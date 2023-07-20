package com.rakesh;

public class Program4 {

	public static int searchInsert(int[] nums, int target) {
		int n = nums.length;
		int ans = 0;
		for (int i = 0; i < n; i++) {
			if (nums[i] == target) {
				ans = i;
			}
			if (nums[i] != target && nums[i] < target) {
				ans = i + 1;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] digits = { 1, 3, 5, 6 };
		int n = 5;
		System.out.println(searchInsert(digits, n));
	}
}