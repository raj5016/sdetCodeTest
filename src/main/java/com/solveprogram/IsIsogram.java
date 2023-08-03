package com.solveprogram;

import org.junit.Assert;
import org.junit.Test;

public class IsIsogram {

	@Test
	public void test1() {
		boolean actual=isIsoGram("stop");
		Assert.assertEquals(true, actual);
	}
	
	@Test
	public void test2() {
		boolean actual=isIsoGram("testleaf");
		Assert.assertEquals(false, actual);
	}
	
	public boolean isIsoGram(String str) {
		char[] ch=str.toCharArray();
		
		for(int i=0;i<ch.length-1;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					return false;
				}
			}
		}
		
		return true;
	}

}
