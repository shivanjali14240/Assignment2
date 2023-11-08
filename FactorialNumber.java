package com.bnt;

public class FactorialNumber {
	public static void main(String[] args) {
		System.out.println(factorial(6));

	}

	public static int factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;

		}
		return fact;
	}

}
