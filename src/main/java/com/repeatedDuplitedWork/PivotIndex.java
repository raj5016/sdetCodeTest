package com.repeatedDuplitedWork;

import org.junit.Assert;
import org.junit.Test;

public class PivotIndex {
	
	//https://leetcode.com/problems/find-pivot-index/description/
	/*	total=total+arr[i]
	 * rightsum=total-leftsum-arr[i]
	 * if(Leftsum==rightsum) -return i
	 * Leftsum=Leftsum+arr[i]
	 */
	
	@Test
	public void test() {
		System.out.println(returnIndexOfLeftSumEqualToRightSum(new int[] {1,7,3,6,5,6}));
		Assert.assertEquals(3, returnIndexOfLeftSumEqualToRightSum(new int[] {1,7,3,6,5,6}));
	}
	
	@Test
	public void test1() {
		System.out.println(returnIndexOfLeftSumEqualToRightSum(new int[] {1,2,3}));
		Assert.assertEquals(-1, returnIndexOfLeftSumEqualToRightSum(new int[] {1,2,3}));
	}
	
	@Test
	public void test2() {
		System.out.println(returnIndexOfLeftSumEqualToRightSum(new int[] {2,1,-1}));
		Assert.assertEquals(0, returnIndexOfLeftSumEqualToRightSum(new int[] {2,1,-1}));
	}
	
	
	public int returnIndexOfLeftSumEqualToRightSum(int arr[]) {
		
		int leftsum=0;
		int rightsum=0;
		int tota1=0;
		
		for (int i = 0; i < arr.length; i++) {
			tota1=tota1+arr[i];
		}
		
		for (int i = 0; i < arr.length; i++) {
			rightsum=tota1-leftsum-arr[i];
			if(leftsum==rightsum) {
				leftsum=leftsum+arr[i];
			}
		}
		
		return -1;
		
	}

}
