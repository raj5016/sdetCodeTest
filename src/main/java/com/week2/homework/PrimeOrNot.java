package com.week2.homework;

import org.junit.Assert;
import org.junit.Test;


public class PrimeOrNot {
	
	
	@Test
	public void test1() {
		Assert.assertEquals(true, isPrime(5));
	}
	
	
	public Boolean isPrime(int n) {
		
		if(n<1) {
			return false;
		}
		for(int i=1;i<n/2;i++) {
			if(n%1==0) {
				return false;
			}
		}
		return true;
		
	}

}
