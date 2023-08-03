package com.repeatedDuplitedWork;

import org.junit.Assert;
import org.junit.Test;


public class BuyAndSellStock {
	
	//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/ 
	
	@Test
	public void test1() {
		System.out.println(returnMaxProfit(new int[] {7,1,5,3,6,4}));
		Assert.assertEquals(5, returnMaxProfit(new int[] {7,1,5,3,6,4}));
	}
	//7,1,5,3,6,4]
	public int returnMaxProfit(int arr[]) {
		int maxProfit=0;
		int tempProfit=0;
		int buyValue=Integer.MAX_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<buyValue) { //compare prices []i is less than buyvalue
				buyValue=arr[i];
			}
				tempProfit=arr[i]-buyValue;
				if(maxProfit<tempProfit) {
					maxProfit=tempProfit;
				}
			}
		return maxProfit;
	}

}

