package com.bnt;

public class PalindromeNumbers {

	public static void main(String[] args) {
		System.out.println(isPalindrome(101));
	}

	public static String isPalindrome(int n) {
		int rev = 0, temp;
		int num = n;
		while (n >1) {
			for (int i = 1; i <= n; i++) {
				temp = n % 10;
				rev = (rev * 10) + temp;       
				n = n / 10;
			}
			
		}
		if (rev == num) {
			return "Yes";
		}
		return "No";

	}
}
