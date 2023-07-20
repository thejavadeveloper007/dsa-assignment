package com.rakesh;

import java.util.LinkedList;
import java.util.Queue;

class Node {
	int data;
	Node left;
	Node right;

	Node(int value) {
		data = value;
		left = null;
		right = null;
	}
}

public class Program1 {
	static int isSumProperty(Node root) {
		Queue<Node> q = new LinkedList<Node>();
		q.offer(root);
		q.offer(null);
		while (!q.isEmpty()) {
			Node curr = q.poll();
			if (curr == null) {
				if (!q.isEmpty())
					q.offer(null);
				continue;
			}
			int sum = 0;
			if (curr.left != null) {
				q.offer(curr.left);
				sum += curr.left.data;
			}
			if (curr.right != null) {
				q.offer(curr.right);
				sum += curr.right.data;
			}
			if (sum != curr.data && sum != 0)
				return 0;
		}
		return 1;
	}

	static Node newNode(int data) {
		Node node = new Node(data);
		node.data = data;
		node.left = null;
		node.right = null;
		return node;
	}

	public static void main(String[] args) {
		Node root = newNode(10);
		root.left = newNode(8);
		root.right = newNode(2);
		root.left.left = newNode(3);
		root.left.right = newNode(5);
		root.right.right = newNode(2);
		if (isSumProperty(root) == 1)
			System.out.println("The given tree satisfies the children sum property");
		else
			System.out.println("The given tree does not satisfy the children sum property");
	}
}