package com.week2.classwork;

import org.junit.Test;

import junit.framework.Assert;

public class LeetCode_444_ArrangingCoins {
	
	/*
	 	https://leetcode.com/problems/arranging-coins/description/
	 
	 * You have n coins and you want to build a staircase with these coins. 
	 * The staircase consists of k rows where the ith row has exactly i coins. 
	 * The last row of the staircase may be incomplete.

		Given the integer n, return the number of complete rows of the staircase you will build.
	 */
	
	//Return the complete row value atlast
	
	@Test
	public void test1() {
		Assert.assertEquals(2, arrangeCoins(5));
		Assert.assertEquals(2, arrangeCoins2(5));

	}
	
	
	  public int arrangeCoins(int coins) {
	        int row = 1; // which row we are on  //2
			while(coins > 0){  //3
				row++; 
				coins = coins-row; //3-1=2
			}
			return row-1;  //last row will be incomplete
	    }
	  
	  public int arrangeCoins2(int coins) {
	        int row = 0; // which row we are on  //2
			for (int i = 1; i <=coins; i++) {
				row++; 
				coins = coins-row; //3-1=2
			}
			return row;  //last row will be incomplete
	    }
	  
	  
	 

}
