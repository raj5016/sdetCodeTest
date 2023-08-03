package com.week3classwork;

import org.junit.Assert;
import org.junit.Test;


public class CheckifAlAAppearsBeforeAllB {
	
	
	@Test
	public void test1() {
		Assert.assertEquals(true, checkifAlAAppearsBeforeAllB("aaabbb"));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(false, checkifAlAAppearsBeforeAllB("abab"));
		Assert.assertEquals(false, checkifAlAAppearsBeforeAllB1("abab"));
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(true, checkifAlAAppearsBeforeAllB("bbb"));
		Assert.assertEquals(true, checkifAlAAppearsBeforeAllB1("bbb"));
	}
	
	@Test
	public void test4() {
		Assert.assertEquals(true, checkifAlAAppearsBeforeAllB1("aaa"));
	}
	
	public boolean checkifAlAAppearsBeforeAllB1(String s) {
		if(s.contains("ba")) {
			return false;
		}else {
			return true;
		}
		//		return !s.contains("ba");

	}
	
	public boolean checkifAlAAppearsBeforeAllB(String s) {
		int a_lngth=s.lastIndexOf('a');
		int b_lngth=s.indexOf('b');
		
		if(a_lngth==s.length()-1) {
			return false;
		}
		if(b_lngth>a_lngth) {
			return true;
		}else {
			return false;
		}
				
	}

}
