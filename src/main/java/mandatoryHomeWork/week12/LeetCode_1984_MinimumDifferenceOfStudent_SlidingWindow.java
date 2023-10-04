package mandatoryHomeWork.week12;

import java.util.Arrays;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_1984_MinimumDifferenceOfStudent_SlidingWindow {
	
	/*
	 * https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/solutions/3688672/java-solution-using-sliding-window/
	 /*
    Pseudocode

    1. Sort the array to get scores in order
    2. Assign a variable with max value
    3. Finding the difference between the max and minimum of the k window, and validate with the minimum difference value

    time complexity - O[N(log N)]
    space complexity - O[1]
     */
	
	@Test
	public void test() {
		Assert.assertEquals(2, returnMinimumDifference(new int[] { 9,4,1,7}, 2));
	}
	
	
	public void maxValue() {  //90 , k=1  ----   9,4,1,7 k=2
		int sum=Integer.MAX_VALUE+Integer.MAX_VALUE;
		System.out.println(sum);
	}
	
	//1st approach
	public int returnMinimumDifference(int[] nums,int k) {
		Arrays.sort(nums);
		int difference=Integer.MAX_VALUE;
		for (int i = 0; i <=nums.length-k; i++) {
			difference=Math.min(difference, nums[i+k-1]-nums[i]);
		}
		
		return difference;
	}
	
	//Another way
	 public int minimumDifference(int[] nums, int k) {
	        if(k==1){
	            return 0;
	        }
	       Arrays.sort(nums);
	       int i=0;
	       int j=k-1;
	       int diff=Integer.MAX_VALUE;

	       while(j<nums.length){
	          diff=Math.min(diff, nums[j]-nums[i]);
	          i++;
	          j++;
	       }
	    return diff;
	    }
}
