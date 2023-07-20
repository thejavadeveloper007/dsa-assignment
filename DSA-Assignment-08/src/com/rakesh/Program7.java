package com.rakesh;

import java.util.Stack;

public class Program7 {
	public static String decodeString(String s) {
		Stack<Character> stack = new Stack<>();
		int n = s.length();
		StringBuilder str = new StringBuilder("");
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == ']') {
				while (stack.peek() != '[') {
					str.append(stack.pop());
				}
				String tmp = str.toString();
				stack.pop();
				int count = 0;
				char ch = stack.peek();
				int x = 0;
				while (!stack.empty() && ch - '0' >= 0 && ch - '0' <= 9) {
					x = (stack.pop() - '0') * (int) Math.pow(10, count) + x;
					if (stack.empty())
						break;
					ch = stack.peek();
					count++;
				}
				for (int j = 0; j < x; j++) {
					for (int k = tmp.length() - 1; k >= 0; k--) {
						stack.push(tmp.charAt(k));
					}
				}
			} else
				stack.push(s.charAt(i));
			str.delete(0, str.length());
		}
		while (!stack.empty()) {
			str.append(stack.pop());
		}
		return str.reverse().toString();

	}

	public static void main(String[] args) {
		String ss = "3[a]2[bc]";
		System.out.println(decodeString(ss));
	}
}
