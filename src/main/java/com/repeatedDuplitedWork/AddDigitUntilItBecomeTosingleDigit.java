package com.repeatedDuplitedWork;

import org.junit.Assert;
import org.junit.Test;

public class AddDigitUntilItBecomeTosingleDigit {
	
	@Test
	public void test() {
		Assert.assertEquals(2,returnSingleDigit(38));
	}
	
	
	public int returnSingleDigit(int n) {
		int lastDigit=0;
		int sum=0;
		
		while(n>9) {
			lastDigit=n%10;
			sum=sum+lastDigit;
			n=n/10;
			if(n<10) {
				n=n+sum;
				sum=0;
			}
		}
		
		return n;
		
	}
// adding
}
