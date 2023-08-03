package com.week1HomeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class RemoveTargetElementInArray {
	
	/*
	 * 
	 * 
	 * Remove the target element in the array
							
	example 1: input = [2, 3, 3, 4, 5], target=3
			   output = [2, 4, 5]
			   explanation: when 3 is removed from input array, 
							output is [2, 4, 5]
	
	example 2: input = [2, 2], target=2
			   output = []
			   explanation: when 2 is removed, output would be empty array/
			   
		Pseudocode:
			 
			 1.Input is array
			 2.Output should be array with removed element
			 3.Initialize  Array List 
			 4.Iterate the loop 
			 5.Have a condition arr[i] not equal to target element, if so add the element
			 6.Return the list

      */
	@Test
	public void test1() {
		System.out.println(removeTargetElement(new int[] {2, 3, 3, 4, 5}, 5));
		Assert.assertEquals(Arrays.asList(2,3,3,4), removeTargetElement(new int[] {2, 3, 3, 4, 5}, 5));
	}
	
	@Test
	public void test2() {
		System.out.println(removeTargetElement(new int[] {2, 2}, 2));
		Assert.assertEquals(Arrays.asList(), removeTargetElement(new int[] {2, 2}, 2));
	}
	
	public List<Integer> removeTargetElement(int[] arr, int target){
		List<Integer> list=new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++){
            if(arr[i]!=target){
            	list.add(arr[i]);
            }
        }

		return list;
	}
}
