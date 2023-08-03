package com.week3homework;

import org.junit.Assert;
import org.junit.Test;

public class FindFirstPalindromicStringInTheArray {

	/* https://leetcode.com/problems/find-first-palindromic-string-in-the-array/description/
	 *
	 * Given an array of strings words, return the first palindromic string in the array. If there is no such string, return an empty string "".

		A string is palindromic if it reads the same forward and backward.
		
		 
		
		Example 1:
		
		Input: words = ["abc","car","ada","racecar","cool"]
		Output: "ada"
		Explanation: The first string that is palindromic is "ada".
		Note that "racecar" is also palindromic, but it is not the first.
		Example 2:
		
		Input: words = ["notapalindrome","racecar"]
		Output: "racecar"
		Explanation: The first and only string that is palindromic is "racecar".
	 */
	
	@Test
	public void test1() {
		Assert.assertEquals("ada", returnFirstPalindromeWord(new String[] {"abc","car","ada","racecar","cool"}));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals("racecar", returnFirstPalindromeWord(new String[] {"notapalindrome","racecar"}));
	}
	
	@Test
	public void test3() {
		Assert.assertEquals("", returnFirstPalindromeWord(new String[] {"def","ghi"}));
	}
	
	public String returnFirstPalindromeWord(String[] words) {
		String word = null;
		for(int i=0;i<words.length;i++) {
			 word=words[i];
			 String revWord="";
			 for(int j=word.length()-1;j>=0;j--) {
				 revWord=revWord+word.charAt(j);
			 }
			 if(revWord.equals(word)) {
				 System.out.println(revWord);
				 return revWord;
			 }
		}
		return "";
	}
}
