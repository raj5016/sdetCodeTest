package com.week3classwork;

import org.junit.Assert;
import org.junit.Test;

public class ReturnValidPalindromeOrNot {
	
	/*
	 * https://leetcode.com/problems/valid-palindrome/description/
	 * 
	 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
		
		Given a string s, return true if it is a palindrome, or false otherwise.
		
		 
		
		Example 1:
		
		Input: s = "A man, a plan, a canal: Panama"
		Output: true
		Explanation: "amanaplanacanalpanama" is a palindrome.
		
		PseudoCode:

		1.Convert String to LowerCase
		2.str = str.replaceAll(
		          "[^a-zA-Z0-9]", "");
		3.Intialize a string with revstrig with "";
		4.Iterate with loop (int i=input.length()-1;i>=0;i--)
						revstrig =revstrig +str.charAt(i)
		
	 */
		@Test
		public void test1() {
			Assert.assertEquals(true, isPalindromString("A man, a plan, a canal: Panama"));
		}
		
		@Test
		public void test2() {
			Assert.assertEquals(false, isPalindromString("race a car"));
		}
		
		
		@Test
		public void test3() {
			Assert.assertEquals(true, isPalindromString(""));
		}

		public boolean isPalindromString(String input) {
			
				input=input.toLowerCase();
				input=input.replaceAll("[^a-zA-Z0-9]", "");
						//System.out.println(input);
				String revString="";
				for(int i=input.length()-1;i>=0;i--) {
					revString=revString+input.charAt(i);
				}
					//System.out.println(revString);
				return revString.equals(input);
			}
		
}
