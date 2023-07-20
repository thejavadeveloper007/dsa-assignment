package com.rakesh;

import java.util.List;

public class Program1 {
	public static ListNode mergeKLists(ListNode[] lists) {
		if (lists.length == 0)
			return null;
		if (lists.length == 1)
			return lists[0];
		ListNode merged = Sorted(lists[0], lists[1]);
		for (int i = 2; i < lists.length; i++) {
			merged = Sorted(merged, lists[i]);
		}
		return merged;
	}

	public static ListNode Sorted(ListNode list1, ListNode list2) {
		ListNode list = new ListNode(-1);
		ListNode temp = list;
		while (list1 != null && list2 != null) {
			if (list1.val < list2.val) {
				temp.next = list1;
				list1 = list1.next;
				temp = temp.next;
			} else {
				temp.next = list2;
				list2 = list2.next;
				temp = temp.next;
			}
		}
		while (list1 != null) {
			temp.next = list1;
			list1 = list1.next;
			temp = temp.next;
		}
		while (list2 != null) {
			temp.next = list2;
			list2 = list2.next;
			temp = temp.next;
		}

		return list.next;

	}

	public static void main(String args[]) {
		int[][] lists = { { 1, 4, 5 }, { 1, 3, 4 }, { 2, 6 } };
		System.out.println(mergeKLists(lists));
	}
}