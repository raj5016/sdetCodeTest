package mandatoryHomeWork.week13;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class LeetCode_628_MaximumProduct0fThreeNumbers {
	
	/*https://leetcode.com/problems/maximum-product-of-three-numbers/
	 * 
	 * 
	 * 
	 */
	
	@Test
	public void test() {
		Assert.assertEquals(-6, maximumProduct(new int[] {-1,-2,-3}));
		Assert.assertEquals(6, maximumProduct(new int[] {1,2,3}));
		Assert.assertEquals(24, maximumProduct(new int[] {1,2,3,4}));
		Assert.assertEquals(0, maximumProduct(new int[] {0,0,0,0}));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(39200, maximumProduct1(new int[] {-100,-98,-1,2,3,4}));
		//Assert.assertEquals(300, maximumProduct(new int[] {-100,-2,-3,1}));
	}
	
	 //Time complexity-O(nlogn)
	 public int maximumProduct(int[] nums) {
		   int n = nums.length;

		    // Sort the input array.
		    Arrays.sort(nums);

		    // The maximum product can be one of the following:
		    // 1. The product of the three largest numbers.
		    // 2. The product of the two smallest (negative) numbers and the largest number.

		    int option1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
		    int option2 = nums[0] * nums[1] * nums[n - 1];

		    // Return the maximum of these two options.
		    return Math.max(option1, option2);
	 }
	 
	 //2nd Approach  O(n)
	 public int maximumProduct1(int[] nums) {
		        // Initialize the three largest and two smallest variables
		        int max1 = Integer.MIN_VALUE;
		        int max2 = Integer.MIN_VALUE;
		        int max3 = Integer.MIN_VALUE;
		        int min1 = Integer.MAX_VALUE;
		        int min2 = Integer.MAX_VALUE;
		        //-100, -98, -1, 2, 3, 4
		        for (int num : nums) {
		            if (num >= max1) {
		                max3 = max2;
		                max2 = max1;
		                max1 = num;
		            } else if (num >= max2) {
		                max3 = max2;
		                max2 = num;
		            } else if (num >= max3) {
		                max3 = num;
		            }

		            if (num <= min1) {
		                min2 = min1;
		                min1 = num;
		            } else if (num <= min2) {
		                min2 = num;
		            }
		        }

		        // The maximum product can be one of the following:
		        // 1. The product of the three largest elements
		        // 2. The product of the two smallest (negative) elements and the largest element

		        return Math.max(max1 * max2 * max3, min1 * min2 * max1);
		    }
}
