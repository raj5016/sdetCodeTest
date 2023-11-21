package twoPointer;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_1464_MaximumProductOfTwoElementsInAnArray {
	
	//https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/description/
	
	/**
	 * 
	 * @param nums
	 * @return
	 * 
	 * Logic:
	 * 
	 * 1.Initialize two pointers, i and j, pointing to the start and end of the nums array 
	 * respectively. 
	 * 2.Also, set maxValue to the smallest possible integer value to ensure it 
	 * captures the maximum product found.
	 * 3.Iterating as long as the pointer j is greater than i.
	 * 			a. Check if the product of nums[i] - 1 and nums[j] - 1 is greater than the current maxValue. 
	 * 			   If so, update maxValue with this new product.
	 * 			b.Compare the values at indices i and j. If the value at index j is greater than or equal to 
	 * 			   the value at index i, increment i. If the value at index i is greater 
	 * 			   than the value at index j, decrement j.
	 * 			c.Continue this process of comparing values and updating maxValue until the 
	 * 			   pointers meet (j becomes less than or equal to i
	 * 4.Finally, return the maxValue
	 * 		
	 */
	
	@Test
	public void testMaxProduct() {
		Assert.assertEquals(12, maxProduct(new int[] {3,4,5,2}));
	}
	
	public int maxProduct(int[] nums) {

		int i = 0, j = nums.length - 1;
		int maxValue = Integer.MIN_VALUE;
		while (j > i) {
			if (((nums[i] - 1) * (nums[j] - 1)) > maxValue) {
				maxValue = (nums[i] - 1) * (nums[j] - 1);
			}
			if (nums[j] >= nums[i]) {
				i++;
			} else if (nums[i] >= nums[j]) {
				j--;
			}
		}
		return maxValue;

	}
}
