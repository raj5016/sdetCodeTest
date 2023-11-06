package com.repeatedDuplitedWork;

import org.junit.Test;
import org.testng.Assert;

public class SpyNumberOrNot {
	
	/*
	 * 
	 * A number is said to be a Spy number if the sum of all the 
	 * digits is equal to the product of all digits.
	 */
	
	
	//  256 --  2+5+6=>13
	//  256 -- 2*5*6 =>60   no spy  156  =
	
	@Test
	public void test() {
		Assert.assertEquals(true, isSpyNumber(123));
	}
	
	@Test
	public void test1() {
		Assert.assertEquals(false, isSpyNumber(256));
		Assert.assertEquals(false, isSpyNumber(245));
	}
	
	
	public boolean isSpyNumber(int num) {
		int remaindar=0;
		int sum=0;
		int product=1;
		
		while(num>0) {
			 remaindar  =num%10;
			 sum=remaindar+sum;
			 product=remaindar*product;
			 num=num/10;
		}
		return sum==product;
	}

}
