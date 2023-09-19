package mandatoryHomeWork.week12;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_2697_LexicographicallySmallestPalindrome_TwoPointer {
	
	//https://leetcode.com/problems/lexicographically-smallest-palindrome/description/
	/*
	 * Logic:
	 * 1. Convert string to char array
	 * 2. Declare left and right pointer
	 * 3.Have a condition left< right
	 * 4. Have first condition left<right , then assign left element to right element
	 * 5. Have second condition right<left, then assign right element to left element
	 * 6. Increment left and decrement right
	 */
	
	@Test
	public void test() {
		Assert.assertEquals("efcfe", makeSmallestPalindrome("egcfe"));
	}
	
	@Test
	public void test1() {
		Assert.assertEquals("abba", makeSmallestPalindrome("abcd"));
	}
	
	
	@Test
	public void test2() {
		Assert.assertEquals("neven", makeSmallestPalindrome("seven"));
	}
	
	 public String makeSmallestPalindrome(String s) {

	        char[] output = s.toCharArray();
	        int left =0, right = output.length-1;

	        while(left<right){
	        	if(output[left]<output[right]){ //comparing the asci value internally
		                output[right] = output[left];
		          }
	            if(output[right]<output[left]){  
	                output[left] = output[right];
	             }
	            left++;
	            right--;
	        }
	        return new String(output);
	    }

}
