package twoPointer;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_1332_RemovePalindromicSubsequences {
	
	@Test
	public void test() {
		Assert.assertEquals(2, removePalindromeSub("abb"));
		Assert.assertEquals(2, removePalindromeSub("ababa"));
	}
	
	
	public int removePalindromeSub(String s) {
		 if (s.isEmpty()) {
		        // If the input string is already empty, no steps are needed.
		        return 0;
		    }
		    if (isPalindrome(s)) {
		        // If the input string is a palindrome, it can be removed in a single step.
		        return 1;
		    }
		    // If the string is not empty and not a palindrome, it can be removed in two steps:
		    // 1. Remove all 'a's from the string.
		    // 2. Remove all 'b's from the string.
		    return 2;
	  }
	
	public boolean isPalindrome(String s) {
		    int l = 0, r = s.length() - 1;
		    while (l < r) {
		      if (s.charAt(l) != s.charAt(r)) {
		        return false;
		      }
		      l++;
		      r--;
		    }
		    return true;
		  }

}
