package com.week3homework;

import java.util.HashMap;
import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;

public class UniqueNumberofOccurrences {
	
	/*
	 * Given an array of integers arr, return true if the number of occurrences of each value
	 * 					 in the array is unique or false otherwise.

		Example 1:
		
		Input: arr = [1,2,2,1,1,3]
		Output: true
		Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. 
									No two values have the same number of occurrences.
		Example 2:
		
		Input: arr = [1,2]
		Output: false
		Example 3:
		
		Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
		Output: true
	 */
	
	@Test
	public void test1() {
		System.out.println(isUniqueInArray(new int[] {1,2,2,1,1,3}));
		Assert.assertEquals(true,isUniqueInArray(new int[] {1,2,2,1,1,3}));
	}
	
	@Test
	public void test2() {
		System.out.println(isUniqueInArray(new int[] {1,2}));
		Assert.assertEquals(false,isUniqueInArray(new int[] {1,2}));
	}
	
	@Test
	public void test3() {
		System.out.println(isUniqueInArray(new int[] {-3,0,1,-3,1,1,1,-3,10,0}));
		Assert.assertEquals(true,isUniqueInArray(new int[] {-3,0,1,-3,1,1,1,-3,10,0}));
	}
	
	@Test
	public void test4() {
		System.out.println(isUniqueInArray(new int[] {1,2,2,1,3,3}));
	}
	
	public boolean isUniqueInArray(int[] arr) {
		HashMap<Integer,Integer> hmap=new HashMap<Integer,Integer>();
		
		for (int i : arr) {
			if(hmap.containsKey(i)) {
				hmap.put(i, hmap.get(i)+1);
			}else {
				hmap.put(i, 1);
			}
		}
		HashSet<Integer> hset=new HashSet<Integer>(hmap.values());
		int n=hmap.size();
		int m=hset.size();
		if(n==m) {
			return true;
		}
		return false;
		
	}

}
