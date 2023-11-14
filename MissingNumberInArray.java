package com.bnt;

public class MissingNumberInArray {
	public static int findMissingNumber(int[] arr, int N) {
		int totalSum = N * (N + 1) / 2;
		int actualSum = 0;

		for (int num : arr) {
			actualSum += num;
		}

		return totalSum - actualSum;
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 5 };
		int N1 = 5;
		System.out.println(findMissingNumber(arr1, N1)); 

		int[] arr2 = { 6, 1, 2, 8, 3, 4, 7, 10, 5 };
		int N2 = 10;
		System.out.println(findMissingNumber(arr2, N2)); 
	}

}
