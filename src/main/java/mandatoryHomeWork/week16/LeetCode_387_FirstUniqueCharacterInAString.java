package mandatoryHomeWork.week16;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_387_FirstUniqueCharacterInAString {
	//https://leetcode.com/problems/first-unique-character-in-a-string/description/
	
	@Test
	public void test() {
		Assert.assertEquals(0, firstUniqChar("leetcode"));
		Assert.assertEquals(2, firstUniqChar("loveleetcode"));
		Assert.assertEquals(-1, firstUniqChar("aabb"));
	}
	
	@Test
	public void test1() {
		Assert.assertEquals(0, firstUniqCharByQueue("leetcode"));
		//Assert.assertEquals(2, firstUniqCharByQueue("loveleetcode"));
		//Assert.assertEquals(-1, firstUniqCharByQueue("aabb"));
	}
	
	
	//Through hashmap
	 	public int firstUniqChar(String s) {
	 		Map<Character,Integer>   hmap=new HashMap<Character,Integer>();
	 		char[] ch=s.toCharArray();
	 		for (char c : ch) {
				hmap.put(c, hmap.getOrDefault(c, 0)+1);
			}
	 		
	 		for (int i = 0; i < s.length(); i++) {
	 			char c=s.charAt(i);
	 			if(hmap.get(c)==1) {
	 				return i;
	 			}
			}
	        return -1;
	    }
	 	//======================by Queue===========================================================================
	public int firstUniqCharByQueue(String s) {
		int[] charCount = new int[26]; // Assuming input contains only lowercase letters

		Queue<Character> charQueue = new LinkedList<>();

		for (char c : s.toCharArray()) {
			charCount[c - 'a']++;
			charQueue.offer(c); // offer() method will return false if the element cannot be inserted due to capacity restrictions.
		}

		int index = 0;

		while (!charQueue.isEmpty()) {
			char c = charQueue.poll();
			if (charCount[c - 'a'] == 1) {
				return index;
			}
			index++;
		}

		return -1;
	}	

}
