package com.solveprogram;

import java.util.HashMap;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_1512_NumberOfGoodPairs {
	
	@Test
	public void test() {
		Assert.assertEquals(4, numIdenticalPairsByHashMap(new int[] {1,2,3,1,1,3}));
	}
	
	public int numIdenticalPairs(int[] nums) {
		int count=0;
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if(nums[i] == nums[j] && i<j) {
					count++;
				}
			}
		}
		return count;
    }

	
	   public int numIdenticalPairsByHashMap(int[] nums) {
	        int count=0;
	        HashMap<Integer,Integer> hmap=new HashMap<>();
	        for (int num : nums) {
				int currentCount=hmap.getOrDefault(num, 0);
				count+=currentCount;
				hmap.put(num, currentCount+1);
			}
	        return count;
	    }
	
}
