package com.bnt;

import java.util.Arrays;

public class SmallestAndSecondSmallest {
	public static void main(String[] args) {
		int[] arr1 = { 5, 2, 4, 3, 5, 6 };
		int n1 = 6;
		int[] result1 = minAnd2ndMin(arr1, n1);
		System.out.println(Arrays.toString(result1));

		int[] arr2 = { 6, 1, 2, 1, 3, 6, 7 };
		int n2 = 7;
		int[] result2 = minAnd2ndMin(arr2, n2);
		System.out.println(Arrays.toString(result2));
	}

	public static int[] minAnd2ndMin(int[] A, int N) {
		if (N < 2) {
			return new int[] { -1, -1 }; 
		}

		int first = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;

		for (int i = 0; i < N; i++) {
			if (A[i] < first) {
				second = first;
				first = A[i];
			} else if (A[i] < second && A[i] != first) {
				second = A[i];
			}
		}

		if (second == Integer.MAX_VALUE) {
			return new int[] { -1, -1 }; 
		}

		return new int[] { first, second };
	}
}
