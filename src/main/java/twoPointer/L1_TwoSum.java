package twoPointer;

import org.junit.Assert;
import org.junit.Test;

public class L1_TwoSum {
	
	/*Given an array of integer nums and an integer target, return indices of the two numbers 
	 * such that they add up to the target. You may assume that each input would have exactly 
	 * one solution, and you may not use the same element twice. You can return the answer in 
	 * any order. 
	 * Input: nums = [2,7,11,15], target = 9 
	 * Output: [0,1] 
	 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
	 */
	
	@Test
	public void test1() {
		//Assert.assertArrayEquals(new int[] {0,1}, returnIndexOfTarget(new int[] {2,7,11,15}, 9));
		Assert.assertArrayEquals(new int[] {1,2}, returnIndexOfTarget(new int[] {3,2,4}, 6));

	}
	
	
	public int[] returnIndexOfTarget(int[] nums,int target) {
		int n=nums.length;
		int[] output=new int[2];
		
		int i=0;
		int j=i+1;
		
		while(i<j) {
			if(nums[i]+nums[j]==target) {
				 output[0]=i;
				 output[1]=j;
				 break;
			}else if(j==n-1) {
				i++;
				j=i+1;
			}else {
				j++;
			}
		}
		return output;
	}
}
