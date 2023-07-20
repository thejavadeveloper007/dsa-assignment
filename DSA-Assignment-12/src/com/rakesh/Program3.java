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

	void printNthFromLast(int N) {
		Node main_ptr = head;
		Node ref_ptr = head;

		int count = 0;
		if (head != null) {
			while (count < N) {
				if (ref_ptr == null) {
					System.out.println(N + " is greater than the no " + " of nodes in the list");
					return;
				}
				ref_ptr = ref_ptr.next;
				count++;
			}

			if (ref_ptr == null) {

				if (head != null)
					System.out.println("Node no. " + N + " from last is " + head.data);
			} else {

				while (ref_ptr != null) {
					main_ptr = main_ptr.next;
					ref_ptr = ref_ptr.next;
				}
				System.out.println("Node no. " + N + " from last is " + main_ptr.data);
			}
		}
	}

	public void push(int new_data) {
		Node new_node = new Node(new_data);

		new_node.next = head;

		head = new_node;
	}

	public static void main(String[] args) {
		Program3 prg = new Program3();
		prg.push(20);
		prg.push(4);
		prg.push(15);
		prg.push(35);
		prg.printNthFromLast(4);
	}
}
