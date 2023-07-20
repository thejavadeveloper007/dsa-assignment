package com.rakesh;

import java.util.Arrays;

public class Program8 {
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int i = m;
		for (int j = 0; j < n; j++) {
			nums1[i] = nums2[j];
			i++;
		}
		Arrays.sort(nums1);
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 0, 0, 0 };
		int[] num = { 2, 5, 6 };
		merge(nums, 3, num, 0);
	}
}
