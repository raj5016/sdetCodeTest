package com.week1HomeWork;

import java.util.Arrays;

import org.junit.Test;

public class LeetCode_283_MoveAllZerosToEnd {

	/*	https://leetcode.com/problems/move-zeroes/description/
		 Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
		
		Note that you must do this in-place without making a copy of the array.
		
		Example 1:
		
		Input: nums = [0,1,0,3,12]
		Output: [1,3,12,0,0]
		Example 2:
		
		Input: nums = [0]
		Output: [0]
		
		Pseudo code:
		Keep two pointer start and end at index 0 and 1 and follow three steps:
			-> If element at start is 0 and end is non zero then swap them and move both pointers.
			-> If element at both start and end is zero then move end pointer.
			-> If both are non zeros then just move both pointers ahead till end reaches array length.
	 */
	
	@Test
	public void test1() {
		System.out.println(Arrays.toString(moveZeroToEnd(new int[] {0,1,0,3,12})));
		moveZeroToEnd(new int[] {0,1,0,3,12});
		
		System.out.println(Arrays.toString(moveZeroToEndTapAcademy(new int[] {0,10,22,8,0,5,0})));
		moveZeroToEndTapAcademy(new int[] {0,10,22,8,0,5,0});

	}
	
	 public int[] moveZeroToEnd(int[] arr) {
		    int n = arr.length;
		    if(n<=1) {
		    	return arr;
		    }
		    int s=0;
		    int e=1;
		    while(e<n){
		        if(arr[s]==0 && arr[e]!=0){
		            int temp = arr[s];
		            arr[s] = arr[e];
		            arr[e] = temp;
		            s++;
		            e++;
		        }else if(arr[s]==0 && arr[e]==0){
		            e++;
		        }else{
		            s++;
		            e++;
		        }
		    }
			return arr;
		    }
	 
	 public int[] moveZeroToEndTapAcademy(int[] nums) {
		 //https://www.youtube.com/watch?v=V0vmGwinHrg
		 // nz
		 //{0,10,22,8,0,5,0})
		 			int size=nums.length;
		 			if(size==0 || size==1) {
		 				return nums;
		 			}
		 			
		 			int nz=0;
		 			int z=0;
		 			while(nz<size) {
		 				if(nums[nz]!=0) {
		 					int temp=nums[nz];
		 					nums[nz]=nums[z];
		 					nums[z]=temp;
		 					nz++;
		 					z++;
		 				}else {
		 					nz++;
		 				}
	 }
		 			return nums;
	 }
		
}
