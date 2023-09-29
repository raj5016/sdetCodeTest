package mandatoryHomeWork.week13;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_2810_FaultyKeyBoard {
	
	
	
	/*
	 * https://leetcode.com/problems/faulty-keyboard/description/
	 * 
	 * Logic:
	 *  Declare a variable to hold final string
	 *  Iterate until length of string
	 *  	Check in if condition -char is not equal to i,then add that char to final string
	 *  	If char is equal to i, then call reverse method with final string and get the reversestring
	 *  	And assign the reverse string to final string
	 *  Return final string
	 */
	
	
	@Test
	public void test() {
		Assert.assertEquals("rtsng", returnFinalString("string"));
		
	}
	
	@Test
	public void test1() {
		Assert.assertEquals("ponter", returnFinalString("poiinter"));
	}
	
	// Time complexity -O(n^2)
	public String returnFinalString(String str) {
		String finalString="";
		for (int i = 0; i < str.length(); i++) {
				if(str.charAt(i)!='i') {
					finalString+=str.charAt(i);
				}else {
					String rev=returnReverseString(finalString);
					finalString=rev;
				}
		}
		return finalString;
	}
	
	
	 public static String returnReverseString(String s){
	        String revStr = "";
	        for(int i = s.length()-1;i>=0;i--){
	        	revStr += s.charAt(i);
	        }
	        return revStr;
	        
	 }
	
}
