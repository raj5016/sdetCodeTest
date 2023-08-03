package com.week1HomeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class CountRepeatedElementLeetCode {

	/*  Given an integer array arr, count how many elements x there are, 
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
	 * 
	 * 
	 * 
	 * 1.Convert array to arraylist(There is no shortcut for converting from 
	 * 								int[] to List<Integer> as Arrays.asList does not deal with boxing and will 
	 * 								just create a List<int[]> which is not what you want. 
	 * 								You have to make a utility method.
	 * 2.Iterate with one loop and until length of array
	 * 3.Intialize two variable count and temp
	 * 4.temp=arr[i]+1
	 * 5.Check temp is present inside the list
	 * 6.if Present increase the count
	 * 7.And loops breaks return the count
	 * */
	
	
	
	 
	
	@Test
	public void test() {
		
		System.out.println(countXPlus1Element(new int[] {1,1,3,3,5,5,7,7}));
	}
	
	@Test
	public void test1() {
		
		System.out.println(countXPlus1Element(new int[] {1,2,3}));
	}
	
	
	public int countXPlus1Element(int[] arr) {
		
		List<Integer> intList = new ArrayList<Integer>();
		for (int i : arr)
		{
		    intList.add(i);
		}	
		
		int count=0;
		int temp=0;
		
		for(int i=0;i<arr.length;i++) {
			temp=arr[i]+1;
			if(intList.contains(temp)) {
				count++;
			}
		}	
		
		return count;
		
	}
}
