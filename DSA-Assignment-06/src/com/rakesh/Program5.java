package com.rakesh;

import java.util.Arrays;

public class Program5 {
	public static int minProductSum(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int sum = 0;
		int length = nums1.length;
		for (int i = 0; i < length; i++)
			sum += nums1[i] * nums2[length - 1 - i];
		return sum;
	}

	public static void main(String[] args) {
		int[] digits = { 5, 3, 4, 2 };
		int[] digitss = { 4, 2, 2, 5 };
		System.out.println(minProductSum(digits, digitss));

	}
}