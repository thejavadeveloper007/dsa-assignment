package com.rakesh;

import java.util.Stack;

public class Program7 {
	static Node head;

	static class Node {

		int data;
		Node next, prev;

		Node(int d) {
			data = d;
			next = prev = null;
		}
	}

	void reverse() {
		Stack<Integer> stack = new Stack<>();
		Node temp = head;
		while (temp != null) {
			stack.push(temp.data);
			temp = temp.next;
		}
		temp = head;
		while (temp != null) {
			temp.data = stack.pop();
			temp = temp.next;
		}
	}

	void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.prev = null;
		new_node.next = head;
		if (head != null) {
			head.prev = new_node;
		}
		head = new_node;
	}

	void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public static void main(String[] args) {
		Program7 prg = new Program7();
		prg.push(10);
		prg.push(8);
		prg.push(4);
		prg.push(2);

		System.out.println("Original linked list ");
		prg.printList(head);

		prg.reverse();
		System.out.println("");
		System.out.println("The reversed Linked List is ");
		prg.printList(head);
	}
}