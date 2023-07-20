package com.rakesh;

public class Program4 {
	private static int recLen(String str) {

		if (str.equals(""))
			return 0;
		else
			return recLen(str.substring(1)) + 1;
	}

	public static void main(String[] args) {

		String str = "abcd";
		System.out.println(recLen(str));
	}
}