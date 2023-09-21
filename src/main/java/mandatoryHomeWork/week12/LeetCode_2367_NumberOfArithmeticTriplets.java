package mandatoryHomeWork.week12;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_2367_NumberOfArithmeticTriplets {
	
	/*https://leetcode.com/problems/number-of-arithmetic-triplets/description/
	 * 
	 * Logic: 
	 * 
	 * Brute Force:
	 * 
	 * Define a variable to get the count
	 * Iterate with for loop with i=0 up to array of length
	 * Iterate with for loop with j=i+1 up to array of length
	 * Iterate with for loop with k=j+1 up to array of length
	 * 		Check the condition nums[j] - nums[i] == diff, and nums[k] - nums[j] == diff. if so increment the count and return it
	 * 
	 * Two pointer:
	 * 
	 * Define a variable to get the count, n=arraylenhth
	 * 
	 * Iterate with for loop with i=0 with i<totallength-1
	 * 		define Variable j=i+1;k=i+2;
	 * 		Have a While condition (k<n)
	 * 				leftDiff =nums[j] - nums[i] , 
	 * 				rightdiff= nums[k] - nums[j]
	 * 			Check the  the condition leftDiff and rightdiff is equal to  diff
	 * 					 if so,Increment the count and increment j and k
	 * 			Check the condition rightdiff < diff , increment k
	 * 			Check for condition lefdiff < diff,
	 * 					Increment j
	 * 			else Increment i
	 * Return the count.
	 * 		
	 * 
	 */
	
	
	@Test
	public void test() {
		//Assert.assertEquals(2, by_BruteForce_arithmeticTriplets(new int[] {0,1,4,6,7,10}, 3));
		Assert.assertEquals(2, by_TwoPointer_arithmeticTriplets(new int[] {0,1,4,6,7,10}, 3));
	}
	
	@Test
	public void test1() {
		Assert.assertEquals(2, by_BruteForce_arithmeticTriplets(new int[] {4,5,6,7,8,9}, 2));
		Assert.assertEquals(2, by_TwoPointer_arithmeticTriplets(new int[] {4,5,6,7,8,9}, 2));
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(0, by_TwoPointer_arithmeticTriplets(new int[] {0,8,9,10}, 3));
		Assert.assertEquals(0, by_BruteForce_arithmeticTriplets(new int[] {0,8,9,10}, 3));
	}
	
	
	public int by_BruteForce_arithmeticTriplets(int[] nums, int diff) {
			int count=0;
			for (int i = 0; i < nums.length; i++) {
				for (int j = i+1; j < nums.length; j++) {
					for (int k = j+1; k < nums.length; k++) {
							if(nums[j]-nums[i]==diff && nums[k]-nums[j]==diff) {
								count++;
							}
					}
					
				}
			}
			return count;
	}

	
	public int by_TwoPointer_arithmeticTriplets(int[] nums, int diff) {
		int n = nums.length;
		int count = 0;

		for (int i = 0; i < n - 2; i++) {  //0,1,4,6,7,10
			int j = i + 1;
			int k = i + 2;

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



