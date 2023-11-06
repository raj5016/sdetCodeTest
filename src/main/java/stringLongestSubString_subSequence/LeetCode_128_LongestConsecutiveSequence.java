package stringLongestSubString_subSequence;

import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_128_LongestConsecutiveSequence {
	
	//https://leetcode.com/problems/longest-consecutive-sequence/description/
	//Input: nums = [100,4,200,1,3,2]
	//Reference video : https://www.youtube.com/watch?v=pLzOp2_Y9Vk&ab_channel=CodewithAlisha
	
	/**
	 * Logic:
	 * 
	 * 1.Define a set to store the element
	 * 2.Define Output variable to hold final output
	 * 3.Iterate with nums and add it set
	 * 4.Again iterate with Nums and 
		  	a.Initialize current_element to nums[i]
	        b.Initialize previous_element to current_element - 1
	        c.Initialize count to 0
	        
	      4.1.Check if previous_element is not in the HashSet,if previous_element is not in hset
	       			Count the length of consecutive elements starting from current_element
	    5.Update the output with the maximum count
	    6.return the output
	 * 
	 */
	@Test
	public void test() {
		Assert.assertEquals(4, longestConsecutive(new int[] {100,4,200,1,3,2}));
		Assert.assertEquals(6, longestConsecutive(new int[] {11,2,3,6,5,12,1,4,9,50,51}));
	}
	
	 	public int longestConsecutive(int[] nums) {
	 		int output=0;
	 		Set<Integer>  hset=new LinkedHashSet<Integer>();
	 		
	 		for (int num : nums) {
				hset.add(num);
			}
	 		
	 		for (int i = 0; i < nums.length; i++) {
				int current_element=nums[i];
				int previous_element=current_element-1;
		 		int count=0;

				if(!hset.contains(previous_element)) {
					while(hset.contains(current_element)) {
						 current_element++;
						 count++;
					}
				}
				output=Math.max(output, count);
			}
	        return output;
	    }

}
