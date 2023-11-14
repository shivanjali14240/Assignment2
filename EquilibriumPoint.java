package com.bnt;

public class EquilibriumPoint {
	public static int equilibriumPoint(int[] arr, int n) {
		int totalSum = 0;
		for (int num : arr) {
			totalSum += num;
		}

		int leftSum = 0;

		for (int i = 0; i < n; i++) {
			totalSum -= arr[i];

			if (leftSum == totalSum) {
				return i + 1;
			}

			leftSum += arr[i];
		}

		return -1;
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5, 2, 2 };
		int n1 = arr1.length;
		System.out.println(equilibriumPoint(arr1, n1));

		int[] arr2 = { 1 };
		int n2 = arr2.length;
		System.out.println(equilibriumPoint(arr2, n2));
	}

}
