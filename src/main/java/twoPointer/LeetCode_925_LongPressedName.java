package twoPointer;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_925_LongPressedName {
	
	//https://leetcode.com/problems/long-pressed-name/description/
	
	/**
	 * Your friend is typing his name into a keyboard. Sometimes, when typing a character c,
	   the key might get long pressed, and the character will be typed 1 or more times.
	   
	   You examine the typed characters of the keyboard. Return True if it is possible that 
	   it was your friends name, with some characters (possibly none) being long pressed.
		
		Example 1:
		Input: name = "alex", typed = "aaleex"
		Output: true
		Explanation: 'a' and 'e' in 'alex' were long pressed
	 */
	
	@Test
	public void test() {
		Assert.assertEquals(true, isLongPressedName("alex", "aaleex"));
	}
	
	public boolean isLongPressedName(String name ,String typed) {
		int i=0;
		
		for (int j = 0; j < typed.length(); j++) {
			if(i<name.length() && name.charAt(i)==typed.charAt(j)) {
				i++;
			}
			
			else if(j==0 || typed.charAt(j)!=typed.charAt(j-1)) {
				return false;
			}
			
		}
		return i==name.length();
	}

}



