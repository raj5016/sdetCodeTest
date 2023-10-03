package mandatoryHomeWork.week14;

import java.util.HashSet;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_136_SingleNumber {
	
	/*https://leetcode.com/problems/single-number/description/
	 * 
	 */
	
	@Test
	public void test() {
		Assert.assertEquals(1, findSingleNumber(new int[] {2,2,1}));
		Assert.assertEquals(4, findSingleNumber(new int[] {4,1,2,1,2}));
		Assert.assertEquals(1, findSingleNumber(new int[] {1}));
	}

	public int findSingleNumber(int[] nums) {
		HashSet<Integer>  hset=new HashSet<Integer>();
		for (int num : nums) {
			if(hset.contains(num)) {
				hset.remove(num);
			}else {
				hset.add(num);
			}
		}
		return hset.iterator().next();
	}
}
