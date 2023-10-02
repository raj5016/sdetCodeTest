package com.week2.homework;

import org.junit.Assert;
import org.junit.Test;

public class LeetCode_9_PalindromeOrNot {
	
	/* https://leetcode.com/problems/palindrome-number/description/
	 * Pseudocode:
	 * 
	 * Input is 121
	 * Check the num is less than 0, if so return false
	 * And assign the input num to some variable
	 * And intialize a variable to hold revnum and assign as 0 
	 * Check with condition input is greater than 0,if so enter into condition
	 * Divide the input with 10, take the remaindar
	 * 			remaindar=input%10
	 * Add the remaindar with (rev*10) and assign to revNumitself
	 * 			revnum=revNum*10 +remaindar
	 * And divide the input with 10 -input/10 take the quotient
	 * 
	 * And end of while loop, check both revnum and orignal num are same
	 * 
	 */
	@Test
	public void test1() {
		Assert.assertEquals(true, isPalindrome(121));
	}
	
	public void test2() {
		Assert.assertEquals(true, isPalindrome(-121));
	}
	
	public boolean isPalindrome(int n) {
		if(n<0) {
			return false;
		}
		
		//We are storing the number in other variable inorder to compare
		int originalNum=n;
		int revNum=0;
		
		while(n>0) {
			int remaindar=n % 10;
			revNum=revNum*10 + remaindar;
			n=n/10;
		}
		if(originalNum==revNum) {
			return true;
		}else {
			return false;
		}
		
	}

}
