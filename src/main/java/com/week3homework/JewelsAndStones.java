package com.week3homework;

import org.junit.Assert;
import org.junit.Test;

public class JewelsAndStones {
	
	//https://leetcode.com/problems/jewels-and-stones/description/
	
	/*
	 * You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

		Letters are case sensitive, so "a" is considered a different type of stone from "A".
		
		 
		
		Example 1:
		
		Input: jewels = "aA", stones = "aAAbbbb"
		Output: 3
		Example 2:
		
		Input: jewels = "z", stones = "ZZ"
		Output: 0
	 * 
	 * 
	 */
	
	@Test
	public void test() {
		Assert.assertEquals(3, countJewels("aA", "aAAbbbb"));
		Assert.assertEquals(3, numJewelsInStones("aA", "aAAbbbb"));
	}
	
	
	//1st Method
	public int countJewels(String jewels,String stones) {
		int count=0;
		for(int i=0;i<stones.length();i++) {
			char c=stones.charAt(i);
			if(jewels.contains(String.valueOf(c))) {
				count++;
			}
		}
		return count;
	}
	
	//2nd Method
	public int numJewelsInStones(String jewels,String stones) {
		int count=0;
		for(int i=0;i<stones.length();i++) {
			for (int j = 0; j < jewels.length(); j++) {
				if(jewels.charAt(j)==stones.charAt(i)) {
					count++;
			}
		}
	}
		return count;
	}
}