package com.week3classwork;

import org.junit.Assert;
import org.junit.Test;

public class NumberofSeniorCitizens {
	
	@Test
	public void test1() {
		Assert.assertEquals(2, returnAgegreaterThan60(new String [] {"7868190130M7522","5303914400F9211","9273338290F4010"}));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(0, returnAgegreaterThan60(new String [] {"1313579440F2036","2921522980M5644"}));
	}
	
	
	@Test
	public void test3() {
		Assert.assertEquals(0, returnAgegreaterThan60(new String [] {"1313579440F0036","2921522980M0044"}));
	}
	
	
	public int returnAgegreaterThan60(String[] input) {
		int count=0;
		for (int i = 0; i < input.length; i++) {
			int age=Integer.parseInt(input[i].substring(11, 13));
			if(age>60) {
				count++;
			}
		}
		return count;
		
	}

}
