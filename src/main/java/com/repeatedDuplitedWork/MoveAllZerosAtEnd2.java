package com.repeatedDuplitedWork;

public class MoveAllZerosAtEnd2 {
	/*
	Pseudo code:
		
			Input: nums = [0,1,0,3,12]
			Output: [1,3,12,0,0]

	 */
	
	public int[] moveAllzero(int[] nums) {
		
		if(nums.length==0 || nums.length==1) {
			return nums;
		}
		
		
		int nz=0;
		int z=0;
		
		 while(nz<nums.length) {
			 if(nums[nz]!=0) {
				 int temp=nums[nz];
				 nums[nz]=nums[z];
				 nums[z]=temp;
				 nz++;
				 z++;
			 }else {
				 nz++;
			 }
		 }
		
		
		return nums;
		
	}
}
