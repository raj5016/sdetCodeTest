package com.repeatedDuplitedWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class LeetCode_448_FindMissingNumberInAnArray {
	
	
	@Test
	public void test() {
		//Assert.assertEquals(Arrays.asList(5,6), findDisappearedNumbers(new int[] {4,3,2,7,8,2,3,1}));
		//Assert.assertEquals(Arrays.asList(5,6), bySet_findDisappearedNumbers(new int[] {4,3,2,7,8,2,3,1}));
		Assert.assertEquals(Arrays.asList(5,6), findDisappearedNumbers_byHmap(new int[] {4,3,2,7,8,2,3,1}));

	}
	
	
	
	  public List<Integer> bySet_findDisappearedNumbers(int[] nums) {
		  Set<Integer>  hset=new HashSet<Integer>();
		  List<Integer>  list=new ArrayList<Integer>();
		  
		  
		  for (int num : nums) {
			  hset.add(num);
		  }
		  
		  for (int i = 1; i <= nums.length; i++) {
			if(!hset.contains(i)) {
				list.add(i);
			}
		}
		return list;
	  }
	  
	  public List<Integer> findDisappearedNumbers(int[] nums) {
		  int[]  a=new int[nums.length+1];
		  List<Integer> list=new ArrayList<Integer>();
		  
		  for (int i = 0; i < nums.length; i++) {
			  a[nums[i]]++;
		  }
		  
		  for (int i = 1; i < nums.length+1; i++) {
			 if(a[i]==0) {
				 list.add(i);
			}
	  }
		return list;
	  }
	
	  
	  public List<Integer> findDisappearedNumbers_byHmap(int[] nums) {
		  Map<Integer,Integer>  hmap=new HashMap<Integer,Integer>();
		  List<Integer>  list=new ArrayList<Integer>();
		  
		  for (int num : nums) {
			hmap.put(num,hmap.getOrDefault(num, 0)+1);
		  }
		  
		  for (int i = 1; i < nums.length+1; i++) {
			if(!hmap.containsKey(i)) {
				list.add(i);
			}
		}
		 return list;
		  
	  }
}
