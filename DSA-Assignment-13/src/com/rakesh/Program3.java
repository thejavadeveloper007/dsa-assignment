package com.rakesh;

public class Program3 {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	Node reverse(Node head, int k) {
		if (head == null)
			return null;
		Node current = head;
		Node next = null;
		Node prev = null;

		int count = 0;
		while (count < k && current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			count++;
		}
		if (next != null)
			head.next = reverse(next, k);
		return prev;
	}

	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
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
		Program3 prg = new Program3();
		prg.push(1);
		prg.push(2);
		prg.push(2);
		prg.push(4);
		prg.push(5);
		prg.push(6);
		prg.push(7);
		prg.push(8);

		System.out.println("Given Linked List");
		prg.printList();

		prg.head = prg.reverse(prg.head, 3);

		System.out.println("Reversed list");
		prg.printList();
	}
}
