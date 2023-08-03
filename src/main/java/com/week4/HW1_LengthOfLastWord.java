package com.week4;

import org.junit.Assert;
import org.junit.Test;


public class HW1_LengthOfLastWord {
	
	
	@Test
	public void test() {
		Assert.assertEquals(5, returnLengthOfLastword("Hello World"));
	}
	
	@Test
	public void test1() {
		Assert.assertEquals(4, returnLengthOfLastword("   fly me   to   the moon  "));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(6, returnLengthOfLastword("luffy is still joyboy"));
	}
	
	
	public int returnLengthOfLastword(String s) {
		String trimString = s.trim();
		String[] words = trimString.split(" ");
		return words[words.length - 1].length();
		
}
}