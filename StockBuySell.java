package com.bnt;

import java.util.ArrayList;
import java.util.List;

public class StockBuySell {

	public static List<List<Integer>> stockBuySell(int[] prices, int n) {
		List<List<Integer>> result = new ArrayList<>();

		int i = 0;
		while (i < n - 1) {

			while (i < n - 1 && prices[i] >= prices[i + 1]) {
				i++;
			}

			if (i == n - 1) {
				break;
			}

			int buy = i++;

			while (i < n && prices[i] >= prices[i - 1]) {
				i++;
			}

			int sell = i - 1;

			List<Integer> pair = new ArrayList<>();
			pair.add(buy);
			pair.add(sell);
			result.add(pair);
		}

		return result;
	}

	public static void main(String[] args) {
		int[] prices1 = { 100, 180, 260, 310, 40, 535, 695 };
		int n1 = prices1.length;
		System.out.println(stockBuySell(prices1, n1));

		int[] prices2 = { 4, 2, 2, 2, 4 };
		int n2 = prices2.length;
		System.out.println(stockBuySell(prices2, n2));
	}
}
