package com.rakesh;

public class Program8 {
	public static int[] findOriginalArray(int[] changed) {
		int n = changed.length;
		int[] vis = new int[(int) 1e5 + 1];
		if (n % 2 != 0)
			return new int[0];
		int[] ans = new int[n / 2];
		int j = 0;
		for (int i = 0; i < n; i++) {
			int val = changed[i];
			vis[val]++;
		}
		for (int i = 0; i < vis.length; i++) {
			while (vis[i] > 0) {
				if (i * 2 < vis.length && vis[i * 2] > 0) {
					ans[j++] = i;
					vis[i * 2]--;
				} else
					return new int[0];

				vis[i]--;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 3, 4, 2, 6, 8 };
		System.out.println(findOriginalArray(nums));
	}
}
