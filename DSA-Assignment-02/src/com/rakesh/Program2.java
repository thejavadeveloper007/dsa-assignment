package com.rakesh;

import java.util.HashSet;
import java.util.Set;

public class Program2 {
	public static int distributeCandies(int[] candyType) {
		Set<Integer> typeCandySet = new HashSet<>();
		int halfLength = candyType.length / 2;

		for (int c : candyType) {
			if (typeCandySet.size() >= halfLength)
				return halfLength;
			typeCandySet.add(c);
		}
		return Math.min(typeCandySet.size(), halfLength);
	}

	public static void main(String args[]) {
		int[] num = { 1, 1, 2, 2, 3, 3 };
		System.out.println(distributeCandies(num));
	}
}