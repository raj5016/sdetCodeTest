package com.babuSirSession.twoPointer;

import java.util.Arrays;

import org.junit.Test;

public class SortedSquareNum {
	
	
	/**
	 * Logic:
	 * 
	 * 1.Iterate with nums length and claculate square of each number and add it to output int arry
	 * 2.we have sort the output array (sort the square value in non decresing order)
	 * 3.return the squares output array
	 * 
	 */
	
	@Test
	public void testSortedSquareNum() {
		//int[] output=sortedSquareNum(new int[] {-4,-1,0,3,10});
		int[] output1=sortedSquareNumByTwoPointer(new int[] {-4,-1,0,3,10});
		//System.out.println(Arrays.toString(output));
		System.out.print(Arrays.toString(output1));
	}
	
	public static int[] sortedSquareNum(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			nums[i] = nums[i] * nums[i];
		}
		Arrays.sort(nums);
		return nums;
	}
	
	/**
	 * Logic:
	 * 
	 * 1.Define an array to hold output
	 * 2.Define left as 0,right as length of array
	 * 3.Iterate with loop with starting as length 
	 * 4.take both element square 
	 * 5.Compare if leftSquare is less than rightsquare, if so add the
	 * 		 rightSquare value to output arrays and decrement right
	 * 6.If rightsquare is greater, then add the
	 * 		 leftsquare value to output arrays and increment left
	 * 		
	 * 7.return output array.
	 */
	
	public static int[] sortedSquareNumByTwoPointer(int[] nums) {
		
		int n=nums.length;
		int[] output=new int[nums.length];
		int left=0,right=n-1;
		
		for (int i = nums.length-1; i >=0; i--) {
	
			int leftsquare=nums[left]*nums[left];
			int rightsquare=nums[right]*nums[right];
			
			if(Math.abs(leftsquare)<Math.abs(rightsquare)) {
				output[i]=rightsquare;
				right--;
			}else {
				output[i]=leftsquare;
				left++;
			}
		}
		return output;
	}
	
	

}
