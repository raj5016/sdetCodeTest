package com.repeatedDuplitedWork;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_1446_ConsecutiveCharacters_DynamicWindow {
	
	
	
	@Test
	public void test() {
		Assert.assertEquals(2, maxPower("ccbccbb"));
		Assert.assertEquals(2, maxPower("leetcode"));
		Assert.assertEquals(5, maxPower("abbcccddddeeeeedcba"));
	}
	
	public int maxPower(String s) {
		int left=0,right=0,distance=0,n=s.length();
		
		while(right<n) {
			if(s.charAt(left)==s.charAt(right)) {
				right++;
			}else {
				if(right==n) {
					break;
				}
				distance=Math.max(distance, right-left);	
				left=right;
			}
			distance=Math.max(distance, right-left);	
		}
		return distance;
		
	}
	

}
