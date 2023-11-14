package com.bnt;

import java.util.ArrayList;
import java.util.List;

public class SieveOfEratosthenes {
	public static List<Integer> sieveOfEratosthenes(int N) {
		boolean[] isPrime = new boolean[N + 1];
		List<Integer> primes = new ArrayList<>();

		for (int i = 2; i <= N; i++) {
			isPrime[i] = true;
		}

		for (int i = 2; i * i <= N; i++) {
			if (isPrime[i]) {
				for (int j = i * i; j <= N; j += i) {
					isPrime[j] = false;
				}
			}
		}

		for (int i = 2; i <= N; i++) {
			if (isPrime[i]) {
				primes.add(i);
			}
		}

		return primes;
	}

	public static void main(String[] args) {
		int N1 = 10;
		System.out.println(sieveOfEratosthenes(N1)); 

		int N2 = 35;
		System.out.println(sieveOfEratosthenes(N2)); 
	}

}
