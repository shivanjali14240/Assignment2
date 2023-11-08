package com.bnt;

public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println(isPrime(7));
	}

	public static int isPrime(int n) {
		if (n == 0 || n == 1) {
			return 0;
		}
		if (n == 2)
			return 1;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return 0;
			}
		}
		return 1;
	}

}
