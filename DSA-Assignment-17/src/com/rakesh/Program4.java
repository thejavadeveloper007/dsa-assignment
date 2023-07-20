package com.rakesh;

import java.util.*;

public class Program4 {
	Queue<Integer> q;

	public Program4() {
		q = new LinkedList<>();
	}

	public int ping(int t) {
		q.add(t);
		while (q.peek() < t - 3000) {
			q.poll();
		}
		return q.size();
	}

	public static void main(String[] args) {
		Program4 prg = new Program4();
		int t = 0;
		System.out.println(prg.ping(t));
	}
}