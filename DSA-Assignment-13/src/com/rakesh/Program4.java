package com.rakesh;

public class Program4 {
	static Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	Node kAltReverse(Node head, int k) {
		return _kAltReverse(head, k, true);
	}

	Node _kAltReverse(Node node, int k, boolean b) {
		if (node == null) {
			return null;
		}
		int count = 1;
		Node prev = null;
		Node current = node;
		Node next = null;
		while (current != null && count <= k) {
			next = current.next;
			if (b == true) {
				current.next = prev;
			}
			prev = current;
			current = next;
			count++;
		}
		if (b == true) {
			node.next = _kAltReverse(current, k, !b);
			return prev;
		} else {
			prev.next = _kAltReverse(current, k, !b);
			return node;
		}
	}

	void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	void push(int newdata) {
		Node mynode = new Node(newdata);
		mynode.next = head;
		head = mynode;
	}

	public static void main(String[] args) {
		Program4 prg = new Program4();
		for (int i = 9; i > 0; i--) {
			prg.push(i);
		}
		System.out.println("Given Linked List :");
		prg.printList(head);
		head = prg.kAltReverse(head, 3);
		System.out.println("");
		System.out.println("Modified Linked List :");
		prg.printList(head);

	}
}