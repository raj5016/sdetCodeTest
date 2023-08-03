package com.week2.homework;

import org.junit.Test;

public class GetProfitFromBuyandSellStock {
	
	/*
	 * 
	 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
	 * 
			You are given an array prices where prices[i] is the price of a given stock on the ith day.
			
			You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
			
			Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0
			
			Example 1:
			
			Input: prices = [7,1,5,3,6,4]
			Output: 5
			Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
			Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
			
			
			1. Initialize a profit variable as 0.
			2. Initially, the tempProfit variable as 0.
			3. Initially, assign buyvalue  variable to int max value
			3. Operate a for loop to access the prices.
			4. Add if condition to check current price is less than buy value, if so assign current price to buyvalue
			5. currentProfit will be current price - buyvalue.
			6. Add if condition to check current profit is more.
	 */
	
	@Test
	public void test1() {
		System.out.println(maxprofit(new int[] {7,1,5,3,6,4}));
	}
	
	@Test
	public void test2() {
		System.out.println(maxprofit(new int[] {7,6,4}));
	}
	

	
	public int maxprofit(int[] prices) {
		
		int maxProfit=0;
		int currentProfit=0;
		int buyvalue=Integer.MAX_VALUE;
		System.out.println(buyvalue);
		
		for (int i = 0; i < prices.length; i++) {
				
				if(prices[i]<buyvalue) {//Checking current price is less than buy max value
					
					buyvalue=prices[i];
					
				}
				
				currentProfit=prices[i]-buyvalue;
				if(maxProfit<currentProfit) 
				{
					maxProfit=currentProfit;
				}
		}
		return maxProfit;
	}

}
