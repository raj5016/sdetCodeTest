package com.week2.homework;

import org.junit.Assert;
import org.junit.Test;

public class LeetCode_326_PowerOfThree {
	
	/*https://leetcode.com/problems/power-of-three/description/
	 * Given an integer n, return true if it is a power of three. Otherwise, return
	 * false.
	 * 
	 * An integer n is a power of three, if there exists an integer x such that n ==
	 * 3x.
	 * 
	
	 * Example 1:
	 * 
	 * Input: n = 27 Output: true Explanation: 27 = 33
	 */
	@Test
	public void test1() {
		Assert.assertEquals(true, isPowerOfThree(27));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(false, isPowerOfThree(24));
	}
	
	public boolean isPowerOfThree(int n) {
			if(n<=0) {
				return false;
			}
			while(n%3==0) {
				n=n/3;
			}
			return n==1;
	}
}
