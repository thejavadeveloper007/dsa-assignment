package com.rakesh;

public class Program8 {
	static boolean isConsonant(char ch) {
		ch = Character.toUpperCase(ch);
		return (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') == false && ch >= 65 && ch <= 90;
	}

	static int totalConsonants(String str, int n) {
		if (n == 1) {
			if (isConsonant(str.charAt(0)))
				return 1;
			else
				return 0;
		}

		if (isConsonant(str.charAt(n - 1)))
			return totalConsonants(str, n - 1) + 1;
		else
			return totalConsonants(str, n - 1);
	}

	public static void main(String args[]) {
		String str = "abc de";
		System.out.println(totalConsonants(str, str.length()));
	}
}