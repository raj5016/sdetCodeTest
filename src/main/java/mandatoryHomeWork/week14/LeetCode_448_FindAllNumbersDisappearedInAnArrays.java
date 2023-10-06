package mandatoryHomeWork.week14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class LeetCode_448_FindAllNumbersDisappearedInAnArrays {
	
	//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
	
	@Test
	public void test() {
		Assert.assertEquals(Arrays.asList(5,6), findDisappearedNumbers(new int[] {4,3,2,7,8,2,3,1}));
		Assert.assertEquals(Arrays.asList(5,6), bySet_findDisappearedNumbers(new int[] {4,3,2,7,8,2,3,1}));
		Assert.assertEquals(Arrays.asList(2), findDisappearedNumbers(new int[] {1,1}));
		Assert.assertEquals(Arrays.asList(2), bySet_findDisappearedNumbers(new int[] {1,1}));

	}
	
	 public List<Integer> findDisappearedNumbers(int[] nums) {
	        List<Integer> result = new ArrayList<>();
	        
	        // Iterate through the array and mark each number as negative at its corresponding index
	        for (int num : nums) {
	            int index = Math.abs(num) - 1;
	            nums[index] = -Math.abs(nums[index]);
	        }
	        
	        // Collect the indices (1-based) where the numbers are still positive
	        for (int i = 0; i < nums.length; i++) {
	            if (nums[i] > 0) {
	                result.add(i + 1);
	            }
	        }
	        
	        return result;
	    }


	 //Extra Space since we using set
	    public List<Integer> bySet_findDisappearedNumbers(int[] nums) {
	        Set<Integer> numSet = new HashSet<Integer>();
	        List<Integer> result = new ArrayList<>();
	        int n = nums.length;
	        
	        // Add all numbers from the array to the set
	        for (int num : nums) {
	            numSet.add(num);
	        }
	        
	        // Check for each number in the range [1, n] if it's in the set, if not, add it to the result
	        for (int i = 1; i <= n; i++) {
	            if (!numSet.contains(i)) {
	                result.add(i);
	            }
	        }
	        
	        return result;
	    }
	}
