package mandatoryHomeWork.week14;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_1684_CountTheNumberOfConsistentStrings {
	
	//https://leetcode.com/problems/count-the-number-of-consistent-strings/description/
	/*
	 * Declare a count variable
	 * Create a boolean array to represent characters in allowed
	 * Iterate with allowed string and Mark characters from allowed in the boolean array
	 * Iterate through each word in the words array
	 * 		declare boolean flag as true
	 * 		Iterate with word with char to Check if all characters in the word are in allowed,
	 * 				 if not mark the flag as false
	 * 		 Check is boolean flag is true if so increment the count
	 *Return the count
	 */
	
	@Test
	public void test() {
		Assert.assertEquals(2, countConsistentStrings("ab", new String[] {"ad","bd","aaab","baa","badab"}));
	}
	
	public int countConsistentStrings(String allowed, String[] words) {
		int count = 0;
		boolean arr[] = new boolean[26];
		for (char ch : allowed.toCharArray()) {
			arr[ch - 'a'] = true;
		}

		for (String word : words) {
			boolean isConsistent = true;
			for (char ch : word.toCharArray()) {
				if (!arr[ch - 'a']) {
					isConsistent = false;
					break;
				}
			}
			if (isConsistent) {
				count++;
			}

		}

		return count;
	}

}
