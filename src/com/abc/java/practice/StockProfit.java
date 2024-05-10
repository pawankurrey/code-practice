package com.abc.java.practice;

public class StockProfit {
	/**		The cost of a stock on each day is given in an array. Find the maximum profit that you can make by buying and selling on those days. If the given array of prices is sorted in decreasing order, then profit cannot be earned at all.
		 
		Examples:
		 
		Input: arr[] = {100, 180, 260, 310, 40, 535, 695}
		Output: 865
		Explanation: Buy the stock on day 0 and sell it on day 3 => 310 – 100 = 210
		                       Buy the stock on day 4 and sell it on day 6 => 695 – 40 = 655
		                       Maximum Profit  = 210 + 655 = 865
		 
		Input: arr[] = {4, 2, 2, 2, 4}
		Output: 2
		Explanation: Buy the stock on day 1 and sell it on day 4 => 4 – 2 = 2
		                       Maximum Profit  = 2
		int[] prices = { 100, 180, 260, 310, 40, 535, 695 };**/
	public static int maxProfit(int[] prices) {
		int n = prices.length;
		int maxProfit = 0;
		// prices[] = {100, 180, 260, 310, 40, 535, 695};
		for (int i = 1; i < n; i++) {
			// If current price is greater than previous price, we can make profit
			if (prices[i] > prices[i - 1]) {
				// Add the difference between current and previous price to maxProfit
				maxProfit += prices[i] - prices[i - 1];
			}
		}

		return maxProfit;
	}
	
	/**You are given an array prices where prices[i] is the price of a given stock on the ith day.

	You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

	Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

	 

	Example 1:

	Input: prices = [7,1,5,3,6,4]
	Output: 5
	Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
	Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.**/
	public static int singleBuyAndSellMaxProfit(int[] prices) {
		int lsf = Integer.MAX_VALUE; // least so far
        int op = 0; // overall profit
        int pist = 0; // profit if sold today
        
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < lsf){ // if we found new buy value which is more smaller then previous one
                lsf = prices[i]; // update our least so far
            }
            pist = prices[i] - lsf; // calculating profit if sold today by, Buy - sell
            if(op < pist){ // if pist is more then our previous overall profit
                op = pist; // update overall profit
            }
        }
        return op;
	}
	

	public static void main(String[] args) {
		int[] prices1 = { 100, 180, 260, 310, 40, 535, 695 };
		System.out.println("Profit :"+maxProfit(prices1));
		int[] prices2 = { 7,1,5,3,6,4 };
		System.out.println("Profit :"+singleBuyAndSellMaxProfit(prices2));
	}

}
