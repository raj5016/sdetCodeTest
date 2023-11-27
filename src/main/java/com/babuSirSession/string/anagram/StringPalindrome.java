package com.babuSirSession.string.anagram;

import org.junit.Assert;
import org.junit.Test;

public class StringPalindrome {
	
	/**
	 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
		String input = "A man, a plan, a canal, Panama!";
		// Output: true
	 */
	
	@Test
	public void testIsGivenStringIsPalindrome() {
		String input = "A man, a plan, a canal, Panama!";
		Assert.assertTrue(testIsGivenStringIsPalindrome(input));
		String input1 = "A man, a plan, a canal, PQanama!";
		Assert.assertFalse(testIsGivenStringIsPalindrome(input1));
	}

	private Boolean testIsGivenStringIsPalindrome(String input) {
		int left=0,right=input.length()-1;
		String str=convertToLowerCase(input);
		while(left<right) {
			
			if(str.charAt(left)==str.charAt(right)) {
				left++;
				right--;
			}else if(!Character.isLetterOrDigit(str.charAt(left))) {
				left++;
			}else if(!Character.isLetterOrDigit(str.charAt(right))) {
				right--;
			}else {
				return false;
			}
		}
		return true;
	}
	
	
	
	 public static String convertToLowerCase(String str) {
	        char[] charArray = str.toCharArray();
	        int length = charArray.length;

	        for (int i = 0; i < length; i++) {
	            // Check if the character is uppercase
	            if (charArray[i] >= 'A' && charArray[i] <= 'Z') {
	                // Convert uppercase character to lowercase by adding 32 (difference between ASCII values)
	            	//UpperCase A start=65 and LowercaseStart= 97  so 97-65==32
	                charArray[i] = (char) (charArray[i] + 32);
	            }
	        }

	        // Create a new string with converted characters
	        return new String(charArray);
	    }
	
	

}
