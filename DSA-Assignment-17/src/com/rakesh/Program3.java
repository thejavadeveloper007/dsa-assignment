package com.rakesh;

import java.util.*;

import javax.annotation.processing.SupportedAnnotationTypes;

public class Program3 {
	public static int countStudents(int[] students, int[] sandwiches) {
		Stack<Integer> sandwichStack = new Stack<>();
		Queue<Integer> studentQueue = new LinkedList<>();
		for (int i = 0; i < students.length; i++) {
			sandwichStack.push(sandwiches[sandwiches.length - i - 1]);
			studentQueue.offer(students[i]);
		}

		int couldntServe = 0;
		while (true) {
			if (sandwichStack.peek() == studentQueue.peek()) {
				couldntServe = 0;
				sandwichStack.pop();
				studentQueue.poll();
			} else {
				couldntServe++;
				studentQueue.offer(studentQueue.poll());
			}
			if (couldntServe == studentQueue.size()) {
				break;
			}
		}

		return couldntServe;
	}

	public static void main(String args[]) {
		int[] students = { 1, 1, 0, 0 };
		int[] sandwiches = { 0, 1, 0, 1 };
		System.out.println(countStudents(students, sandwiches));
	}
}
