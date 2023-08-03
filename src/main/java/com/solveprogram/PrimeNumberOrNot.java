package com.solveprogram;

import org.junit.Assert;
import org.junit.Test;

public class PrimeNumberOrNot {
	
	
	
	/*
	 * Pseudocode:
	 * 
	 * Prime number starts from 2 and prime numbers can't be divided by other numbers than itself or 1.
	 * 
	 * Take the input 
	 * Output should be boolean
	 * Set boolean flag as false  
	 * Check the condition is given input is less than or equal to 1 , if so return false
	 *  Traverse the  loop from 2 to num/2.It is because a number is not divisible by more than its half.
	 *  Prime number are  2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97.
	 */
	@Test
	public void test1() {
		Assert.assertEquals(false, isPrime(20));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(false, isPrime(1));
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(true, isPrime(17));
	}
	
	@Test
	public void test4() {
		Assert.assertEquals(true, isPrime(3));
	}
	
	
	
	public boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}
