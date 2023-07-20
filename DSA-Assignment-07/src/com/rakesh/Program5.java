package com.rakesh;

public class Program5 {
	public static String reverseStr(String s, int k) {
		StringBuilder sb = new StringBuilder();
		while (s.length() >= 2 * k) {
			String temp = s.substring(0, k);
			sb.append(new StringBuilder(temp).reverse());
			sb.append(s.substring(k, 2 * k));
			s = s.substring(2 * k);
		}
		if (s.length() <= k) {
			sb.append(new StringBuilder(s).reverse());
		} else {
			sb.append(new StringBuilder(s.substring(0, k)).reverse());
			sb.append(s.substring(k));
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String ss = "abcdefg";
		int k = 2;
		System.out.println(reverseStr(ss, k));

	}
}