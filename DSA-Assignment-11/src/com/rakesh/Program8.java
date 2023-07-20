package com.rakesh;

import java.util.*;

public class Program8 {
	public static int[] intersect(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int top = 0;
		int bottom = 0;
		List<Integer> h = new ArrayList<>();
		while (true) {
			if (top >= nums1.length || bottom >= nums2.length) {
				break;
			}
			if (nums1[top] == nums2[bottom]) {
				h.add(nums1[top]);
				top++;
				bottom++;
			} else if (nums1[top] < nums2[bottom]) {
				top++;
			} else if (nums1[top] > nums2[bottom]) {
				bottom++;
			}
		}

		int[] g = new int[h.size()];
		for (int i = 0; i < h.size(); i++) {
			g[i] = h.get(i);
		}
		return g;
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 2, 1 };
		int b[] = { 2, 2 };

		System.out.println(intersect(a, b));
	}
}