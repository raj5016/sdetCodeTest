package com.repeatedDuplitedWork;

import org.junit.Test;
import org.testng.Assert;

public class DigitsAreSum_leetcode_2180 {
	
	/*
	 * 
			Input: num = 4
			Output: 2
			Explanation:
			The only integers less than or equal to 4 whose digit sums are even are 2 and 4.    
			Example 2:
			
			Input: num = 30
			Output: 14
			Explanation:
			The 14 integers less than or equal to 30 whose digit sums are even are
			2, 4, 6, 8, 11, 13, 15, 17, 19, 20, 22, 24, 26, and 28.
	 */
	@Test
	public void test() {
		Assert.assertEquals(14, returnCounToftotalEvenDigitSum(30));
	}
	
	public int returnCounToftotalEvenDigitSum(int n) {
		int count=0;
		int sum=0;
		
		for (int i = 1; i < n; i++) {
			if(i%2==0 && i<10) {
				count++;
			}
			
			else if(i>=10) {
				String snum=String.valueOf(i);
				String[] s=snum.split("");
				
				for (int j = 0; j < s.length; j++) {
					int value=Integer.valueOf(s[j]);
					sum=sum+value;
			}
			if(sum%2==0) {
				count++;
			}
			sum=0;
		}
		}	
		return count;
		}
	
	}


