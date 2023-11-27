package com.repeatedDuplitedWork;

import org.junit.Assert;
import org.junit.Test;

public class LeeTcode_MoveAllZerosToEnd {
	
	@Test
	public void data1() {
		Assert.assertArrayEquals(new int[] {1,3,12,0,0}, returnArrayAfterMovingAllZerosToEnd(new int[] {0,1,0,3,12}));
	}
	
	/*
	 * Logic:
	 * 
	 * 1.Define two variable 
	 * 2.Have a break condition
	 * 		a.Check for condition first(i) and second element(j)
	 */
	
	//[0,1,0,3,12]
	public int[] returnArrayAfterMovingAllZerosToEnd(int[] nums) {
		int i=0;
		int j=1;
		
		while(j<nums.length) {
			if(nums[i]==0 && nums[j]!=0) {
				int temp=nums[i];
				nums[i]=nums[j];
				nums[j]=temp;
				i++;
				j++;
			}else if(nums[i]!=0 && nums[j]==0) {
				i++;
			}else if(nums[i]==0 && nums[j]==0) {
				j++;
			}else if(nums[i]!=0 && nums[j]!=0) {
				i++;
				j--;
			}
		}
		return nums;
	}

}
