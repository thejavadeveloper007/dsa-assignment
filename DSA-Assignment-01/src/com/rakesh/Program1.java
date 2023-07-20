package com.rakesh;

import java.util.HashMap;

public class Program1 {
	public  static int[] twoSum(int[] numbers, int target) {
		HashMap<Integer, Integer> indexMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < numbers.length; i++) {
			Integer requiredNum = (Integer) (target - numbers[i]);
			if (indexMap.containsKey(requiredNum)) {
				int toReturn[] = { indexMap.get(requiredNum), i };
				return toReturn;
			}

			indexMap.put(numbers[i], i);
		}
		return null;
	}
	public static void main(String[] args) {
		int [] num = {2,7,11,15};
		int target = 9;
		System.out.println(twoSum(num, target));
	}
}
