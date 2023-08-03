package com.repeatedDuplitedWork;

import org.junit.Assert;
import org.junit.Test;

public class Maximum69Number {
	
	@Test
	public void test() {
		System.out.println(returnMaximumNumber(9669));
		Assert.assertEquals(9969, returnMaximumNumber(9669));
	}
	
	@Test
	public void test1() {
		System.out.println(returnMaximumNumber(9996));
		Assert.assertEquals(9999, returnMaximumNumber(9996));
	}
	
	@Test
	public void test2() {
		System.out.println(returnMaximumNumber(9999));
		Assert.assertEquals(9999, returnMaximumNumber(9999));
	}
	
	
	public int returnMaximumNumber(int num) {
		String snum=num+"";
		char[] ch=snum.toCharArray();
		for (int j = 0; j < ch.length; j++) {
				if(ch[j]=='6') {
					ch[j]='9';
					break;
				}
		} 
		return Integer.parseInt(String.copyValueOf(ch));
		
		
	}

}
