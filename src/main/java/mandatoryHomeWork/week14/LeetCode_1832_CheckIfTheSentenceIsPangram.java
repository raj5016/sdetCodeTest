package mandatoryHomeWork.week14;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.junit.Test;

public class LeetCode_1832_CheckIfTheSentenceIsPangram {
	//https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/
	/*
	 *    Pseudocode
	    1. init boolean Array with 26 length
	    2. mark true is the character is found

	    Time Complexity - O[N], Space Complexity - O[1]
	 */
	
	@Test
	public void test() {
		assertTrue(checkItIsPangram("thequickbrownfoxjumpsoverthelazydog"));
		assertFalse(checkItIsPangram("leetcode"));
	}
	
	
	public boolean checkItIsPangram(String sentence) {
        boolean[] arr = new boolean[26];
        for (char ch : sentence.toCharArray()) {
				arr[ch-'a']=true;
		}
        
        for (boolean b : arr) {
			if(!b) {
				return false;
			}
		}
		return true;
	}

}
