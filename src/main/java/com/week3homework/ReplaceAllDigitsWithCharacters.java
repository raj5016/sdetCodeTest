package com.week3homework;

import org.junit.Assert;
import org.junit.Test;

public class ReplaceAllDigitsWithCharacters {
	
	//https://leetcode.com/problems/replace-all-digits-with-characters/description/
	
	@Test
	public void test() {
		System.out.println(returnWithCharacterByReplacingTheDigits("a1c1e1"));
		Assert.assertEquals("abcdef", returnWithCharacterByReplacingTheDigits("a1c1e1"));
	}
	
	public String returnWithCharacterByReplacingTheDigits(String s) {
		char[] c=s.toCharArray();
		for (int i = 1; i < c.length; i+=2) {
				//c[i]+=c[i-1]-'0';
				c[i] = (char) (c[i - 1] + c[i] - '0');
				//				a =97     1=49 - 0=48 
		}
		return new String(c);

		
	}
}
