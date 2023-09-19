package mandatoryHomeWork.week12;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_1343_NumbersOfSubArrays_SlidingWindow {
	
	/*
	 *https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/description/
	 *
	 *Logic:
	 * 1. Define a variable to hold count,pointer as 0,sum as 0
	 * 3. Check for condition if given subarray range is less than 0 and greater than size of array
	 * 4. Have a while loop to get first 3 subarry sum
	 * 5. Check sum average is greater than or equal to given threshold, if so increment subarray count
	 * 6. Have a while loop with current pointer is less than array size
	 * 7. now take the sum and add with new first element and substract previous first element
	 * 8. now check the sum average is greater than equal to given threshold and if so increment subarray count
	 * 9. Increment pointer 
	 * 
	 * 
	 */
	

	
	@Test
	public void test() {
		Assert.assertEquals(3, by_SlidingWindow_returnSubArraySize(new int[] {2,2,2,2,5,5,5,8}, 3, 4));
	}
	
	@Test
	public void test1() {
		Assert.assertEquals(3, by_SlidingWindow_returnSubArraySize(new int[] {6,9,5,1,2,3,4,8}, 3, 4));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(0, by_SlidingWindow_returnSubArraySize(new int[] {1,2,3}, 3, 4));
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(-1, by_SlidingWindow_returnSubArraySize(new int[] {1,2,3}, 0, 4));
	}
	
	//Time complexity: O(Size)
	public int by_SlidingWindow_returnSubArraySize(int[] arr, int k, int t) {
		int subArraySizeCount = 0, pointer = 0, currentSum = 0;
		int size = arr.length;

		if (k <= 0 || k > size) {
			return -1; // Invalid input
		}

		while (pointer < k) { // O(k)
			currentSum += arr[pointer++];
		}
		if (currentSum / k >= t) {
			subArraySizeCount++;
		}

		while (pointer < size) {  //O(size - k).
			currentSum += arr[pointer] - arr[pointer - k];
			if (currentSum / k >= t) {
				subArraySizeCount++;
			}
			pointer++;
		}
		return subArraySizeCount;

	}

}
