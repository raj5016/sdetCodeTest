package com.babuSirSession.twoPointer;

import org.junit.Test;

public class LeetCode_LongestContinuousIncreasingSubsequence {
	
	
	/**
	  //https://leetcode.com/problems/longest-continuous-increasing-subsequence/description/
	 Initialise the pointers
    left = 0, right = 0, max_length = 1, current_length = 1

    Iterate through the array
        >> If the next element is greater than the current element
            > Increase the current length
            > Move the right pointer forward
            > Update max_length if current_length is greater
        else:
            > If the sequence is not increasing, reset the current length
            > Move both pointers forward
    return max_length
	 */
	
	@Test
	public void testLongestSubSequence() {
		System.out.println(findLongestOfLengthOfSubSequnceBabu(new int[] {1,3,5,4,7}));
	}
	
	 public int findLongestOfLengthOfSubSequnce(int[] nums) {
	        int max=Integer.MIN_VALUE,counter=1,left=0,right=1;
	        
	        while(right<nums.length) {
				if(nums[left]<nums[right]) {
					counter++;
					left++;
					right++;
			}else {
				left=right;  // if element is not growing , then move left to right position
				right++;
				counter=1;
			}
	        max=Math.max(max, counter);
	        } 
	    return max;
	}
	 
	 
	 public int findLongestOfLengthOfSubSequnceBabu(int[] nums) {
		 int max=1,counter=1,left=0,right=0;
		 
		 while(right<nums.length-1) {
			 if(nums[right+1]>nums[right]) {
				 counter++;
				 right++;
				 max=Math.max(max, counter);
			 }else {
				 left=right;
				 right++;
				 counter=1;
			 }
	        } 
	    return max;
		 }
}
