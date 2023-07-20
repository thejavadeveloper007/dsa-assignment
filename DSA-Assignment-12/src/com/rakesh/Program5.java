package com.rakesh;

import java.util.*;

public class Program5 {
	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	static public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	static boolean removeLoop(Node h) {
		HashSet<Node> s = new HashSet<Node>();
		Node prev = null;
		while (h != null) {
			if (s.contains(h)) {
				prev.next = null;
				return true;
			} else {
				s.add(h);
				prev = h;
				h = h.next;
			}
		}

		return false;
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Program5 prg = new Program5();

		prg.push(20);
		prg.push(4);
		prg.push(15);
		prg.push(10);

		/* Create loop for testing */
		prg.head.next.next.next.next = prg.head;

		if (removeLoop(head)) {
			System.out.println("Linked List after removing loop");
			prg.printList(head);
		} else
			System.out.println("No Loop found");
	}
}