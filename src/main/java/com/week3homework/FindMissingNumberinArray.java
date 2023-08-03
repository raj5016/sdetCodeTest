package com.week3homework;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class FindMissingNumberinArray {
	
	//https://leetcode.com/problems/missing-number/description/
	
	/*
	 * Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

		 
		
		Example 1:
		
		Input: nums = [3,0,1]
		Output: 2
		Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
		Example 2:
		
		Input: nums = [0,1]
		Output: 2
		Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
	 */
	@Test
	public void test1() {
		Assert.assertEquals(2, missingnumbers(new int[] {3,0,1}));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(2, missingnumbers(new int[] {0,1}));
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(8, missingnumbers(new int[] {9,6,4,2,3,5,7,0,1}));
	}
	
	
	public int missingnumbers(int[] arr) {
		int n=arr.length;
		int totalSum=n*(n+1)/2;
		for (int i : arr) {
			totalSum=totalSum-i;
		}
		return totalSum;
		
	}
}
