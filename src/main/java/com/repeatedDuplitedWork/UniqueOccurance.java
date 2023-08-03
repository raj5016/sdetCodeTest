package com.repeatedDuplitedWork;

import java.util.HashMap;
import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;

public class UniqueOccurance {
	
	//https://leetcode.com/problems/unique-number-of-occurrences/description/
	
	@Test
	public void test1() {
		System.out.println(haveUniqueOccurance(new int[] {1,2,2,1,1,3}));
		Assert.assertEquals(true,haveUniqueOccurance(new int[] {1,2,2,1,1,3}));
	}
	
	@Test
	public void test2() {
		System.out.println(haveUniqueOccurance(new int[] {1,2}));
		Assert.assertEquals(false,haveUniqueOccurance(new int[] {1,2}));
	}
	
	@Test
	public void test3() {
		System.out.println(haveUniqueOccurance(new int[] {-3,0,1,-3,1,1,1,-3,10,0}));
		Assert.assertEquals(true,haveUniqueOccurance(new int[] {-3,0,1,-3,1,1,1,-3,10,0}));
	}
	

	public boolean haveUniqueOccurance(int [] arr) {
		HashMap<Integer, Integer>  hmap=new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if(hmap.containsKey(arr[i])) {
				hmap.put(arr[i], hmap.get(arr[i])+1);
			}else {
				hmap.put(arr[i], 1);
			}
		}
		
		HashSet<Integer> hset=new HashSet<Integer>(hmap.values());
		if(hmap.size()==hset.size()) {
			return true;
		}
		return false;
		
	}
}
