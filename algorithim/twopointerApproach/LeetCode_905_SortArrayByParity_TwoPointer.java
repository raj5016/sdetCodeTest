package twopointerApproach;

import org.junit.Assert;
import org.junit.Test;

public class LeetCode_905_SortArrayByParity_TwoPointer {
	/*
	 * https://leetcode.com/problems/sort-array-by-parity/submissions/1052592907/
    Logic:
        Declare a variable which holds temp
        Take two pointer i as start index and j end index
        Have a condition need to traverse until length of array
             if nums[i]%2 is equal to 0
                Increment i++;
             else nums[i] not equal zero ,
                swap with arr[j] to arr[i]
                and decrement j--

    */
	
	@Test
	public void test() {
		Assert.assertArrayEquals(new int[] {4,2,1,3}, sortArrayByParity(new int[] {3,1,2,4}));
		Assert.assertArrayEquals(new int[] {0}, sortArrayByParity(new int[] {0}));
	}
	
	public int[] sortArrayByParity(int[] nums) {

        int temp=0,i=0,j=nums.length-1;
        while(i<j){
            if(nums[i]%2==0){ 
                i++;
            }
            else{
                temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j--;
            } 

        }
        return nums;
    }

}
