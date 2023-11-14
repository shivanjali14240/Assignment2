package com.bnt;

public class StockBuySellII {
	
		public static int stockBuyAndSell(int[] prices, int n) {
			int maxProfit = 0;

			for (int i = 1; i < n; i++) {
				if (prices[i] > prices[i - 1]) {
					maxProfit += prices[i] - prices[i - 1];
				}
			}

			return maxProfit;
		}

		public static void main(String[] args) {
			int[] prices1 = { 3, 4, 1, 5 };
			int n1 = prices1.length;
			System.out.println(stockBuyAndSell(prices1, n1)); 

			int[] prices2 = { 1, 3, 5, 7, 9 };
			int n2 = prices2.length;
			System.out.println(stockBuyAndSell(prices2, n2)); 
		}
	}


