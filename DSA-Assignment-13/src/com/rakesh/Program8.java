package com.rakesh;

class DoublyLinkedList {
	Node head;

	class Node {
		int data;
		Node next, prev;

		Node(int x) {
			data = x;
			next = null;
			prev = null;
		}
	}

	public void insertBeginning(int data) {
		Node freshNode = new Node(data);
		freshNode.next = head;
		freshNode.prev = null;
		if (head != null)
			head.prev = freshNode;
		head = freshNode;
	}

	public void deletenth(int n) {
		if (head == null) {
			return;
		} else {
			Node current = head;
			int pos = n;
			for (int i = 1; i < pos; i++) {
				current = current.next;
			}
			if (current == head) {
				head = current.next;
			} else if (current == null) {
				current = current.prev;
			} else {
				current.prev.next = current.next;
				current.next.prev = current.prev;
			}
			current = null;
		}
	}

	void printList() {
		Node curr = head;
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		System.out.println();
	}
}

public class Program8 {
	public static void main(String args[]) {
		DoublyLinkedList doublylist = new DoublyLinkedList();
		doublylist.insertBeginning(3);
		doublylist.insertBeginning(2);
		doublylist.insertBeginning(1);
		doublylist.insertBeginning(4);
		doublylist.insertBeginning(7);
		System.out.println("List before deletion : ");
		doublylist.printList();
		doublylist.deletenth(2);
		doublylist.deletenth(3);
		System.out.println("List after deleting 2nd node : ");
		doublylist.printList();

	}
}