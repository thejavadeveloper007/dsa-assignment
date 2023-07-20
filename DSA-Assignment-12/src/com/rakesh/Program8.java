package com.rakesh;

import java.util.*;

public class Program8 {
	private static class Node {
		public int data;
		public Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	private Node head;

	public Program8() {
		head = null;
	}

	public void addToFront(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	public boolean isCircular() {
		if (head == null) {
			return false;
		}
		Node slow = head;
		Node fast = head.next;
		while (fast != null && fast.next != null) {
			if (slow == fast) {
				return true;
			}
			slow = slow.next;
			fast = fast.next.next;
		}
		return false;
	}

	public static void main(String[] args) {
		Program8 prg = new Program8();
		prg.addToFront(1);
		prg.addToFront(2);
		prg.addToFront(3);
		prg.addToFront(4);
		System.out.println(prg.isCircular());
	}
}