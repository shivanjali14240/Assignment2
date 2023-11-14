package com.bnt;

public class GoodOrBadString {
	static int isGoodOrBad(String S) {
		int consecutiveConsonants = 0;
		int consecutiveVowels = 0;

		for (char ch : S.toCharArray()) {
			boolean isVowel = "aeiou".indexOf(ch) != -1;

			if (ch == '?') {
				consecutiveConsonants++;
				consecutiveVowels++;
			} else if (isVowel) {

				consecutiveConsonants = 0;
				consecutiveVowels++;
			} else {

				consecutiveVowels = 0;
				consecutiveConsonants++;
			}

			if (consecutiveVowels > 5 || consecutiveConsonants > 3) {
				return 1;
			}
		}

		return 0;
	}

	public static void main(String[] args) {
		String str = "aeioux";

		int result = isGoodOrBad(str);
		System.out.println(result == 1 ? "BAD" : "GOOD");
	}
}
