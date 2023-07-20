package com.rakesh;

public class Program4 {
	public static double myPow(double x, int n) {
		return Math.pow(x, n);
	}

	public static void main(String[] args) {
		int num = 5;
		int num1 = 2;
		System.out.println(myPow(num, num1));
	}
}
