package com.bnt;

public class MergeString {

	public static void main(String[] args) {
		String S1 = "abcd";
		String S2 = "shivefg";

		String mergedString = merge(S1, S2);
		System.out.println("Merged String: " + mergedString);
	}

	public static String merge(String S1, String S2) {
		StringBuilder result = new StringBuilder();
		int i = 0, j = 0;

		while (i < S1.length() && j < S2.length()) {
			result.append(S1.charAt(i));
			result.append(S2.charAt(j));
			i++;
			j++;
		}

		while (i < S1.length()) {
			result.append(S1.charAt(i));
			i++;
		}

		while (j < S2.length()) {
			result.append(S2.charAt(j));
			j++;
		}

		return result.toString();
	}

}
