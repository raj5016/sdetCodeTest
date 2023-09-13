package mandatoryHomeWork.week11;

import org.junit.Test;

public class MaxAverage {
	
	/*
	 * Example 1:
		Input: nums = [1,12,-5,-6,50,3], k = 4
		Output: 12.75000
		Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
		Example 2:
		Input: nums = [5], k = 1
		Output: 5.00000
	 */
	
	@Test
	public void test() {
		System.out.println(findMaxAverage(new int[] {1,3,5,1}, 4));
	}
	
	 public double findMaxAverage(int[] nums, int k) {
	        double max = Integer.MIN_VALUE;
	        for(int i = 0; i <= nums.length-k; i++){
	            int sum = nums[i];
	            for(int j = i+1; j < i+k; j++){
	                sum = sum + nums[j];
	            }
	            double avg = (double)sum/k;
	            System.out.println(avg);
	            if(avg > max ){
	                max = avg;
	            }
	        }
	        return max;
	    }

}
