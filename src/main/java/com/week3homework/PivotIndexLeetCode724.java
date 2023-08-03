package com.week3homework;

import org.junit.Assert;
import org.junit.Test;


public class PivotIndexLeetCode724 {
	
	//https://leetcode.com/problems/find-pivot-index/description/
	
	/*
	 * 
	 * Given an array of integers nums, calculate the pivot index of this array.

		The pivot index is the index where the sum of all the numbers strictly to the
		 left of the index is equal to the sum of all the numbers strictly to the index's right.
		
		If the index is on the left edge of the array, 
		then the left sum is 0 because there are no elements to the left. 
		This also applies to the right edge of the array.
		
		Return the leftmost pivot index. If no such index exists, return -1.
		Example 1:
		
		Input: nums = [1,7,3,6,5,6]
		Output: 3
		Explanation:
		The pivot index is 3.
		Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
		Right sum = nums[4] + nums[5] = 5 + 6 = 11
	 */
	
	//	Leftsum=0; rightsum=0; total=0
	/*	total=total+arr[i]
	 * rightsum=total-leftsum-arr[i]
	 * if(Leftsum==rightsum) -return i
	 * Leftsum=Leftsum+arr[i]
	 */
	
	@Test
	public void test() {
		System.out.println(returnSumEqualsIndex(new int[] {1,7,3,6,5,6}));
		Assert.assertEquals(3,returnSumEqualsIndex(new int[] {1,7,3,6,5,6}));
	}
	
	@Test
	public void test1() {
		System.out.println(returnSumEqualsIndex(new int[] {1,2,3}));
		Assert.assertEquals(-1, returnSumEqualsIndex(new int[] {1,2,3}));
	}
	
	@Test
	public void test2() {
		System.out.println(returnSumEqualsIndex(new int[] {2,1,-1}));
		Assert.assertEquals(0, returnSumEqualsIndex(new int[] {2,1,-1}));
	}
	
		public int returnSumEqualsIndex(int[] arr) {
			int leftsum=0;
			int rightsum=0;
			int total=0;
			
			for (int i = 0; i < arr.length; i++) {
					total=total+arr[i];
			}
			
			for (int i = 0; i < arr.length; i++) {
				rightsum=total-leftsum-arr[i];
				
				if(rightsum==leftsum) { //17
					return i;
				}
				
				leftsum=leftsum+arr[i];
			}
			
			return -1;
			
		}
	
	
	
}
