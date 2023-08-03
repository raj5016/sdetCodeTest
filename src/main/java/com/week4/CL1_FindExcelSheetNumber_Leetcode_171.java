package com.week4;

import org.junit.Assert;
import org.junit.Test;

public class CL1_FindExcelSheetNumber_Leetcode_171 {
	
	//https://leetcode.com/problems/excel-sheet-column-number/

	
	
	//Reference -https://www.geeksforgeeks.org/find-excel-column-number-column-title/
	
	// result = 26*result + s[i] - 'A' + 1
	

	/*
	 * Example: columnTitle = AB
	
	AB
	^
	columnNumber = 0, current-char = A
	⇒ columnNumber = (0 x 26) + A - A + 1 = 1
	
	AB
	 ^
	columnNumber = 1, current-char = B
	⇒ columnNumber = (1 x 26) + B - A + 1 = 26 + 1 + 1 = 28 [Ans]
	 */
	@Test
	public void test1() {
		Assert.assertEquals(28, getColumnTitleNumber("AB"));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(1, getColumnTitleNumber("A"));
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(701, getColumnTitleNumber("ZY"));
	}
	
	public int getColumnTitleNumber(String str) {
		
		int result=0;
		//here A decimal value is 65  B=66
		for (int i = 0; i < str.length(); i++) {
			result=26*result+str.charAt(i)-'A'+1;
			// 	 1 =26 *0 +65-65+1 
		}
		return result;
	}

}
