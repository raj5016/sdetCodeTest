package com.week4;

import org.junit.Test;
import org.testng.Assert;

public class CL3_LeetCode_168_ExcelSheetColumnTitle {
	
	//https://leetcode.com/problems/excel-sheet-column-title/description/
	
	@Test
	public void test() {
		Assert.assertEquals("AB", returnExcelSheetColumnTitle(28));
	}
	
	
	public String returnExcelSheetColumnTitle(int columnNumber) {
		StringBuilder builder=new StringBuilder();
		
		while(columnNumber>0) {
            // Convert the column number to 0-based index (A=0, B=1, ..., Z=25)
			columnNumber--;
			
            // Get the last character of the column title (rightmost digit)
			char lastdigit=(char) ('A'+columnNumber%26);
			
            // Append the character to the result
			builder.insert(0, lastdigit);
			
            // Move to the next significant digit
			columnNumber=columnNumber/26;
			
		}
		
		return builder.toString();
		
	}

}
