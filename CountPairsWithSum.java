package com.bnt;

import java.util.HashMap;

public class CountPairsWithSum {
	public static int getPairsCount(int[] arr, int n, int k) {
		HashMap<Integer, Integer> frequencyMap = new HashMap<>();

		for (int i = 0; i < n; i++) {
			frequencyMap.put(arr[i], frequencyMap.getOrDefault(arr[i], 0) + 1);
		}

		int count = 0;

		for (int i = 0; i < n; i++) {
			int complement = k - arr[i];
			if (frequencyMap.containsKey(complement)) {
				count += frequencyMap.get(complement);

				if (complement == arr[i]) {
					count--;
				}
			}
		}

		return count / 2;
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 5, 7, 1 };
		int n1 = arr1.length;
		int k1 = 6;
		System.out.println(getPairsCount(arr1, n1, k1)); 
		int[] arr2 = { 1, 1, 1, 1 };
		int n2 = arr2.length;
		int k2 = 2;
		System.out.println(getPairsCount(arr2, n2, k2)); 
	}

}
