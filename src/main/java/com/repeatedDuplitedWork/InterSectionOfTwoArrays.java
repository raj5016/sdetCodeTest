package com.repeatedDuplitedWork;

import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;

public class InterSectionOfTwoArrays {
	

	@Test
	public void test() {
		Assert.assertArrayEquals(new int[] {2}, returnArraysOfInterSection(new int[] {1,2,2,1}, new int[] {2,2}));
	}
	
	public int[] returnArraysOfInterSection(int[] arr1,int[] arr2) {
		HashSet<Integer> hset1=new HashSet<Integer>();
		HashSet<Integer>  hset2=new HashSet<Integer>();
		
		for (int i = 0; i < arr1.length; i++) {
			hset1.add(arr1[i]);
		}
		
		for (int i = 0; i < arr2.length; i++) {
			if(hset1.contains(arr2[i])) {
				hset2.add(arr2[i]);
			}
		}
		
		int[] arr=new int[hset2.size()];
		
		int m=0;
		
		for (int i : hset2) {
			      arr[m] =i;
			      m++;
		}
		
		return arr;
		
	}

}
