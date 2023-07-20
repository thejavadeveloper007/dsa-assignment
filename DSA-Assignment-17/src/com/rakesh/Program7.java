package com.rakesh;

import java.util.*;

public class Program7 {

	List<Integer> qList;

	public Program7() {
		qList = new ArrayList<>();
	}

	public void pushFront(int val) {
		qList.add(0, val);
	}

	public void pushMiddle(int val) {
		int mid = qList.size() / 2;
		qList.add(mid, val);
	}

	public void pushBack(int val) {
		qList.add(qList.size(), val);
	}

	public int popFront() {
		return qList.isEmpty() ? -1 : qList.remove(0);
	}

	public int popMiddle() {
		return qList.isEmpty() ? -1 : qList.remove((qList.size() - 1) / 2);
	}

	public int popBack() {
		return qList.isEmpty() ? -1 : qList.remove(qList.size() - 1);
	}

	public static void main(String[] args) {
		Program7 prg = new Program7();
		prg.pushMiddle(0);
		prg.pushFront(23);
	}
}