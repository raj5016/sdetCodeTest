package hashMap;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_387_FirstUniqueCharacterInAString {
	//https://leetcode.com/problems/first-unique-character-in-a-string/description/
	
	/**
	 * Given a string s, find the first non-repeating character in it and return its index.
	   If it does not exist, return -1.
		Example 1:
		
		Input: s = "leetcode"
		Output: 0
		Example 2:
		
		Input: s = "loveleetcode"
		Output: 2
	 */
	
	@Test
	public void test() {
		Assert.assertEquals(0, firstCharIndexOfNonRepeatingChar("leetcode"));
		Assert.assertEquals(2, firstCharIndexOfNonRepeatingChar("loveleetcode"));
	}
	
	public int firstCharIndexOfNonRepeatingChar(String s) {
		Map<Character,Integer>  hmap=new HashMap<Character,Integer>();
		
		for (int i = 0; i < s.length(); i++) {
			hmap.put(s.charAt(i), hmap.getOrDefault(s.charAt(i), 0)+1);
		}
		
		for (int i = 0; i < s.length(); i++) {
			char c=s.charAt(i);
			if(hmap.get(c)==1) {
				return i;
			}
		}
		return -1;
		
	}

}
