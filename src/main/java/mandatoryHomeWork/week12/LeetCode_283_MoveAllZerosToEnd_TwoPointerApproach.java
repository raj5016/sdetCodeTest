package mandatoryHomeWork.week12;

import org.junit.Assert;
import org.junit.Test;

public class LeetCode_283_MoveAllZerosToEnd_TwoPointerApproach {
	//https://leetcode.com/problems/move-zeroes/description/
	
	/*
	 * 	Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

		Note that you must do this in-place without making a copy of the array.
		
		Input: nums = [0,1,0,3,12]
		Output: [1,3,12,0,0]
	 */
	
	//Two Pointer Approach
	
	@Test
	public void test() {
		Assert.assertArrayEquals(new int[] {1,3,12,0,0}, returnAllZerosAtend(new int[] {0,1,0,3,12}));
		Assert.assertArrayEquals(new int[] {3,12,0,0,0}, returnAllZerosAtend(new int[] {0,0,0,3,12}));
		Assert.assertArrayEquals(new int[] {1,3,12,0,0}, returnAllZerosAtend(new int[] {0,0,1,3,12}));
		Assert.assertArrayEquals(new int[] {1,1,0}, returnAllZerosAtend(new int[] {1,0,1}));
		Assert.assertArrayEquals(new int[] {1,0}, returnAllZerosAtend(new int[] {1,0}));
		Assert.assertArrayEquals(new int[] {4,2,4,1,0,0}, returnAllZerosAtend(new int[] {4,2,4,0,0,1}));
	}
	
	
	public int[] returnAllZerosAtend(int[] arr) {
		int i=0,j=1;
		
		while(j<arr.length) {
			if(arr[i]==0 && arr[j]!=0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j++;
			}else if(arr[i]!=0 && arr[j]==0) {
				i++;
			}else if(arr[i]==0 && arr[j]==0) {
				j++;
			}else if(arr[i]!=0 && arr[j]!=0) {
				i++;
				j++;
			}
		}
		return arr;
	}
	
	
	
}
