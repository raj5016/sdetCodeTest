package slidingwindow_dynamic;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_485_MaxConsectiveOnes {
	
	/*
	 * https://leetcode.com/problems/max-consecutive-ones/description/
	 * 
	 * 
	 * 
	 * Logic:  Dynamic window approach
	 * 
	 * Declare left as 0 and right as 0 and distance variable 
	 * Use a condition to iterate until length of array
	 * 			Check for condition right is equal to 1 if so increment right
	 * 			Check for condition if its not equal to 0,then we have add left with right+1 and increment right
	 * 			Check for max condition
	 * 	Return the max distance		
	 * 
	 *Nataraj Logic:
	 *	1. Declare left and right
        2. increase right till 1
        3. if number is zero, calculate the window of right-left and reset right and left as current index
	 */
	
	@Test
	public void test() {
		Assert.assertEquals(3, return_maxConsective1(new int[] {1,1,0,1,1,1}));
	}
	
	@Test
	public void test1() {
		Assert.assertEquals(3, return_maxConsective1(new int[] {0,1,0,1,1,1}));
		Assert.assertEquals(2, return_maxConsective1(new int[] {1,0,1,1,0,1}));
		Assert.assertEquals(6, return_maxConsective1(new int[] {1,1,1,1,1,1}));
		Assert.assertEquals(0, return_maxConsective1(new int[] {0,0,0,0}));
	}
	
	//Time complexity -O(n) 
	public int return_maxConsective1(int[] nums){
		int left=0,right=0, distance=0, n=nums.length;
		while(right<n) {
			if(nums[right]==1) {
				right++;
			}
			else {
				if(right==n) {
					break;
				}
				left=right+1;
				right++;
			}
			distance=Math.max(distance, right-left);
		}
		return distance;
}
}
