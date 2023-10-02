package com.week2.classwork;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;


public class TwoSumLeetCode1 {
	
	/*
	 * https://leetcode.com/problems/two-sum/description/
	 * Sum of two number is equal to target
	 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

		You may assume that each input would have exactly one solution, and you may not use the same element twice.
		
		You can return the answer in any order.
		
		 
		
		Example 1:
		
		Input: nums = [2,7,11,15], target = 9
		Output: [0,1]
		Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
		new int[] {0,1}
	 */
	
		@Test
		public void test1() {
			Assert.assertArrayEquals(new int[] {0,1}, returnIndicesOfsumOfTwoNumIsEqualtoTarget(new int[] {2,7,11,15}, 9));
		}
		
		@Test
		public void test2() {
			//Assert.assertArrayEquals(new int[] {1,2}, returnIndicesOfsumOfTwoNumIsEqualtoTarget(new int[] {3,2,4}, 6));
			Assert.assertArrayEquals(new int[] {1,2}, returnIndicesOfsumOfTwoNumIsEqualtoTargetByHashMap(new int[] {3,2,4}, 6));
		}
		
		@Test
		public void test3() {
			Assert.assertArrayEquals(new int[] {0,1}, returnIndicesOfsumOfTwoNumIsEqualtoTarget(new int[] {3,3}, 6));
		}
	
		public int[] returnIndicesOfsumOfTwoNumIsEqualtoTarget(int[] arr,int target) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = i+1; j < arr.length; j++) {
					if(arr[i]+arr[j]==target) {
						return new int[] {i,j};
					}
				}
			}
			return new int[] {};
			
		}
		
		//HashMap
		public int[] returnIndicesOfsumOfTwoNumIsEqualtoTargetByHashMap(int[] arr,int target) {
			HashMap<Integer, Integer> hmap=new HashMap<Integer, Integer>();
			for (int i = 0; i < arr.length; i++) {
				if(hmap.containsKey(target-arr[i])) {
					return new int[] {hmap.get(target-arr[i]),i};
				}else {
					hmap.put(arr[i], i);
				}
			}
		 return new int[]{0,0};
		}
	

}
