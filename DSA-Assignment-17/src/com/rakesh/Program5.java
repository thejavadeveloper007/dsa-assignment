package com.rakesh;

import java.util.*;

public class Program5 {
	public static int findTheWinner(int n, int k) {
		Queue<Integer> q = new LinkedList();

		for (int i = 1; i < n + 1; i++) {
			q.add(i);
		}
		while (q.size() != 1) {
			for (int i = k - 1; i > 0; i--) {
				q.add(q.poll());
			}
			q.poll();
		}

		return q.poll();
	}

	public static void main(String args[]) {
		int n = 5, k = 2;
		System.out.println(findTheWinner(n, k));
	}
}