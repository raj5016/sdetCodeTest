package mandatoryHomeWork.week12;

import org.junit.Assert;
import org.junit.Test;

public class LeetCode_922_SortArrayByParityII {
	
	@Test
	public void test() {
		Assert.assertArrayEquals(new int[] {4,5,2,7}, sortArrayByParityII(new int[] {4,2,5,7}));
	}
	
	@Test
	public void test1() {
		Assert.assertArrayEquals(new int[] {2,3}, sortArrayByParityII(new int[] {2,3}));
	}
	
	@Test
	public void test2() {
		Assert.assertArrayEquals(new int[] {8,3,6,5}, sortArrayByParityII(new int[] {8,6,3,5}));
	}
	
	@Test
	public void test3() {
		Assert.assertArrayEquals(new int[] {8,3,6,5}, sortArrayByParityII(new int[] {3,5,8,6}));
	}

	 public int[] sortArrayByParityII(int[] nums) {
	        int i = 0;
	        int j = 1;
	        int n = nums.length;
	        int[] result = new int[n];

	        for (int num : nums) {
	            if (num % 2 == 0) {
	                result[i] = num;
	                i += 2;
	            } else {
	                result[j] = num;
	                j += 2;
	            }
	        }

	        return result;
	    }

	 }

