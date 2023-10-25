package mandatoryHomeWork.week17;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class LeetCode_169_MajorityElement {
	
	//https://leetcode.com/problems/majority-element/
	
	@Test
	public void test() {
		Assert.assertEquals(3, majorityElement(new int[] {3,2,3}));
		Assert.assertEquals(2, majorityElement(new int[] {2,2,1,1,1,2,2}));
	}
	
	public int majorityElement(int[] nums) {
		int n = nums.length;
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < n; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}
		
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > n/2) {
				return entry.getKey();
			}
		}
		return 0;
	}

}
