package mandatoryHomeWork.week14;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.junit.Assert;
import org.junit.Test;

public class LeetCode_242_IsAnagramByHashMap {
	
	//https://leetcode.com/problems/valid-anagram/description/
	
	@Test
	public void test() {
		Assert.assertTrue(isAnagramByHashMap("anagram", "nagaram"));
	}
	
	// do this in single for loop using concurrentMap
	public boolean isAnagramByHashMap(String s, String t) {
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		char[] schar = s.toCharArray();
		char[] tchar = t.toCharArray();
		
		for (int i = 0; i < schar.length; i++) {
				hmap.put(schar[i], hmap.getOrDefault(schar[i], 0) + 1);
		}
		
		for (int i = 0; i < tchar.length; i++) {
			if (hmap.get(tchar[i]) != null) {
				if (hmap.get(tchar[i]) == 1) {
					hmap.remove(tchar[i]);
				} else {
					hmap.put(tchar[i], hmap.get(tchar[i]) - 1);
				}
			} else {
				return false;
			}
		}
		return hmap.isEmpty();
	}
//=====================================Using ConsurrentMap=============================================================//	
	@Test
	public void test1() {
		Assert.assertTrue(isAnagramByConcurrentHashMap("anagram", "nagaram"));
	}
	
	// do this in single for loop using concurrentMap
		public boolean isAnagramByConcurrentHashMap(String s, String t) {
			ConcurrentHashMap<Character, Integer>  cmap=new ConcurrentHashMap<Character, Integer>();
			
			for (int i = 0; i < s.length(); i++) {
				cmap.put(s.charAt(i), cmap.getOrDefault(s.charAt(i), 0)+1);
				cmap.put(t.charAt(i), cmap.getOrDefault(t.charAt(i), 0) - 1);
				
				/*From java 8
				cmap.merge(s.charAt(i), 1, (existingValue, newValue) -> existingValue + newValue));
				cmap.merge(t.charAt(i), -1, (existingValue, newValue) -> existingValue + newValue));
				*/
			}
			return cmap.values().stream().allMatch(count -> count == 0);
		}
	
//====================================Using array===========================================================================//
		
		@Test
		public void test2() {
			Assert.assertTrue(isAnaGramByArray("anagram", "nagaram"));
		}
		
		public boolean isAnaGramByArray(String s, String t) {
			
			if(s.length()!=t.length()) {
				return false;
			}
			
			int[] arr=new int[26];
			
			for (int i = 0; i < s.length(); i++) {
				arr[s.charAt(i)-'a']++;
				arr[t.charAt(i)-'a']--;
			}
			
			for (int i : arr) {
				if(i!=0) {
					return false;
				}
			}
			
			return true;
			
		}
}
