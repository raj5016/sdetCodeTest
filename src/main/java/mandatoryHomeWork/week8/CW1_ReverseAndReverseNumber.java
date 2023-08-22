package mandatoryHomeWork.week8;

import org.junit.Assert;
import org.junit.Test;


public class CW1_ReverseAndReverseNumber {
	
	/*
	 * PROBLEM: 
			Reversing an integer means to reverse all its digits.
			
			For example, reversing 2021 gives 1202. Reversing 12300 gives 321 as the leading zeros are not retained.
			Given an integer num, reverse num to get reversed1, then reverse reversed1 to get reversed2. 
			Return true if reversed2 equals num. Otherwise return false.
	 */
	
		/*
		 * PseudoCode
		 * Take the input as int
		 * Output is boolean
		 * declare a variable reverse and reverse 1 as 0 and remaindar and assign given input to orignal num varaiable
		 * use while loop to check the condition and perform mod action to get the remindar 
		 * and sum the remainder with initialize the reverse variable 
		 */
	
	@Test
	public void test() {
		Assert.assertEquals(true, reverseNum(2021));
	}
	
	@Test
	public void test1() {
		Assert.assertEquals(false, reverseNum(12300));
	}
	
	
	public boolean reverseNum(int num) {
		int originalNum=num;
		int reverse = 0;
		int reverse1 = 0;
		int remiandar;
		
		while(num>0) {
			remiandar=num%10;
			reverse=reverse*10+remiandar;
			num=num/10;
		}
		
		while(reverse>0) {
			remiandar=reverse%10;
			reverse1=reverse1*10+remiandar;
			reverse=reverse/10;
		}
		if (reverse1==originalNum) {
			return true;
		}
		return false;
		
	}

}
