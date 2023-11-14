package com.bnt;

public class FibonacciseriesUptoNthTerm {

	public static void main(String[] args) {
		int N = 5;
		int[] result = series(N);

		for (int num : result) {
			System.out.print(num + " ");
		}
	}

	public static int[] series(int N) {
		int[] fibSeries = new int[N];

		if (N >= 1) {
			fibSeries[0] = 0;
		}
		if (N >= 2) {
			fibSeries[1] = 1;
		}

		for (int i = 2; i < N; i++) {
			fibSeries[i] = fibSeries[i - 1] + fibSeries[i - 2];
		}

		return fibSeries;
	}
}
