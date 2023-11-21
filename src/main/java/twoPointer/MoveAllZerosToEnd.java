package twoPointer;

import org.junit.Assert;
import org.junit.Test;

public class MoveAllZerosToEnd {
	
	@Test
	public void data1() {
		Assert.assertArrayEquals(new int[] {1,3,12,0,0}, returnArrayAfterMovingAllZerosToEnd(new int[] {0,1,0,3,12}));
	}
	
	/*
	 * Logic:
	 * 
	 * 1.Define two pointer 
	 * 2.Have a break condition
	 * 		a.Check for condition left=0 and right !=0
	 * 				if so swap and increment both pointer
	 * 		b.left !=0 and right=0
	 * 			increment left
	 * 		c.left=0 and right=0
	 * 			increment right
	 * 		d.left !=0 and right !=0
	 * 			increment left
	 * 			decrement right
	 */
	
	//[0,1,0,3,12]
	public int[] returnArrayAfterMovingAllZerosToEnd(int[] nums) {
		int left=0,right=1;
		
		while(right<nums.length) {
			if(nums[left]==0 && nums[right]!=0) {
				int temp=nums[left];
				nums[left]=nums[right];
				nums[right]=temp;
				left++;
				right++;
			}else if(nums[left]!=0 && nums[right]==0) {
				left++;
			}else if(nums[left]==0 && nums[right]==0) {
				right++;
			}else if(nums[left]!=0 && nums[right]!=0) {
				left++;
				right--;
			}
		}
		return nums;
	}

}
