package com.week2.classwork;

import org.junit.Test;

import junit.framework.Assert;

public class CountMaxOccuranceOfElement {
	
	/*
	 	Given a sorted array arr[] and a number x, write a function that 
		counts the occurrences of x in arr[].
		
		arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 2
		output = 4
	 */

	@Test
	public void test1() {
		Assert.assertEquals(4, countMaxOccuranceOfEle (new int[] {1, 1, 2, 2, 2, 2, 3},2));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(1, countMaxOccuranceOfEle (new int[] {1, 2, 3},2));
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(0, countMaxOccuranceOfEle (new int[] {},2));
	}
	
	@Test
	public void test4() {
		Assert.assertEquals(0, countMaxOccuranceOfEle (new int[] {},0));
	}
	
	public int countMaxOccuranceOfEle(int [] nums,int targetEle) {
		int count=0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]==targetEle)
			count++;
		}
		return count;
		
		
	}

}
