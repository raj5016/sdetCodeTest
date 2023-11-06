package com.repeatedDuplitedWork;

import org.junit.Test;
import org.testng.Assert;

public class SpyNumber {
	
	@Test
	public void test() {
		Assert.assertEquals(true, isSpyNumber(123));
		Assert.assertEquals(true, isspy1(123));
	}
	
	@Test
	public void test1() {
		Assert.assertEquals(false, isSpyNumber(245));
		Assert.assertEquals(false, isspy1(245));
	}
	
	
	public boolean isSpyNumber(int n) {//123
		String snum=String.valueOf(n);
		String[] s=snum.split("");
		int sum=0;
		int product=1;
		for (int i = 0; i < s.length; i++) {
				sum=sum+Integer.parseInt(s[i]);
				product=product*Integer.parseInt(s[i]);
		}
		if (sum==product) {
			return true;
		}
		return false;
		
	}
	
	public boolean isspy1(int n) {
		int remaindar;
		int sum=0;
		int product = 1;
		
		while(n>0) {
			remaindar=n%10;
			sum=sum+remaindar;
			product=product*remaindar;
			n=n/10;
		}
		if (sum==product) {
			return true;
		}
		return false;
		
	}

}
