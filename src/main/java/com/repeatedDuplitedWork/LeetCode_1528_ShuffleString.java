package com.repeatedDuplitedWork;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_1528_ShuffleString {
	
	@Test
	public void test() {
		Assert.assertEquals("leetcode", shuffelString("codeleet", new int[] {4,5,6,7,0,2,1,3}));
	}
	
	public String shuffelString(String str,int[] indices) {
		int length=indices.length;
		char[]  charArray=new char[length];
		
		for (int i = 0; i < str.length(); i++) {
			charArray[indices[i]]=str.charAt(i);
		}
		return String.valueOf(charArray);
	}

}
