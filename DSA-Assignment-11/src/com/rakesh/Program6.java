package com.rakesh;

public class Program6 {
	static int findMin(int arr[], int n) {
		int min_ele = arr[0];
		for (int i = 0; i < n; i++) {
			if (arr[i] < min_ele) {
				min_ele = arr[i];
			}
		}

		return min_ele;
	}

	public static void main(String[] args) {
		int arr[] = { 3, 4, 5, 1, 2 };
		int N = arr.length;
		System.out.println(findMin(arr, N));
	}
}