package com.week3homework;

import org.junit.Assert;
import org.junit.Test;


public class MergeStringsAlternately {
	
	// https://leetcode.com/problems/merge-strings-alternately/description/
	
	/*
	 * You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

		Return the merged string.
		Example 1:
		
		Input: word1 = "abc", word2 = "pqr"
		Output: "apbqcr"
		Explanation: The merged string will be merged as so:
		word1:  a   b   c
		word2:    p   q   r
		merged: a p b q c r
		Example 2:
		
		Input: word1 = "ab", word2 = "pqrs"
		Output: "apbqrs"
		Explanation: Notice that as word2 is longer, "rs" is appended to the end.
		word1:  a   b 
		word2:    p   q   r   s
		merged: a p b q   r   s
		Example 3:
		
		Input: word1 = "abcd", word2 = "pq"
		Output: "apbqcd"
		Explanation: Notice that as word1 is longer, "cd" is appended to the end.
		word1:  a   b   c   d
		word2:    p   q 
		merged: a p b q c   d
	 */
	@Test
	public void test1() {
		System.out.println(returnMergedString("abc", "pqr"));
		Assert.assertEquals("apbqcr", returnMergedString("abc", "pqr"));
	}
	
	@Test
	public void test2() {
		System.out.println( returnMergedString("ab", "pqrs"));
		Assert.assertEquals("apbqrs", returnMergedString("ab", "pqrs"));
	}
	
	@Test
	public void test3() {
		System.out.println(returnMergedString("abcd", "pq"));
		Assert.assertEquals("apbqcd", returnMergedString("abcd", "pq"));
	}
	
	public String returnMergedString(String s1,String s2) {
		int i=0;
		int s1size=s1.length();
		int s2size=s2.length();
		String mergeString="";
		
		while(i<s1size || i<s2size) {
			if(i<s1size) {
				mergeString=mergeString+s1.charAt(i);
			}
			if(i<s2size) {
				mergeString=mergeString+s2.charAt(i);

			}
			i++;
	}
		return mergeString;
	
	}
}
	

