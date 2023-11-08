package com.bnt;

public class ConfusedPappu {
	public static void main(String[] args) {
		System.out.println(findDiff(56));
	}

	public static int findDiff(int amount) {
		String amountStr = String.valueOf(amount);
		String modifiedAmountStr = amountStr.replace('6', '9');
		int maxExtraAmount = Integer.parseInt(modifiedAmountStr);
		int extraAmount = maxExtraAmount - amount;
		return extraAmount;
	}

}
