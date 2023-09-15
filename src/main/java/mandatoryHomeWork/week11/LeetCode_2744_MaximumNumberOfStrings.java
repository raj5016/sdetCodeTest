package mandatoryHomeWork.week11;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_2744_MaximumNumberOfStrings {
	
	//https://leetcode.com/problems/find-maximum-number-of-string-pairs/description/
	
	@Test
	public void test() {
		Assert.assertEquals(2, maximumNumberOfStringPairs(new String[] {"cd","ac","dc","ca","zz"}));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(1, maximumNumberOfStringPairs(new String[] {"ab","ba","cc"}));
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(0, maximumNumberOfStringPairs(new String[] {"aa","ab"}));
	}
	
	public int maximumNumberOfStringPairs(String[] words) {
		int count = 0;
		for (int i = 0; i < words.length; i++) {
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].charAt(0) == words[j].charAt(1) && words[i].charAt(1) == words[j].charAt(0)) {
					count++;
				}
			}
		}
		return count;
	}
	   

}
