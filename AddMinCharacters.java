package com.bnt;

public class AddMinCharacters {
	public static int addMinChar(String str) {
		int count = 0;
		int left = 0;
		int right = str.length() - 1;

		while (left < right) {
			if (str.charAt(left) == str.charAt(right)) {
				left++;
				right--;
			} else {
				count++;
				right--;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		String str = "shivshiv";
		int minChars = addMinChar(str);
		System.out.println("Minimum characters to add: " + minChars);
	
}
}
