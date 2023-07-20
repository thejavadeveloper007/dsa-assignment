package com.rakesh;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Program3 {
	static Node root;
	static {
		int data;
		Node left, right;
		int item = 0;
		data = item;
		left = right = null;
	}

	void rightView(Node root) {
		if (root == null) {
			return;
		}
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			int n = q.size();
			for (int i = 0; i < n; i++) {
				Node curr = q.peek();
				q.remove();
				if (i == n - 1) {
					System.out.print(curr.data);
					System.out.print(" ");
				}
				if (curr.left != null) {
					q.add(curr.left);
				}
				if (curr.right != null) {
					q.add(curr.right);
				}
			}
		}
	}

	public static void main(String[] args) {
		Program3 tree = new Program3();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		tree.root.right.left.right = new Node(8);
		tree.rightView(tree.root);
	}
}