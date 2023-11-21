package com.solveprogram;

import org.junit.Assert;
import org.junit.Test;

public class LeetCode_75_SortColors {
	
	@Test
	public void test() {
		Assert.assertArrayEquals(new int[] {0,0,1,1,2,2}, sortColors(new int[] {2,0,2,1,1,0}));
	}
	
	public int[] sortColors(int[] nums) {
	    // 2-pass
	    int count0 = 0, count1 = 0, count2 = 0;
	    for (int i = 0; i < nums.length; i++) {
	        if (nums[i] == 0) {count0++;}
	        if (nums[i] == 1) {count1++;}
	        if (nums[i] == 2) {count2++;}
	    }
	    for(int i = 0; i < nums.length; i++) {
	        if (i < count0) {nums[i] = 0;}
	        else if (i < count0 + count1) {nums[i] = 1;}
	        else {nums[i] = 2;}
	    }
		return nums;
	}
	
	

	
}
