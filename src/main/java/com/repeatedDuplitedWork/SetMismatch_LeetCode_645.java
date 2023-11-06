package com.repeatedDuplitedWork;

import org.junit.Assert;
import org.junit.Test;

public class SetMismatch_LeetCode_645 {
	
	@Test
	public void test() {
		Assert.assertEquals(new int[] {2,3},returnSetOfMismatch(new int[] {1,2,2,4}));
	}
	
	
	
	public int[] returnSetOfMismatch(int[] nums) {  //1 ,2,2,4
		int[] arr=new int[2];
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]!=i+1) {
				arr[0]=nums[i];
				arr[1]=i+1;
			}
		}
		return arr;
		
	}

}
