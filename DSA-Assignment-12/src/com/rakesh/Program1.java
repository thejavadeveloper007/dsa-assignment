package com.rakesh;

public class Program1 {
	static class Node {
		int data;
		Node next;
	}
	static Node deleteMid(Node head) {
		if (head == null)
			return null;
		if (head.next == null) {
			return null;
		}
		Node slow_ptr = head;
		Node fast_ptr = head;
		Node prev = null;
		while (fast_ptr != null && fast_ptr.next != null) {
			fast_ptr = fast_ptr.next.next;
			prev = slow_ptr;
			slow_ptr = slow_ptr.next;
		}
		prev.next = slow_ptr.next;

		return head;
	}
	static void printList(Node ptr) {
		while (ptr != null) {
			System.out.print(ptr.data + "->");
			ptr = ptr.next;
		}
		System.out.println("NULL");
	}
	static Node newNode(int data) {
		Node temp = new Node();
		temp.data = data;
		temp.next = null;
		return temp;
	}
	public static void main(String[] args) {
		Node head = newNode(1);
		head.next = newNode(2);
		head.next.next = newNode(3);
		head.next.next.next = newNode(4);

		System.out.println("Given Linked List");
		printList(head);

		head = deleteMid(head);

		System.out.println("Linked List after deletion of middle");
		printList(head);
	}
}
