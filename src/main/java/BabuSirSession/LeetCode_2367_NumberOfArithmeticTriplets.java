package BabuSirSession;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_2367_NumberOfArithmeticTriplets {
	
	//https://leetcode.com/problems/number-of-arithmetic-triplets/description/
	
	@Test
	public void testArithmeticTriplets() {
		Assert.assertEquals(2, arithmeticTripletsByBruteforce(new int[] {0,1,4,6,7,10}, 3));
		Assert.assertEquals(2, arithmeticTripletsByTwoPointer(new int[] {0,1,4,6,7,10}, 3));
	}
	/**
	 * 
	 * Brute Force Logic:
	 * 
	 * 1.Define a variable count=0;
	 * 2.Iterate with loop with i=0 until the length-2
	 * 3.Second loop iterate with j=i+1 until length-1
	 * 4.third loop iterate with k=i+2 until length
	 * 		Check for Given condition nums[j] - nums[i] == diff && nums[k] - nums[j] == diff
	 * 				If so increment the count;
	 */
	
    public int arithmeticTripletsByBruteforce(int[] nums, int diff) {
		int count=0;
		
		for (int i = 0; i < nums.length-2; i++) {
			for (int j = i+1; j < nums.length-1; j++) {
				for (int k = j+1; k < nums.length; k++) {
					if(nums[j] - nums[i] == diff && nums[k] - nums[j] == diff) {
						count++;
					}
				}
			}
		}
    	return count;
    }

    /**
     * Two Pointer Logic:
     * 
     * 1.Define a variable count,n as length
     * 2.Iterate with for loop until length -2 and define Variable j=i+1;k=i+2;
	 * 		Have a While condition (k<n)
	 * 				leftDiff =nums[j] - nums[i] , 
	 * 				rightdiff= nums[k] - nums[j]
	 * 			Check the  the condition leftDiff and rightdiff is equal to  diff
	 * 					 if so,Increment the count and increment j and k
	 * 			Check the condition rightdiff < diff , increment k
	 * 			Check for condition lefdiff < diff,
	 * 					Increment j
	 * 			else Increment i
	 * Return the count
     * 
     */
	public int arithmeticTripletsByTwoPointer(int[] nums, int diff) {
		int n = nums.length,count = 0;

		for (int i = 0; i < n - 2; i++) {  //0,1,4,6,7,10
			int j = i + 1, k = i + 2;

			while (k < n) {
				
				int leftDiff = nums[j] - nums[i];
				int rightDiff = nums[k] - nums[j];

				if (leftDiff == diff && rightDiff == diff) {
					count++;
					j++;
					k++;
				} else if (rightDiff < diff) {
					k++;
				} else if (leftDiff < diff) {
					j++;
				} else {
					i++;
				}
			}
		}
		return count;
	}
}
