package com.week3homework;

import org.junit.Assert;
import org.junit.Test;

public class CountPrimeInGivenRange {
	
	
	//https://leetcode.com/problems/count-primes/description/
	
@Test
public void test() {
	Assert.assertEquals(4, countTotalPrime(10));
}

	public int countTotalPrime(int n) {
		int count=0;
		for (int i = 2; i <= n; i++) {
			if (isPrime(i)) {
				count++;
			}
		}
		return count;
		
	}
	
	public boolean isPrime(int n) {
	        
	      if(n<=1) {
	    	  return false;
	      }
	      
			for (int i = 2; i*i <=n; i++) {
				if (n % i == 0) {
					return false;
				}
			}
			return true;
	}


}


