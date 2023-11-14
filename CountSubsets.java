package com.bnt;

public class CountSubsets {
	public static void main(String[] args) {
		int[] arr1 = { 4, 2, 1, 9, 2, 6, 5, 3 };
		int n1 = 8;
		System.out.println(countSubsets(arr1, n1));

		int[] arr2 = { 10, 3, 4, 2, 4, 20, 10, 6, 8, 14, 2, 6, 9 };
		int n2 = 13;
		System.out.println(countSubsets(arr2, n2));
	}

	public static int countSubsets(int[] a, int n) {
		return countSubsetsHelper(a, n, 0, new boolean[n]);
	}

	private static int countSubsetsHelper(int[] a, int n, int index, boolean[] used) {
		if (index == n) {
			if (isDistinctEvenSubset(a, n, used)) {
				return 1;
			} else {
				return 0;
			}
		}

		used[index] = true;
		int countWithCurrent = countSubsetsHelper(a, n, index + 1, used);

		used[index] = false;
		int countWithoutCurrent = countSubsetsHelper(a, n, index + 1, used);

		return countWithCurrent + countWithoutCurrent;
	}

	private static boolean isDistinctEvenSubset(int[] a, int n, boolean[] used) {
		boolean hasEven = false;
		for (int i = 0; i < n; i++) {
			if (used[i]) {
				if (a[i] % 2 != 0 || hasEven) {
					return false; 
				}
				hasEven = true;
			}
		}
		return hasEven;
	}

}
