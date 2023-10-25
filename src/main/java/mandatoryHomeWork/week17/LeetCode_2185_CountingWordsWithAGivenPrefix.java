package mandatoryHomeWork.week17;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_2185_CountingWordsWithAGivenPrefix {
	//https://leetcode.com/problems/counting-words-with-a-given-prefix/description/
	
	@Test
	public void test() {
		Assert.assertEquals(2, prefixCount(new String[] {"pay","attention","practice","attend"}, "at"));
		Assert.assertEquals(0, prefixCount(new String[] {"leetcode","win","loops","success"}, "code"));

	}
	
	  	public int prefixCount(String[] words, String pref) {
	  		int count=0;
	  		for (int i = 0; i < words.length; i++) {
				if(words[i].startsWith(pref)) {
					count++;
				}
			}
	       return count; 
	    }

}
