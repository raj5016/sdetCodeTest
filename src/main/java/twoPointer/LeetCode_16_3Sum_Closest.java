package twoPointer;

import java.util.Arrays;

import org.junit.Test;
import org.testng.Assert;


public class LeetCode_16_3Sum_Closest {
	
	
	@Test
	public void test() {
		Assert.assertEquals(1, threeSumClosest(new int[] {-1,2,1,-4}, 2));
	}
	
	//By Brute force
	 public int threeSumClosest_bruteForce(int[] nums, int target) {
	        int min = nums[0] + nums[1] + nums[2];
	        int len = nums.length;
	        for(int i=0; i<len; i++) {
	            for(int j=i+1; j<len; j++) {
	                for(int k=j+1; k<len; k++) {
	                    int sum = nums[i] + nums[j] + nums[k];
	                    if(Math.abs(target - min) >  Math.abs(target - sum)) {
	                        min = sum;
	                    }
	                }
	            }
	        }
	        return min;
	    }
	 
	//Two pointer
	 public int threeSumClosest(int[] nums, int target) {
		 Arrays.sort(nums);  //-4 -1 1 2 
		 int n=nums.length;
		 int closetSum=Integer.MAX_VALUE;
		 int minDiffe=Integer.MAX_VALUE;
		 
		 
		 for (int i = 0; i < n-2; i++) {
			int j=i+1;
			int k=n-1;
			
			while(j<k) {
				int sum=nums[i]+nums[j]+nums[k];
				int diff=Math.abs(sum-target);//Calculate the absolute difference between current sum and target
				
				// Update the minimum difference and closest sum if necessary
				if(diff<minDiffe) {
					minDiffe = diff;
					closetSum = sum;
				}
				
				if(sum<target) {// If current sum is less than target, increment the left pointer
					j++;
				}else if(sum>target) {// If current sum is greater than target, decrement the right pointer
					k--;
				}else {
					return sum;// If current sum is equal to target, return it as the closest sum
				}
			}
		}
	     return closetSum;   // Return the closest sum after traversing the entire array
	 }

}
