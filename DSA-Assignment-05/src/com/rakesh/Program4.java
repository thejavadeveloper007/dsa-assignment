package com.rakesh;

import java.util.*;

public class Program4 {

	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
		Deque<Integer> stk = new ArrayDeque<>();
		Map<Integer, Integer> m = new HashMap<>();
		for (int v : nums2) {
			while (!stk.isEmpty() && stk.peek() < v) {
				m.put(stk.pop(), v);
			}
			stk.push(v);
		}
		int n = nums1.length;
		int[] ans = new int[n];
		for (int i = 0; i < n; ++i) {
			ans[i] = m.getOrDefault(nums1[i], -1);
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] digits = { 1, 2, 3 };
		int[] digitss = { 2, 4, 6 };
		System.out.println(nextGreaterElement(digits, digitss));
	}
}