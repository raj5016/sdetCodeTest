package com.solveprogram;

import org.junit.Test;
import org.testng.Assert;

public class MaximumLengthOfsequeceIndex {
	
	/**
	 * 
	 * @param arr
	 * @return
	 * Given a binary array, find the index of 0 to be replaced with 1 to get a maximum length
	 *  sequence of continuous ones.
		For example, consider array { 0, 0, 1, 0, 1, 1, 1, 0, 1, 1 }. 
		The index to be replaced is 7 to get a continuous sequence of length 6 containing all 1’s.
		
		
		Iterate through the array:
			If the current element is 1, increment the count.
			If the current element is 0, reset count to 1 + number of ones to the left of current 0
						and update `prev_zero_index` to the current index
			If the current count exceeds maxCount, update maxCount and maxIndex.
	 */
	@Test
	public void test() {
		int index=findMaxIndexOfConsequetiveSeqOf1(new int[] { 0, 0, 1, 0, 1, 1, 1, 0, 1, 1});
		Assert.assertEquals(7, index);
	}
	
	public int findMaxIndexOfConsequetiveSeqOf1(int[] arr) {
		
		 	int maxCount = 0; // Maximum count of 1s
	        int maxIndex = -1; // Index of 0 to be replaced
	        int prevZero = -1; // Index of previous zero
	        int count = 0; // Count of 1s after replacing 0

	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == 1) {
	                count++;
	            } else {// arr[i] == 0
	                count = i - prevZero;
	                prevZero = i;
	            }

	            if (count > maxCount) {
	                maxCount = count;
	                maxIndex = prevZero;
	            }
	        }

	        return maxIndex;
	    }
	}
