package com.babuSirSession.slidingWindow;

import org.junit.Test;

public class LeetCode_560_SubarraySumEqualsK {
	
	//https://leetcode.com/problems/subarray-sum-equals-k/description/
	
	@Test
	public void testsubArraySumEqualK() {
		int output=returnSumArrayEqualToTargetK(new int[] {2,0,1,1},2);
		System.out.println(output);
	}
	
	@Test
	public void testsubArraySumEqualK1() {
		int output=returnSumArrayEqualToTargetK(new int[] {0, 4, -1, 3, 0},3);
		System.out.println(output);
	}

	private int returnSumArrayEqualToTargetK(int[] nums,int k) {
		int left=0,right=0,counter=0,sum=nums[left];
		
		while(left<nums.length && right<nums.length) {
			if(sum==k) {
				counter++;
				left++;
				right++;
			}else if(sum<k) {
				sum+=nums[right];
				right++;
			}else {
				left++;
			}
			
		}
		return counter;
	}

}
