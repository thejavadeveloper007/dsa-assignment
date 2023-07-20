package com.rakesh;

import java.util.PriorityQueue;

class Node {
	int data;
	Node next;
	Node bottom;
	public Node random;

	Node(int data) {
		this.data = data;
		next = null;
		bottom = null;
	}
}

class NodeComparator implements java.util.Comparator<Node> {
	@Override
	public int compare(Node a, Node b) {
		return a.data - b.data;
	}
}

public class Program3 {
	public static void flatten(Node root) {
		PriorityQueue<Node> pq = new PriorityQueue<Node>(new NodeComparator());
		while (root != null) {
			pq.add(root);
			root = root.next;
		}
		while (!pq.isEmpty()) {
			Node k = pq.poll();
			System.out.print(k.data + " ");
			if (k.bottom != null) {
				pq.add(k.bottom);
			}
		}
	}

	public static void main(String[] args) {
		Node head = new Node(5);
		Node temp = head;
		Node bt = head;

		bt.bottom = new Node(7);
		bt.bottom.bottom = new Node(8);
		bt.bottom.bottom.bottom = new Node(30);

		temp.next = new Node(10);
		temp = temp.next;

		bt = temp;
		bt.bottom = new Node(20);

		temp.next = new Node(19);
		temp = temp.next;

		bt = temp;
		bt.bottom = new Node(22);
		bt.bottom.bottom = new Node(50);

		temp.next = new Node(28);
		temp = temp.next;

		bt = temp;
		bt.bottom = new Node(35);
		bt.bottom.bottom = new Node(40);
		bt.bottom.bottom.bottom = new Node(45);

		flatten(head);
	}
}