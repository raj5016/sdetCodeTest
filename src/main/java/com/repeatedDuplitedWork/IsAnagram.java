package com.repeatedDuplitedWork;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class IsAnagram {
	
	//https://leetcode.com/problems/valid-anagram/
	
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
	
	public boolean isAnagram(String s,String t) {
		if(s.length()!=t.length()) {
			return false;
		}
		char[] schar=s.toCharArray();
		char[] tchar=t.toCharArray();
		Arrays.sort(schar);
		Arrays.sort(tchar);
		
		String s1=String.valueOf(schar);
		String t1=String.valueOf(tchar);
		
		if(s1.equals(t1)) {
			return true;
		}
		return false;
		
	}

}
