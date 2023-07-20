package com.rakesh;

public class Program1 {
	static int findDepthRec(String tree, int n, int index) {
		if (index >= n || tree.charAt(index) == 'l')
			return 0;
		index++;
		int left = findDepthRec(tree, n, index);
		index++;
		int right = findDepthRec(tree, n, index);
		return Math.max(left, right) + 1;
	}

	static int findDepth(String tree, int n) {
		int index = 0;
		return (findDepthRec(tree, n, index));
	}

	static public void main(String[] args) {
		String tree = "nlnll";
		int n = tree.length();
		System.out.println(findDepth(tree, n));
	}
}