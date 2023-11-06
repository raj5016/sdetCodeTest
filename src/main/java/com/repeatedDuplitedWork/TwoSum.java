package com.repeatedDuplitedWork;

import org.junit.Assert;
import org.junit.Test;

public class TwoSum {
	
	@Test
	public void test1() {
		Assert.assertArrayEquals(new int[] {0,1}, returnIndicesOfsumOfTwoNumIsEqualtoTarget(new int[] {2,7,11,15}, 9));
	}
	
	@Test
	public void test2() {
		Assert.assertArrayEquals(new int[] {1,2}, returnIndicesOfsumOfTwoNumIsEqualtoTarget(new int[] {3,2,4}, 6));
	}

	 public static int[] returnIndicesOfsumOfTwoNumIsEqualtoTarget(int[] nums, int target) {
		 for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if(nums[i]+nums[j]==target) {
					return new int [] {i,j};
				}
			}
		}
		return new int[] {};
		 
	 }
	
}
