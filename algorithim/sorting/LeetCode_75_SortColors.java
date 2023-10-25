package mandatoryHomeWork.week17;

import java.util.Arrays;

import org.junit.Test;
import org.testng.Assert;


public class LeetCode_75_SortColors {
	
	//https://leetcode.com/problems/sort-colors/description/
	
	@Test
	public void test() {
		Assert.assertEquals(new int[] {0,0,1,1,2,2}, sortColors(new int[] {2,0,2,1,1,0}));
	}
	
	 public int[] sortColors(int[] nums) {
	        int low = 0, mid = 0, high = nums.length-1;

	        while(mid <= high){
	            if(nums[mid] == 0 ){
	                //swap with left
	                swap(nums,low, mid );
	                low++;
	                mid++;
	            }else if(nums[mid] == 2){
	            	//swap with right
	                swap(nums, mid, high);
	                high--;
	            }else{
	                mid++;
	            }
	        }
		    return nums;
	    }

	    public static void swap(int[] nums, int i, int j){
	        int temp = nums[i];
	        nums[i] = nums[j];
	        nums[j] = temp;
	    }
}
