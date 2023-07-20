package com.rakesh;

import java.util.*;

public class Program5 {
	public static int[] intersection(int[] arr1, int[] arr2) {
		Set<Integer> set1 = new HashSet<>();
		for (int i : arr1) {
			set1.add(i);
		}
		Set<Integer> commonElements = new HashSet<>();
		for (int i : arr2) {
			if (set1.contains(i)) {
				commonElements.add(i);
			}
		}
		int[] res = new int[commonElements.size()];
		int idx = 0;
		for (int e : commonElements) {
			res[idx++] = e;
		}
		return res;
	}

	public static void main(String args[]) {
		int[] arr = { 1, 2, 2, 1 };
		int[] arr1 = { 2, 2 };
		System.out.println(intersection(arr, arr1));
	}
}