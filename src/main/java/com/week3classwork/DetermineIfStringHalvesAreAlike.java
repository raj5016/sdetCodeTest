package com.week3classwork;

import org.junit.Assert;
import org.junit.Test;

public class DetermineIfStringHalvesAreAlike {
	
	//https://leetcode.com/problems/determine-if-string-halves-are-alike/description/
	
	/*
	 * You are given a string s of even length. Split this string into two halves of
	 * equal lengths, and let a be the first half and b be the second half.
	 * 
	 * Two strings are alike if they have the same number of vowels ('a', 'e', 'i',
	 * 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and
	 * lowercase letters.
	 * 
	 * Return true if a and b are alike. Otherwise, return false.
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: s = "book" Output: true Explanation: a = "bo" and b = "ok". a has 1
	 * vowel and b has 1 vowel. Therefore, they are alike.
	 * 
	 * Example 2:
	 * 
	 * Input: s = "textbook" Output: false Explanation: a = "text" and b = "book". a
	 * has 1 vowel whereas b has 2. Therefore, they are not alike. Notice that the
	 * vowel o is counted twice.
	 */
	@Test
	public void test1() {
		Assert.assertEquals(true, isStringAsSameVowels("book"));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(false, isStringAsSameVowels("textbook"));
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(true, isStringAsSameVowels("boOk"));
	}
	
	public boolean isStringAsSameVowels(String input) {
		String s1=input.substring(0, input.length()/2);
		String s2=input.substring(input.length()/2);
		s1=s1.replaceAll("[^a,e,i,o,u,A,E,I,O,U]", "");
		s2=s2.replaceAll("[^a,e,i,o,u,A,E,I,O,U]", "");
		return s1.length()==s2.length();
		
	}
}
