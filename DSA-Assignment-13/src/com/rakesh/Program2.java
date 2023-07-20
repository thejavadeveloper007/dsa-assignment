package com.rakesh;

public class Program2 {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	void removeDuplicates() {
		Node temp = head, prev = head;
		while (temp != null) {
			if (temp.data != prev.data) {
				prev.next = temp;
				prev = temp;
			}
			temp = temp.next;
		}
		prev.next = null;
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
		Program2 prg = new Program2();
		prg.push(11);
		prg.push(11);
		prg.push(11);
		prg.push(21);
		prg.push(43);
		prg.push(43);
		prg.push(60);

		System.out.print("List before ");
		System.out.println("removal of duplicates");
		prg.printList();

		prg.removeDuplicates();

		System.out.println("List after removal of elements");
		prg.printList();
	}
}