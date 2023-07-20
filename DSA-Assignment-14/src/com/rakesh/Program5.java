package com.rakesh;

public class Program5 {
	static class Node {
		int data;
		Node next;
	}

	static Node newNode(int key) {
		Node temp = new Node();
		temp.data = key;
		temp.next = null;
		return temp;
	}

	static Node rearrangeEvenOdd(Node head) {
		if (head == null)
			return null;
		Node odd = head;
		Node even = head.next;
		Node evenFirst = even;

		while (1 == 1) {
			if (odd == null || even == null || (even.next) == null) {
				odd.next = evenFirst;
				break;
			}
			odd.next = even.next;
			odd = even.next;
			if (odd.next == null) {
				even.next = null;
				odd.next = evenFirst;
				break;
			}

			even.next = odd.next;
			even = odd.next;
		}
		return head;
	}

	static void printlist(Node node) {
		while (node != null) {
			System.out.print(node.data + "->");
			node = node.next;
		}
		System.out.println("NULL");
	}

	public static void main(String[] args) {
		Node head = newNode(1);
		head.next = newNode(2);
		head.next.next = newNode(3);
		head.next.next.next = newNode(4);
		head.next.next.next.next = newNode(5);

		System.out.println("Given Linked List");
		printlist(head);

		head = rearrangeEvenOdd(head);

		System.out.println("Modified Linked List");
		printlist(head);
	}
}