package com.repeatedDuplitedWork;

import org.junit.Assert;
import org.junit.Test;


public class ReplaceAllDigitWithChar {
	
	@Test
	public void test() {
		System.out.println(getNewString("a1c1e1"));
		Assert.assertEquals("abcdef", getNewString("a1c1e1"));
	}
	
	public String getNewString(String s) {
		char[] ch=s.toCharArray();
		for (int i = 1; i < ch.length; i+=2) {
			ch[i]=(char) (ch[i-1]+ch[i]-'0');
		}
		return new String(ch);
	}

}
