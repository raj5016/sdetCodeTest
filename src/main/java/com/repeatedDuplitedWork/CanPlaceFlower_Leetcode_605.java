package com.repeatedDuplitedWork;

import org.junit.Test;
import org.testng.Assert;

public class CanPlaceFlower_Leetcode_605 {
	
	@Test
	public void test() {
		Assert.assertEquals(true, flowerbedSolution(new int [] {1,0,0,0,1}, 1));
	}
	
	public boolean flowerbedSolution(int[] flowerbed,int n) {
		int count=0;
		
		for (int i = 0; i < flowerbed.length; i++) {
			if(flowerbed[i]==0) {
				int prev=(i==0 || flowerbed[i-1]==0?0:1);
				int next=(i==flowerbed.length-1 || flowerbed[i+1]==0?0:1);
				if(prev==next) {
					count++;
					flowerbed[i]=1;
				}
			}
		}
		if(count>n) {
			return true;
		}
		
	return false;	
}
}
