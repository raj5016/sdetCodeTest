package com.repeatedDuplitedWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class RemoveTargetElementInAnArray2 {

	/*
	 * Remove the target element in the array
							
	example 1: input = [2, 3, 3, 4, 5], target=3
			   output = [2, 4, 5]
			   explanation: when 3 is removed from input array, 
							output is [2, 4, 5]
	
	example 2: input = [2, 2], target=2
			   output = []
			   explanation: when 2 is removed, output would be empty array/	 
	 */
	@Test
	public void test1() {
		System.out.println(removeTargetElementInArray(new int[] {2, 3, 3, 4, 5}, 5));
		Assert.assertEquals(Arrays.asList(2,3,3,4), removeTargetElementInArray(new int[] {2, 3, 3, 4, 5}, 5));
	}
	
	@Test
	public void test2() {
		System.out.println(removeTargetElementInArray(new int[] {2, 2}, 2));
		Assert.assertEquals(Arrays.asList(), removeTargetElementInArray(new int[] {2, 2}, 2));
	}
	
	public List<Integer> removeTargetElementInArray(int[] arr,int target) {
		List<Integer> list=new ArrayList<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=target) {
				list.add(arr[i]);
			}
		}
	
		return list;
	}
	
}
