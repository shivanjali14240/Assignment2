package com.bnt;

public class SubsequenceCheck {
	public static boolean isSubSequence(String A, String B) {
		int i = 0, j = 0;

		while (i < A.length() && j < B.length()) {
			if (A.charAt(i) == B.charAt(j)) {
				i++;
			}
			j++;
		}

		return i == A.length();
	}

	public static void main(String[] args) {
		String A1 = "AXY";
		String B1 = "YADXCP";
		System.out.println(isSubSequence(A1, B1));

		String A2 = "gksrek";
		String B2 = "geeksforgeeks";
		System.out.println(isSubSequence(A2, B2));
	}
}
