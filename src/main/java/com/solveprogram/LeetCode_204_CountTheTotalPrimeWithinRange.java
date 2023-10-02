package com.solveprogram;

import org.junit.Test;

public class LeetCode_204_CountTheTotalPrimeWithinRange {
	
	//204- https://leetcode.com/problems/count-primes/description/

	
//=============================================================================    
	@Test
	public void test1() {
		System.out.println(countPrimeNumber(10));
	}
    
    
    public int countPrimeNumber(int input) {
    	int count=0;
    	while(input>0) {
    		if(isPrime(input)) {
    			count++;
    		}
    	input--;
    	}
    	return count;
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
