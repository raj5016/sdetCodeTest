package com.week2.homework;

import java.util.HashMap;
import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;

public class DistributeCandiesLeetCode575 {
	
	//https://leetcode.com/problems/distribute-candies/description/
	
	//int[] candies= {1,1,2,2,3,3};
	
	/*
			 * Alice has n candies, where the ith candy is of type candyType[i]. Alice noticed that she started to gain weight, so she visited a doctor.
		
		The doctor advised Alice to only eat n / 2 of the candies she has (n is always even). Alice likes her candies very much, and she wants to eat the maximum number of different types of candies while still following the doctor's advice.
		
		Given the integer array candyType of length n, return the maximum number of different types of candies she can eat if she only eats n / 2 of them.
		
		 
		
		Example 1:
		
		Input: candyType = [1,1,2,2,3,3]
		Output: 3
		Explanation: Alice can only eat 6 / 2 = 3 candies. Since there are only 3 types, she can eat one of each type.
			 */
	
	@Test
	public void test1() {
		System.out.println(maxOfFifferentTypesCandiesAteBuyAllice(new int [] {1,1,2,2,3,3}));
		Assert.assertEquals(3, maxOfFifferentTypesCandiesAteBuyAllice(new int [] {1,1,2,2,3,3}));
		Assert.assertEquals(3, maxOfFifferentTypesCandiesAteBuyAlliceByHashmap(new int [] {1,1,2,2,3,3}));
	}
	
	@Test
	public void test2() {
		System.out.println(maxOfFifferentTypesCandiesAteBuyAllice(new int [] {1,1,2,3}));
		Assert.assertEquals(2, maxOfFifferentTypesCandiesAteBuyAllice(new int [] {1,1,2,3}));
		Assert.assertEquals(2, maxOfFifferentTypesCandiesAteBuyAlliceByHashmap(new int [] {1,1,2,3}));
	}
	
	@Test
	public void test3() {
		System.out.println(maxOfFifferentTypesCandiesAteBuyAllice(new int [] {6,6,6,6}));
		Assert.assertEquals(1, maxOfFifferentTypesCandiesAteBuyAllice(new int [] {6,6,6,6}));
		Assert.assertEquals(1, maxOfFifferentTypesCandiesAteBuyAlliceByHashmap(new int [] {6,6,6,6}));
	}
	
	public int maxOfFifferentTypesCandiesAteBuyAllice(int candies[]) {
			HashSet<Integer> set=new HashSet<Integer>();
			for (int i = 0; i < candies.length; i++) {
				set.add(candies[i]);
			}
			//new int [] {6,6,6,6}
			//Math.min (int a, int b) //Math.min(1,4/2)
			return Math.min(set.size(), candies.length/2);

	}
	
	public int maxOfFifferentTypesCandiesAteBuyAlliceByHashmap(int candies[]) {
		HashMap<Integer,Integer> hmap=new HashMap<Integer,Integer>();
		for (int i = 0; i < candies.length; i++) {
			
			if(hmap.containsKey(candies[i])) {
				hmap.put(candies[i], hmap.get(candies[i])+1);
			}else {
				hmap.put(candies[i], 1);
			}
		}
		//for 6,6,6,6 ---now in hashmap 1 key is present, candies.length/2 =2  ,,,,,1 >=2
		if(hmap.keySet().size()>=candies.length/2) {
			return candies.length/2;
		}else {
			return hmap.keySet().size();
		}
}

}
