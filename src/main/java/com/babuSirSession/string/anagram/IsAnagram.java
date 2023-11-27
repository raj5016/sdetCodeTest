package com.babuSirSession.string.anagram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class IsAnagram {
	/*
	 * Given two strings, check if they are anagrams of each other.
		String str1 = "listen";
		String str2 = "silent";
//		 Output: true

	 * 
	 */
	
	
	@Test
	public void testIsAnagram() {
		Assert.assertTrue(isAnagram("listen","silent"));
		Assert.assertFalse(isAnagram("listen","silsnt"));

	}

	private boolean isAnagram(String str1, String str2) {
		char[] ch1=str1.toCharArray();
		char[] ch2=str2.toCharArray();
		HashMap<Character,Integer> hmap=new HashMap<>();
		
		for (char c1 : ch1) {
			hmap.put(c1, hmap.getOrDefault(c1, 0)+1);
		}
		
		for (char c2 : ch2) {
			if(hmap.containsKey(c2)) {
				hmap.put(c2, hmap.getOrDefault(c2, 0)-1);
			}else {
				return false;
			}
		}
        Set<Character> keys=hmap.keySet();
        for (Character key : keys) {
			if(hmap.get(key)!=0) {
				return false;
			}
		}
    	return true;
	}
}
