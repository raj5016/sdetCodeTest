package mandatoryHomeWork.week15;

import org.junit.Assert;
import org.junit.Test;

public class LeetCode_1365_HowManyNumbersAreSmallerThanCurrentNumber {
	
	
	//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/
	
	/*Logic:
	 *  Initialize an array to store the results
	 *  Iterate through each element in the input array
	 *  Initialize a count variable to keep track of smaller numbers
	 *  Iterate and Compare the current element with all other elements in the array
	 *  If the current element is smaller than nums[j], increment the count
	 *  Store the count in the result array for the current element
	 *  Return the resulting array
	 */
	
	@Test
	public void test() {
		Assert.assertArrayEquals(new int[] {4,0,1,1,3}, smallerNumbersThanCurrent(new int[] {8,1,2,2,3}));
	}
	
	public int[] smallerNumbersThanCurrent(int[] nums) {
		int[]  result=new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			int count=0;
			for (int j = 0; j < nums.length; j++) {
				if(nums[j]<nums[i] ) {
					count++;
				}
			}
			result[i]=count;
		}
       
		return result;
    }

}
