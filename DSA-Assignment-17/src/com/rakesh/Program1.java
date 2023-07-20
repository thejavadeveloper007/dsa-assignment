package com.rakesh;

public class Program1 {
	public static void main(String args[]) {

		String inputStr = "leetcode";

		for (char i : inputStr.toCharArray()) {
			if (inputStr.indexOf(i) == inputStr.lastIndexOf(i)) {
				System.out.println("First non-repeating character is: " + i);
				break;
			}
		}
	}
}