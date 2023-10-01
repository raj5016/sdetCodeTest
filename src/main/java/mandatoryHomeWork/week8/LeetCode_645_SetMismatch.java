package mandatoryHomeWork.week8;


import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;

public class LeetCode_645_SetMismatch {
		// https://leetcode.com/problems/set-mismatch/

	@Test
	public void test() {
		Assert.assertArrayEquals(new int[] {2,3}, findErrorNums(new int[] {1,2,2,4}));
	}
	
	@Test
	public void test1() {
		Assert.assertArrayEquals(new int[] {1,2}, findErrorNums(new int[] {1,1}));
	}

	@Test
	public void test2() {
		Assert.assertArrayEquals(new int[] {5,6}, findErrorNums(new int[] {1,2,3,4,5,5,7,8,9}));
	}
	
	@Test
	public void test3() {
		Assert.assertArrayEquals(new int[] {2,1}, findErrorNums(new int[] {2,2}));
	}
	
	
	public int[] findErrorNums(int[] nums) {
        int[] count= new int[nums.length + 1];
        
        for (int i = 0; i < nums.length; i++) {
			count[nums[i]]++;  //1,1
			//nums[0]=1
			//count[1]=0 since we are incrementing , value 0 is changed to 1
		}

        int dup = 0, miss = 0;
        
        for (int i = 1; i < count.length; i++) {
            if (count[i] == 2) {
                dup = i;
            }
            if (count[i] == 0) {
                miss = i;
            }
        }
		return new int[] {dup,miss};
	}

	// Another way
	
	public int[] returnDuplicateAndMissingNumber(int[]  arr) {
			int dup=0,miss=0;
			
			HashSet<Integer> set=new HashSet<Integer>();
			
			
			//finding the duplicate element in given array
			for (int i = 0; i < arr.length; i++) {
				if(set.contains(arr[i])) {
					dup=arr[i];
				}
				set.add(arr[i]);
			}
			
			//finding the missing element
			
			for (int i = 1; i <=arr.length; i++) {
				if(set.contains(i)==false) {
					miss=i;
					break;
				}
			}
		return new int[] {dup,miss};
	}
}
