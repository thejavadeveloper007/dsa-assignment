package com.rakesh;

public class Program7 {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	void merge(Program7 q) {
		Node p_curr = head, q_curr = q.head;
		Node p_next, q_next;
		while (p_curr != null && q_curr != null) {
			p_next = p_curr.next;
			q_next = q_curr.next;
			q_curr.next = p_next;
			p_curr.next = q_curr;
			p_curr = p_next;
			q_curr = q_next;
		}
		q.head = q_curr;
	}

	void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String args[]) {
		Program7 prg1 = new Program7();
		Program7 prg2 = new Program7();
		prg1.push(3);
		prg1.push(2);
		prg1.push(1);

		System.out.println("First Linked List:");
		prg1.printList();

		prg2.push(8);
		prg2.push(7);
		prg2.push(6);
		prg2.push(5);
		prg2.push(4);

		System.out.println("Second Linked List:");

		prg1.merge(prg2);

		System.out.println("Modified first linked list:");
		prg1.printList();

		System.out.println("Modified second linked list:");
		prg2.printList();
	}
}