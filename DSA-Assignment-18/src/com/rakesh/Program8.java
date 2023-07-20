package com.rakesh;

import java.util.*;

public class Program8 {
	static boolean recreationalSpot(int[] arr, int n) {
		List<Integer> small = new ArrayList<>();
		int min1 = arr[0];
		for (int i = 0; i < n; i++) {
			if (min1 >= arr[i]) {
				min1 = arr[i];
				small.add(-1);
			} else {
				small.add(min1);
			}
		}
		Stack<Integer> s = new Stack<>();
		for (int i = n - 1; i > 0; i--) {
			while (!s.isEmpty() && s.peek() <= small.get(i)) {
				s.pop();
			}
			if (!s.isEmpty() && small.get(i) != -1 && s.peek() < arr[i]) {
				return true;
			}
			s.push(arr[i]);
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		int N = arr.length;
		if (recreationalSpot(arr, N)) {
			System.out.print("True");
		} else {
			System.out.print("False");
		}
	}
}