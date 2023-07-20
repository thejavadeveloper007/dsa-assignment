package com.rakesh;

import java.util.*;

public class Program6 {
	public static List<Integer> findAnagrams(String s, String p) {
		int len = p.length();
		List<Integer> ans = new ArrayList<>();
		int[] arr = new int[26];
		for (int i = 0; i < len; i++)
			arr[p.charAt(i) - 'a']++;
		for (int i = 0; i < s.length(); i++) {
			arr[s.charAt(i) - 'a']--;
			if (i - len >= 0) {
				arr[s.charAt(i - len) - 'a']++;
			}
			if (checkZeroArr(arr)) {
				int startIndex = i - len + 1;
				ans.add(startIndex);
			}
		}
		return ans;
	}

	public static boolean checkZeroArr(int[] arr) {
		for (int i = 0; i < 26; i++) {
			if (arr[i] != 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String ss = "cbaebabacd";
		String k = "abc";
		System.out.println(findAnagrams(ss, k));
	}

}
