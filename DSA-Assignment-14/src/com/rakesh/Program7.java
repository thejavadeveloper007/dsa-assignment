package com.rakesh;

import java.util.Stack;

public class Program7 {
	ListNode head = null;

	class ListNode {
		int val;
		ListNode next;

		public ListNode(int val) {
			this.val = val;
			next = null;
		}
	}

	ListNode reverse(ListNode head) {
		ListNode prev = null, next = null, curr = head;

		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}

	ListNode nextLargerLL(ListNode head) {
		if (head == null)
			return head;
		ListNode res = new ListNode(-1);
		ListNode temp = res;
		head = reverse(head);
		Stack<Integer> st = new Stack<>();

		while (head != null) {
			if (st.empty()) {
				temp.next = new ListNode(0);
				st.push(head.val);
			} else {
				while (!st.empty() && st.peek() <= head.val)
					st.pop();
				if (st.empty()) {
					temp.next = new ListNode(0);
					st.push(head.val);
				} else {
					temp.next = new ListNode(st.peek());
					st.push(head.val);
				}
			}
			head = head.next;
			temp = temp.next;
		}
		temp = res;
		res = res.next;
		res = reverse(res);
		return res;
	}

	public void push(int new_data) {
		ListNode new_node = new ListNode(new_data);
		new_node.next = head;
		head = new_node;
	}

	public void printList(ListNode head) {
		ListNode temp = head;
		while (temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		Program7 ll = new Program7();

		ll.push(2);
		ll.push(1);
		ll.push(5);

		ll.printList(ll.nextLargerLL(ll.head));
	}
}