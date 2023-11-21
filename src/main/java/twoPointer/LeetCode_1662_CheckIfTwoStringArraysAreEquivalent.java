package twoPointer;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_1662_CheckIfTwoStringArraysAreEquivalent {

	// https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
	
	/*Logic:
	 * 1.Define two String variable
	 * 2.Iterate with word1 until length and concate word with given variable
	 * 3.Iterate with word2 until length and concate word with given variable
	 * 4.Compare two variable are equal if so return true.
	 * 
	 */

	@Test
	public void testArrayStringAreEqual() {
		Assert.assertEquals(true, arrayStringsAreEqual(new String[] { "ab", "c" }, new String[] { "a", "bc" }));
		Assert.assertEquals(false, arrayStringsAreEqual(new String[] { "a", "cb" }, new String[] { "ab", "c" }));
	}

	public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
		String word1Concat = "";
		String word2Concat = "";

		for (int i = 0; i < word1.length; i++) {
			word1Concat += word1[i];
		}

		for (int i = 0; i < word2.length; i++) {
			word2Concat += word2[i];
		} 

		return word1Concat.equals(word2Concat);
	}

}
