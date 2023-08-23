package mandatoryHomeWork.week8;

import java.util.Arrays;

import org.junit.Test;
import org.testng.Assert;

public class HM3_LeetCode_561_ArrayPartition {
	
	@Test
	public void test() {
		Assert.assertEquals(4, arrayPairSum(new int[] {1,4,3,2}));
	}
	
	@Test
	public void test1() {
		Assert.assertEquals(9, arrayPairSum(new int[] {6,2,6,5,1,2}));
	}
	
	public int arrayPairSum(int[] nums) {
        Arrays.sort(nums); // Sort the array 1,2,2,5,6,6
        
        int maxSum = 0;
        
        // Iterate over the sorted array, considering only every second element
        for (int i = 0; i < nums.length; i += 2) {
            maxSum += nums[i];
        }
        
        return maxSum;
    }

}
