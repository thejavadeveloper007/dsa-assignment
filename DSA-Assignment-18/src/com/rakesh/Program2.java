package com.rakesh;

import java.util.Arrays;

public class Program2 {
	public static void sortColors(int[] nums) {
		int[] arr = new int[nums.length];
		Arrays.fill(arr, 1);
		int s = 0;
		int l = nums.length - 1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				arr[s] = 0;
				s++;

			} else if (nums[i] == 2) {
				arr[l] = 2;
				l--;
			}
		}
		for (int j = 0; j < arr.length; j++) {
			nums[j] = arr[j];
		}
	}

	public static void main(String[] args) {
		int[] nums = { 2, 0, 2, 1, 1, 0 };
		sortColors(nums);
	}
}