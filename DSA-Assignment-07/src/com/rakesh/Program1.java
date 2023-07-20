package com.rakesh;

import java.util.HashMap;

public class Program1 {
	public static boolean isIsomorphic(String s, String t) {

		if (s.length() != t.length())
			return false;
		if (s.equals(t))
			return true;

		HashMap<Character, Character> map = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (map.containsKey(c)) {
				if (!map.get(c).equals(t.charAt(i)))
					return false;
			} else {
				if (map.containsValue(t.charAt(i)))
					return false;
				else
					map.put(c, t.charAt(i));
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String s = "egg";
		String ss = "add";
		System.out.println(isIsomorphic(s, ss));
	}
}
