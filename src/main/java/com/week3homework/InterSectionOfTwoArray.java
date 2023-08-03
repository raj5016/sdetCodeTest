package com.week3homework;

import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;

public class InterSectionOfTwoArray {
	
	
	//https://leetcode.com/problems/intersection-of-two-arrays/description/
	
	@Test
	public void test() {
		Assert.assertArrayEquals(new int[] {2}, intersection(new int[] {1,2,2,1}, new int[] {2,2}));
	}
	
	
    public int[] intersection(int[] nums1, int[] nums2) {
    	HashSet<Integer>  set1=new HashSet<Integer>();
    	HashSet<Integer>  set2=new HashSet<Integer>();
    	
    	for (int i = 0; i < nums1.length; i++) {
			set1.add(nums1[i]);
		}
    	
    	
    	for (int i = 0; i < nums2.length; i++) {
			if(set1.contains(nums2[i])) {
				set2.add(nums2[i]);
			}
		}
    	
    	int[] arr=new int[set2.size()];
    	
    	int k=0;
    	
    	for (int i : set2) {
					arr[k]=i;
					k++;
		}
    	
    	
		return arr;
    	
    }
    

}
