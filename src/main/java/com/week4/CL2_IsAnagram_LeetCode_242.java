package com.week4;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class CL2_IsAnagram_LeetCode_242 {
	
	//https://leetcode.com/problems/valid-anagram/
	
	/*
	 * 
	 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.

		An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
		
		 
		
		Example 1:
		
		Input: s = "anagram", t = "nagaram"
		Output: true
		Example 2:
		
		Input: s = "rat", t = "car"
		Output: false
	 */

	//PseudoCode:
	/*
	 * OutPut is boolean
	 * Iterate with s untill length of string
	 * Split t with chararray
	 * check String contains char of t
	 * if it contains then return true , else false
	 */
	
	@Test
	public void test() {
		Assert.assertEquals(true, isAnagram("anagram", "nagaram"));
	}
	
	@Test
	public void test1() {
		Assert.assertEquals(false, isAnagram("rat", "car"));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(true, isAnagram("mani", "inam"));
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(false, isAnagram("m", "a"));
	}
	
	@Test
	public void test4() {
		Assert.assertEquals(false, isAnagram("a", "ab"));
	}
	
	@Test
	public void test5() {
		Assert.assertEquals(false, isAnagram("aacc", "ccac"));
	}
	
	public boolean isAnagram(String s, String t) {
        char[] ch1=s.toCharArray();
        char[] ch2=t.toCharArray();

        if(ch1.length!=ch2.length){
            return false;
        }

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for(int i=0;i<ch1.length;i++){
            if(ch1[i]!=ch2[i]){
                return false;
            }
        }
        return true;
    }

	
	// 2 nd method it will fail for 5th method
	public boolean isAnagram1(String s, String t) {
        char[] ch2=t.toCharArray();

        if(s.length()!=t.length()){
            return false;
        }

       
        for(int i=0;i<s.length();i++){
            if(!s.contains(String.valueOf(ch2[i]))){
                return false;
            }
        }
        return true;
    }
	
	
}
