package BabuSirSession;

import org.junit.Test;

public class LeetCode_1004_MaxConsecutiveOnesIII {
	
	
	/*
	 * Logic:
	 * 
	 * 1. Define left and right as 0 and counter=0;
	 * 2. Iterate untill length
	 * 3.Check nums[right] is 1, if so increment right, counter increment
	 * 4. if right is not 1 and k!=0,  decrement k--,counter increnet
	 * 		
	 * 5 .if k=0,then left++, right=left
	 * 
	 * 
	 * 
	 * 
	 */
	@Test
	public void test() {
		System.out.println(longestOnes(new int[] {1,1,1,0,0,0,1,1,1,1,0}, 2));
	}
		
		public int longestOnes(int[] nums, int k) {
			int j=0,maxCounter=0,currentCounter=0;
			int temp=k;
			
			for(int i=0;i<nums.length;i++) {
				if(nums[i]==1 && temp!=0 ) {
					i++;
					currentCounter++;
				}else if(nums[i]==0 && temp==0) {
					temp=k;
					i=j;
					j++;
					temp--;
					maxCounter=Math.max(maxCounter, currentCounter);
					currentCounter=0;
				}else {
					currentCounter++;
				}
			}
			return maxCounter;
	        
	    }
}
