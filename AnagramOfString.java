package com.bnt;

public class AnagramOfString {

	static int remAnagram(String s1, String s2) {
		int[] countS1 = new int[26];
		int[] countS2 = new int[26];

		for (char c : s1.toCharArray()) {
			countS1[c - 'a']++;
		}

		for (char c : s2.toCharArray()) {
			countS2[c - 'a']++;
		}

		int deletionCount = 0;
		for (int i = 0; i < 26; i++) {
			deletionCount += Math.abs(countS1[i] - countS2[i]);
		}

		return deletionCount;
	}

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "dcb";

		int result = remAnagram(s1, s2);
		System.out.println("Minimum characters to be deleted: " + result);
	}

}
