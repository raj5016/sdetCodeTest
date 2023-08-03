package com.week1HomeWork;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.junit.Test;

import junit.framework.Assert;

public class SingleNumberLeetCode136 {

	/*
	 * Given a non-empty array of integers nums, every element appears twice except
	 * for one. Find that single one.
	 * 
	 * You must implement a solution with a linear runtime complexity and use only
	 * constant extra space.
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [2,2,1] Output: 1  1 2 2 
	 * 
	 * Example 2:

		Input: nums = [4,1,2,1,2] 1 1 2 2 4
		Output: 4
	 */
	
	/* PseudoCode 
	 * Input is Non Empty array
	 * Output should be non repeated number
	 * 
	 * Create a Hash map 
	 * Add one variable as output as 0 as value
	 * Iterate the loop until the array length
	 * Add If condition , to check hashmap as arr[i], if so get the count and add 1 with that and update the key value
	 * Else update the key value as 1
	 * Iterate map values using entry set and check the which key as value =1
	 * If value is 1, then get that key and assign to output.
	 * */
	 
	@Test
	public void test() {
		Assert.assertEquals(1, singelOneNonRepeated(new int[] {2,2,1}));
	}
	
	@Test
	public void test1() {
		Assert.assertEquals(4, singelOneNonRepeated(new int[] {4,1,2,1,2}));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(1, singelOneNonRepeated(new int[] {1}));
	}
	
	@Test
	public void test3() {
		System.out.println(singelOneNonRepeated(new int[] {1,2,1,3,4,2,3,4,6,5,5}));
		Assert.assertEquals(6, singelOneNonRepeated(new int[] {1,2,1,3,4,2,3,4,6,5,5}));
	}
	
	
	
	public int singelOneNonRepeated(int[] arr) {
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		int output=0;
		
		for (int i = 0; i < arr.length ; i++) {

			if (hmap.containsKey(arr[i])) {
				hmap.put(arr[i], hmap.get(arr[i]) + 1);
			} else {
				hmap.put(arr[i], 1);
			}
		}
		for (Map.Entry<Integer,Integer> entry : hmap.entrySet()) {
			if (entry.getValue()==1) {
				output=entry.getKey();
			}
		}
		return output;
	}
	 
	
	// 2 method
	
	public int singleNumber(int[] nums) {
        int i=0,j=0;
        Arrays.sort(nums);
        for(i=0;i<nums.length-1;i++)
        {
            for(j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    i++;
                    break;
                }
                if(j==nums.length-1)
                    return nums[i];
            }
        }
        return nums[nums.length-1];
    }

//3 rd Method

public int singleNumber1(int[] nums) {
    Arrays.sort(nums);
    if(nums.length==1){
        return nums[0];
    }
    for(int i=0;i<nums.length-1;i+=2){
        if(nums[i]!=nums[i+1]){
            return nums[i];
        }
    }
   return nums[nums.length-1];
}

}
	
		
	
	
