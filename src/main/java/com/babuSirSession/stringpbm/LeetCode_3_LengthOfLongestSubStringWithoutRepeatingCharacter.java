package com.babuSirSession.stringpbm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_3_LengthOfLongestSubStringWithoutRepeatingCharacter {
	
	/*  https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
	 * 1. Longest Substring without Repeating Characters:
		Given a string, find the length of the longest substring without repeating characters.
		String input = "abcabcc";
		Output: 3 (for "abc")
		
		SubStrings:
		
		a ,ab,abc,abca,abcab,abcabc,abcabcc ==== abc
		b,bc,bca,bcab,bcabc,bcabcc   ===========bca
		c,ca,cab,cabc,cabcc, ====================cab
		a,ab,abc,abcc=============================abc
		b,bc,bcc=============================bc
		c,cc,
	 * 
	 */
	
	
	@Test
	public void testGetLongestLengthOfnonRepeatedSubString() {
		int length=getLongestLengthOfnonRepeatedSubString("abcacc");
		Assert.assertEquals(3, length);
		int length1=getLongestLengthOfnonRepeatedSubString("aaaa");
		Assert.assertEquals(1, length1);
		int length2=getLongestLengthOfnonRepeatedSubString("cdeabcgi");
		Assert.assertEquals(7, length2);
	}
	
	//Two Pointer with set
	private int getLongestLengthOfnonRepeatedSubString(String input) {
			int max=0,left=0,right=0;
			Set<Character> set=new HashSet<>();
			while(right<input.length()) {
		        char currentChar = input.charAt(right); 
				if(!set.contains(currentChar)) {
					set.add(currentChar);
					max=Math.max(max, set.size());   //set.size() or right-left+1
					right++;
				}else {
					set.remove( input.charAt(left));
					left++;
				}
			}
		return max;
	}
	
    //!set.isEmpty() && !set.add(currentChar)

}
