package com.repeatedDuplitedWork;

import org.junit.Assert;
import org.junit.Test;

public class ExcelSheetNumber {
	
	
	
	//https://leetcode.com/problems/excel-sheet-column-number/
	
	@Test
	public void test1() {
		Assert.assertEquals(28, returnColumnNumber("AB"));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(1, returnColumnNumber("A"));
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(701, returnColumnNumber("ZY"));
	}
	
	public int returnColumnNumber(String str) {
		int result=0;
		
		for (int i = 0; i < str.length(); i++) {
			result=result*26+str.charAt(i)-'A'+1;
		}
		return result;
		
	}

}
