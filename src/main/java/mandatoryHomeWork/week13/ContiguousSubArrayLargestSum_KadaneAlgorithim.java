package mandatoryHomeWork.week13;

import org.junit.Test;
import org.testng.Assert;

public class ContiguousSubArrayLargestSum_KadaneAlgorithim {
	
	/*
	 * Given an integer arrays nums,find the contiguous subarray(containing at least one postive number) wich as
	 * largest sum and return its sum.
	 * A subarray is a contigious part of an array
	 * 
	 * Input=-2,1,-3,4,-1,2,1,-5,4
	 * 
	 * Output=6
	 * 
	 * Logic:
	 * 	1. Initialize two variables: max_sum and current_sum, both initially set to the first element of the array.
		2. Iterate through the array from the second element (index 1) to the end.
		3. For each element, update current_sum to be the maximum of the current element and the sum of the current element and current_sum.
		4. Update max_sum to be the maximum of max_sum and current_sum at each step.
		5. After iterating through the entire array, max_sum will contain the maximum subarray sum.
	 * 
	 */
	
	@Test
	public void test() {
		Assert.assertEquals(6, returnMaxElement(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
		Assert.assertEquals(7, returnMaxElement(new int[] {-2, -3, 4, -1, -2, 1, 5, -3}));
	}
	
	// Kadane base idea is- the largest sum is either the current element, 
						//or the sum of the current element and the previous largest sum. 
	public int returnMaxElement(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

}
	
