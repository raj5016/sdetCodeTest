package com.week3classwork;

import org.junit.Assert;
import org.junit.Test;


public class LeetCode_1528_ShuffleString {
	
	//https://leetcode.com/problems/shuffle-string/description/
	
	/*
	 * You are given a string s and an integer array indices of the same length. The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.

		Return the shuffled string.
		Example 1:
		
		
		Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
		Output: "leetcode"
		Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
	 */

	@Test
	public void test1() {
		System.out.println(getShuffleString("codeleet", new int[] {4,5,6,7,0,2,1,3}));
		Assert.assertEquals("leetcode", getShuffleString("codeleet", new int[] {4,5,6,7,0,2,1,3}));
	}
	
	@Test
	public void test2() {
		System.out.println(getShuffleString("abc", new int[] {0,1,2}));
		Assert.assertEquals("abc", getShuffleString("abc", new int[] {0,1,2}));
	}
	
	
	public String getShuffleString(String str,int [] indices) {
		int indicesLength=indices.length;
	       char[]  charArray=new char[indicesLength];
	       for(int i=0;i<indicesLength;i++){
	          charArray[indices[i]] =str.charAt(i);
	       }
	        return String.valueOf(charArray);
	    }
}
