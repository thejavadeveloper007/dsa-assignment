package com.rakesh;

public class Program1 {
	public static  int[] diStringMatch(String s) {
		int[] arr = new int[s.length() + 1];
		int max = s.length();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'D') {
				arr[i] = max;
				max--;
			}
		}
		for (int i = s.length() - 1; i >= 0 && max > 0; i--) {
			if (s.charAt(i) == 'I' && arr[i + 1] == 0) {
				arr[i + 1] = max;
				max--;
			}
		}
		for (int i = 0; i < arr.length && max > 0; i++) {
			if (arr[i] == 0) {
				arr[i] = max;
				max--;
			}
		}

		return arr;
	}

	public static void main(String[] args) {
		String s = "IDID";
		System.out.println(diStringMatch(s));
	}
}
