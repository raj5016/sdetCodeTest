package com.repeatedDuplitedWork;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class CountRepeatedElementLeetCode1 {
	
	/*
	 * 
	 *  Given an integer array arr, count how many elements x there are, 
   such that x + 1 is also in arr. 
   If there are duplicates in arr, count them separately.
   
   example 1: input = [1, 2, 3]
			  output = 2
			explanation: when x is 1, we see x+1 (2) is present in input
						 when x is 2, we see x+1 (3) is present in input
						 when x is 3, we see x+1 (4) is not present in input
						so no of presence of x+1 is 2
   example 2: input = [1, 1, 3, 3, 5, 5, 7, 7]
			  output = 0
			  explanation: no occurence of x+1 for x
			  
   example 3: input = [1, 1, 2]
			  output = 2
			  explanation: when x is 1, we see x+1 (2) is present in input
						   when x is 1, we see x+1 (2) is present in input
						   when x is 2, we see x+1 (3) is not present in input
	 */
	
	
	 /*	Convert given array into arraylist
	  * Iterate with array loop
	  * intialize a variable to hold the sum of two number and intialize count of x+1
	  * And check that sum number is available in array
	  * If so increment the count, if sum of two number is not available return 0
	  * 
	  * 
	  */

	@Test
	public void test() {	
		Assert.assertEquals(0, countXPlus1Element(new int[] {1,1,3,3,5,5,7,7}));
	}
	
	@Test
	public void test1() {
		
		Assert.assertEquals(2, countXPlus1Element(new int[] {1, 1, 2}));
	}
	
	@Test
	public void test2() {
		
		Assert.assertEquals(2, countXPlus1Element(new int[] {1, 2, 3}));
	}
	
	
	public int countXPlus1Element(int[] arr) {
		
		int sum=0; int count=0;
		
		List<Integer> lis=new ArrayList<Integer>();
		
		for (Integer i : arr) {
			lis.add(i);
		}
		
		for (int i = 0; i < lis.size(); i++) {
			sum=lis.get(i)+1;
			if(lis.contains(sum)) {
				count++;
			}
		}
		return count;
	}
}
