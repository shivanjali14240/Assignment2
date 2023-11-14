package com.bnt;

public class PalindromeString {
	public static void main(String[] args) {
		System.out.println(isPalindrome("app"));
	}

	public static int isPalindrome(String s) {
		StringBuilder revsString = new StringBuilder();
		char[] c = s.toCharArray();
		for (int i = c.length - 1; i >= 0; i--) {
			revsString = revsString.append(c[i]);
		}
		if (s.contains(revsString)) {
			return 1;
		} else {
			return 0;
		}
	}

}
