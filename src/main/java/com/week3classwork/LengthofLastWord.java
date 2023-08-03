package com.week3classwork;

import org.junit.Assert;
import org.junit.Test;


public class LengthofLastWord {
	
	//https://leetcode.com/problems/length-of-last-word/
	
	/*
	 * 
	 * Given a string s consisting of words and spaces, return the length of the last word in the string.

		A word is a maximal 
		substring
		 consisting of non-space characters only.
		
		 
		
		Example 1:
		
		Input: s = "Hello World"
		Output: 5
		Explanation: The last word is "World" with length 5.
	 */
	
	@Test
	public void test1() {
		countLengthOfLastWord1("Hello World");
		Assert.assertEquals(5, countLengthOfLastWord1("Hello World"));
	}
	
	
	public int countLengthOfLastWord1(String input) {
		input=input.trim();
		return input.length()-input.lastIndexOf(' ')-1;
	}
	
	
	public int countLengthOfLastWord(String input) {
		 	String trim = input.trim();
	        char[] ch = trim.toCharArray();
	        int count =0;
	        for(int i = ch.length-1;i>=0;i--) {
	        	count++;
	            if(ch[i]==' ') {
	                return count-1;
	            }
	        }
	        return count;
		
	}
}
