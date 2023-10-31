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
	    // answer can only be at most 2 because obviously you can remove all 'a's (1) from the string 
		//and then remove all 'b's,(2) that's 2 steps
	    // or you can just do it in 1 step if the whole string is palindrome
	    return isPalindrome(s) ? 1 : 2;
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
