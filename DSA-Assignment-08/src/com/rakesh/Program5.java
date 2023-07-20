package com.rakesh;

public class Program5 {
	public static int compress(char[] chars) {
		int st = 0;
		for (int i = 0; i < chars.length; i++) {
			char cur = chars[i];
			int j = i + 1;
			int cnt = 1;
			while (j < chars.length && chars[j] == cur) {
				j++;
				cnt++;
			}
			chars[st++] = cur;
			if (cnt != 1) {
				String count = String.valueOf(cnt);
				for (int x = 0; x < count.length(); x++) {
					chars[st++] = count.charAt(x);
				}
			}
			i += (j - i - 1);
		}
		return st;
	}

	public static void main(String[] args) {
		char [] ss = {'a','a','b','b','c','c','c'};
		System.out.println(compress(ss));

	}
}