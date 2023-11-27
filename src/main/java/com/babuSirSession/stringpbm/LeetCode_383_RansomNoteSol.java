package com.babuSirSession.stringpbm;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

public class LeetCode_383_RansomNoteSol {
	
	//@Test
	public void testIsRansomCanConstructFromMagzine_ByFrequencyArrayMethod() {
		Assert.assertTrue(isRansomCanConstructFromMagzine_ByFrequencyArray("aa", "aab"));
		Assert.assertFalse(isRansomCanConstructFromMagzine_ByFrequencyArray("a", "b"));
		Assert.assertFalse(isRansomCanConstructFromMagzine_ByFrequencyArray("aa", "ab"));
	}
	
	@Test
	public void testIsRansomCanConstructFromMagzine_ByHashMapMethod() {
		Assert.assertTrue(isRansomCanConstructFromMagzine_ByHashMap("aa", "aab"));
		Assert.assertFalse(isRansomCanConstructFromMagzine_ByHashMap("a", "b"));
		Assert.assertFalse(isRansomCanConstructFromMagzine_ByHashMap("aa", "ab"));
	}

	private boolean isRansomCanConstructFromMagzine_ByFrequencyArray(String ransomNote, String magazine) {
		int[]  charcount=new int[26];
		for (char c : magazine.toCharArray()) {
			charcount[c-'a']++;
		}
		
		for (char c : ransomNote.toCharArray()) {
			if(charcount[c-'a']>0) {
				charcount[c-'a']--;
			}else {
				return false;
			}
		}
		return true;
	}
	
	private boolean isRansomCanConstructFromMagzine_ByHashMap(String ransomNote, String magazine) {
		HashMap<Character,Integer>  hmap=new HashMap<Character,Integer>();
		
		for (char c : magazine.toCharArray()) {
			hmap.put(c, hmap.getOrDefault(c, 0)+1);
		}
		
		for (char c : ransomNote.toCharArray()) {
			hmap.put(c, hmap.getOrDefault(c, 0)-1);
			if (hmap.get(c) < 0) {
                return false;
            }
		}
		return true;

	}

}
