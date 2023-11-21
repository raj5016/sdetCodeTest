package BabuSirSession;

import org.junit.Test;

public class LeetCode_53_MaximumSubarray {
	//https://leetcode.com/problems/maximum-subarray/description/
	
	/**
	 * Logic:
	 * 
	 * 1.Define max variable as Integer max value and sum variable as 0
	 * 2.Iterate with loop until length
	 * 3.add current value to sum 
	 * 4.compare sum and max value and assign the max value to max
	 * 5.check for condition if sum is less than 0, then we will reset sum to 0(avoiding the negative sum)
	 * 5.return max
	 */
	@Test
	public void testThemaxSubArrayLargestSum() {
		System.out.println(maxSubArrayLargestSum(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
	}
	
	public int maxSubArrayLargestSum(int[] nums) {
		int n = nums.length, max = Integer.MIN_VALUE, sum = 0;

		for (int i = 0; i < n; i++) {
			sum += nums[i];
			max = Math.max(max, sum);
			if (sum < 0) {
				sum = 0;
			}
		}
		return max;
	}
}
