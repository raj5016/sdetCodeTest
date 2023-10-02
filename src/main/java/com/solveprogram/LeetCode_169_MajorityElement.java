package com.solveprogram;

import org.junit.Test;

import junit.framework.Assert;

public class LeetCode_169_MajorityElement {
	
	
	
	
	/*
	 * Pseudocode
	 * 
	 * 1.Intialize a variable count and result as 0
	 * 2.Iterate over loop and check count is equal to 0
	   3.If count is 0, then assign arr[i] value to max element
	   4.Add if else and Check arr[i] value is not equal to result, if so decrement the count or else incremnet the count
	   5.last return the result
	 * 
	 */	
	@Test
	public void test1(){
		 int arr[] = { 1, 1, 2, 1, 3, 5, 1 };
		Assert.assertEquals(1, majorityElement(arr));
	}
	
	public int majorityElement(int[] nums) {
		 int count = 0;
	        int res = 0;
	        
	        for (int num : nums) {
	            if (count == 0) {
	            	res = num;
	            }
	            
	            if (num !=res) {
	                count--;
	            } else {
	                count++;
	            }
	        }
	        
	        return res;
	    }

}
