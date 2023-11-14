package com.bnt;

public class MaxProductSubarray {
	public static long maxProduct(int[] arr, int n) {
		if (n == 0) {
			return 0;
		}

		long maxEndingHere = arr[0];
		long minEndingHere = arr[0];
		long maxProduct = arr[0];

		for (int i = 1; i < n; i++) {
			if (arr[i] < 0) {
				long temp = maxEndingHere;
				maxEndingHere = minEndingHere;
				minEndingHere = temp;
			}

			maxEndingHere = Math.max(arr[i], maxEndingHere * arr[i]);
			minEndingHere = Math.min(arr[i], minEndingHere * arr[i]);

			maxProduct = Math.max(maxProduct, maxEndingHere);
		}

		return maxProduct;
	}

	public static void main(String[] args) {
		int[] arr1 = { 6, -3, -10, 0, 2 };
		int n1 = arr1.length;
		System.out.println(maxProduct(arr1, n1));

		int[] arr2 = { 2, 3, 4, 5, -1, 0 };
		int n2 = arr2.length;
		System.out.println(maxProduct(arr2, n2));
	}

}
