package com.week2.classwork;

import org.junit.Assert;
import org.junit.Test;


public class PowerofTwo {
	
	
	/*https://leetcode.com/problems/power-of-two/description/
	 * Pseudo Code:
 
	 */
	@Test
	public void test1() {		
		Assert.assertEquals(false, checkPowerOf2(5));
	}
	
	@Test
	public void test2() {		
		Assert.assertEquals(true, checkPowerOf2(16));
	}
	
	@Test
	public void test3() {		
		Assert.assertEquals(false, checkPowerOf2(-4));
	}
	
	
	
	public boolean checkPowerOf2(int num) {
		if(num<=0) {
			return false;
		}
		while(num%2==0) {
			num=num/2;
		}
		return num==1;
	}
}
