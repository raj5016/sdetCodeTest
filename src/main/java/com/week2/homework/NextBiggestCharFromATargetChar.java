package com.week2.homework;

import org.junit.Assert;
import org.junit.Test;

public class NextBiggestCharFromATargetChar {
	
	/*
	 * https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
	 * 
	 * Here characters can also be compared similar to integers
	 * Iterate over the list of letters
	 * Add condition char is greater than target if so return the char
	 * if no biggest char than target char from the list then returning target itself
	 */
	
	
	@Test
	public void test1() {
		char[] letters= {'b', 'd' , 'h'};
		Assert.assertEquals('d', nextBiggestLetterFromTarget(letters, 'c'));
	}
	
	@Test
	public void test2() {
		char[] letters= {'b', 'd' , 'h'};
		Assert.assertEquals('h', nextBiggestLetterFromTarget(letters, 'e'));
	}
	
	@Test //No biggest then we are returning target as biggest by default
	public void test3() {
		char[] letters= {'c', 'f' , 'j'};
		Assert.assertEquals('j', nextBiggestLetterFromTarget(letters, 'j'));
	}
	
	  public char nextBiggestLetterFromTarget(char[] letters, char target) {
	        for (char c : letters) {
	            if (c > target) {
	            	return c;
	            }
	        }
	        return target;
	        //return letters[0];
	    }

}
