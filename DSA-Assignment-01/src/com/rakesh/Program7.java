package com.rakesh;


public class Program7 {
	public static int[] findErrorNums(int[] nums) {
		int i = 0;
		while (i < nums.length) {
			int cor = nums[i] - 1;
			if (nums[i] != nums[cor]) {
				int temp = nums[i];
				nums[i] = nums[cor];
				nums[cor] = temp;
			} else {
				i++;
			}
		}
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] != j + 1) {
				return new int[] { nums[j], j + 1 };
			}
		}
		return new int[] { -1, -1 };
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 2, 4 };
		System.out.println(findErrorNums(nums));
	}
}
