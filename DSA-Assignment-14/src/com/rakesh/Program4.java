package com.rakesh;

/*class Node {
	int data;
	Node next, random;

	Node(int x) {
		data = x;
		next = random = null;
	}
}*/

public class Program4 {
	public static void main(String[] args) {
		// Creating a linked list with random pointer
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.random = head.next.next;
		head.next.random = head;
		head.next.next.random = head.next.next.next.next;
		head.next.next.next.random = head.next.next;
		head.next.next.next.next.random = head.next;

		// Print the original list
		System.out.println("The original linked list:");
		printList(head);

		// Function call
		Node sol = cloneLinkedList(head);

		System.out.println("The cloned linked list:");
		printList(sol);
	}

	public static Node cloneLinkedList(Node head) {
		if (head == null) {
			return null;
		}

		// Step 1: Create new nodes and insert them next to the original nodes
		Node curr = head;
		while (curr != null) {
			Node newNode = new Node(curr.data);
			newNode.next = curr.next;
			curr.next = newNode;
			curr = newNode.next;
		}

		// Step 2: Set the random pointers of the new nodes
		curr = head;
		while (curr != null) {
			if (curr.random != null) {
				curr.next.random = curr.random.next;
			}
			curr = curr.next.next;
		}

		// Step 3: Separate the new nodes from the original nodes
		curr = head;
		Node clonedHead = head.next;
		Node clonedCurr = clonedHead;
		while (clonedCurr.next != null) {
			curr.next = curr.next.next;
			clonedCurr.next = clonedCurr.next.next;
			curr = curr.next;
			clonedCurr = clonedCurr.next;
		}
		curr.next = null;
		clonedCurr.next = null;

		return clonedHead;
	}

	// Function to print the linked list
	public static void printList(Node head) {
		System.out.print(head.data + "(" + head.random.data + ")");
		head = head.next;
		while (head != null) {
			System.out.print(" -> " + head.data + "(" + head.random.data + ")");
			head = head.next;
		}
		System.out.println();
	}
}