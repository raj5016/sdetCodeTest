package com.week1HomeWork;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;


public class ContainsDuplicateLeetCode217 {
	
	
	/*Given an integer array nums, return true if any value appears at
		least twice in the array, and return false if every element is distinct.
		
		https://leetcode.com/problems/contains-duplicate/description/
	 	Input: nums = [1,2,3,1] Output: true
	 */
	
	/* Pseuocode 
	 * 
	 * 1. Input is int[] arr={1,2,3,4,1}
	 * 2.Output should be boolean
	 * 3.First sort the arrays
	 * 4.Traverse through the loop until the length of array
	 * 5.Traverse through second loop with j=i+1 until the length of array
	 * 6.Compare arr[i]  with arr[j] , and if it same return the boolean as true and break the loop
	 * 
	 * */
	@Test
	public void test1() {
		Assert.assertEquals(true, findDupliate(new int[] {1,2,3,1}));
		Assert.assertEquals(true, containsDuplicate(new int[] {1,2,3,4,1,1}));

	}
	
	@Test
	public void test2() {
		//Assert.assertEquals(false, findDupliate(new int[] {1,2,3,4}));
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(true, findDupliate(new int[] {1,1,1,3,3,4,3,2,4,2}));
	}
	
	
	public boolean findDupliate(int[] arr) {

		Arrays.sort(arr);

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				return true;
			}
		}
		return false;

	}
	
	//Using HashMap
	
	public boolean containsDuplicate(int[] arr) {
		//Arrays.sort(arr);

		HashMap<Integer,Integer> hashmap=new HashMap<Integer,Integer>();
			
		for(int i=0;i<arr.length-1;i++) {
			if(hashmap.containsKey(arr[i])) {
				return true;
			}
			hashmap.put(arr[i],1);
		}
		return false;
	}
	
	//Using HashSet
	
    public boolean containsDuplicateUsingHashSet(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
                if (set.contains(nums[i])) {
                    return true;
                }
                set.add(nums[i]);
        }
        return false;
    }
}


