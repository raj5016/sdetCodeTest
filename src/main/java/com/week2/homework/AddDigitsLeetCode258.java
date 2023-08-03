package com.week2.homework;

import org.junit.Assert;
import org.junit.Test;

public class AddDigitsLeetCode258 {
	
	/*https://leetcode.com/problems/add-digits/description/
	 * 
	 * Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

			Example 1:
			
			Input: num = 38
			Output: 2
			Explanation: The process is
			38 --> 3 + 8 --> 11
			11 --> 1 + 1 --> 2 
			Since 2 has only one digit, return it.
			Example 2:
			
			Input: num = 0
			Output: 0
	 */
	
	@Test
	public void test1() {
		System.out.println(sumTheDigitsUntilSingleDigit(38));
		Assert.assertEquals(2, sumTheDigitsUntilSingleDigit(38));
	}
	
	@Test
	public void test2() {
		System.out.println(sumTheDigitsUntilSingleDigit(9));
		Assert.assertEquals(9, sumTheDigitsUntilSingleDigit(9));
	}
	
	@Test
	public void test3() {
		System.out.println(sumTheDigitsUntilSingleDigit(0));
		Assert.assertEquals(0, sumTheDigitsUntilSingleDigit(0));
	}
		
	public int sumTheDigitsUntilSingleDigit(int n) {
	
		int lastDigit=0;
		int sum=0;
		while(n>9) {
			//finds the last digit of the given number    
			lastDigit=n%10;
			//adds last digit to the variable sum  
			sum = sum + lastDigit;  
			//removes the last digit from the number  
			n = n / 10;
			
			if(n<10) {
				n=sum+n;
				sum=0;
			}
		}
		return n;
	}
	

}
