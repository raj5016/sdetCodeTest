package com.week2.homework;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class SquareOfNumbersInAnArray {
	
	/* https://leetcode.com/problems/squares-of-a-sorted-array/
	 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
		Example 1:
		
		Input: nums = [-4,-1,0,3,10]
		Output: [0,1,9,16,100]
		Explanation: After squaring, the array becomes [16,1,0,9,100].
		After sorting, it becomes [0,1,9,16,100].
	 */
	
	/*
	 * Pseudocode:
	 * Input is array of nums
	 * OutPut is array of nums of squares
	 * Iterate with loop until the array of length
	 * take the first num and square it and assign it to same num 
	 * After the loop sort the array
	 */
	
	
	@Test
	public void test1() {
		int[] nums=returnSquareOfNum(new int[] {-4,-1,0,3,10});
		System.out.println(Arrays.toString(nums));
		Assert.assertArrayEquals(new int[] {0,1,9,16,100}, returnSquareOfNum(new int[] {-4,-1,0,3,10}));
	}
	
	public int[] returnSquareOfNum(int[] nums) {
	
		for(int i=0;i<nums.length;i++) {
			nums[i]=nums[i]*nums[i];
		}
		Arrays.sort(nums);
		return nums;
		
	}
}
