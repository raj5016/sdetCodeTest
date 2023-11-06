package com.repeatedDuplitedWork;

import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;

public class LeetCode_645_SetMismatch {
	
	/*https://leetcode.com/problems/set-mismatch/description/
	 * You have a set of integers s, which originally contains all the numbers from 1 to n. 
	 * Unfortunately, due to some error, one of the numbers in s got duplicated to another number 
	 * in the set, which results in repetition of one number and loss of another number.

		You are given an integer array nums representing the data status of this set after the error.
		
		Find the number that occurs twice and the number that is missing and return them in the
		 form of an array.
		
		Example 1:
		
		Input: nums = [1,2,2,4]
		Output: [2,3]
		Example 2:
		
		Input: nums = [1,1]
		Output: [1,2]
 
	 *  Logic:
	 *  
	 *  Declare a two varaiable to hold duplicate and missing element
	 *  Create a hashset for adding given element in array
	 *  Iterate with loop to addthe element into set, if we found any duplicate add it to dupliacte
	 *  Next Iterate with another loop and validate set contains the element,if not add it to missing element
	 *  
	 * 
	 */
	
	
	@Test
	public void test() {
		Assert.assertArrayEquals(new int[] {2,3}, returnDuplicateAndMissingNumber(new int[] {1,2,2,4}));
	}
	
	public int[] returnDuplicateAndMissingNumber(int[]  arr) {
			int dup=0,miss=0;
			
			HashSet<Integer> set=new HashSet<Integer>();
			
			
			//finding the duplicate element in given array
			for (int i = 0; i < arr.length; i++) {
				if(set.contains(arr[i])) {
					dup=arr[i];
				}
				set.add(arr[i]);
			}
			
			//finding the missing element
			
			for (int i = 1; i <=arr.length; i++) {
				if(set.contains(i)==false) {
					miss=i;
					break;
				}
			}
		return new int[] {dup,miss};
	}
}
