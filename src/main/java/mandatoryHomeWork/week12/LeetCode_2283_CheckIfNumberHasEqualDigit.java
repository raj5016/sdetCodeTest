package mandatoryHomeWork.week12;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_2283_CheckIfNumberHasEqualDigit {
	
	/*
	 * 1 2 1 0
	 * 
	 * Logic:
	 * 
	 * 1.Initialising the Frequency Array with size 10 (because 1 <= n <= 10 was given in the constraints)
	 * 2.Take each characters from the string and make it into character array
	 * 3.Store the frequency of characters in frequency Array.
	 * 4.Now find frequency of each index value and update the frequency array
	 * 5.Now in another loop check up to constraint value and take the digit and compare with frequency 
	 * 					
	 */
	
	@Test
	public void test() {
		Assert.assertEquals(true, isFrequencyEqual("1210"));
	}
	
	@Test
	public void test1() {
		Assert.assertEquals(false, isFrequencyEqual("030"));
	}
	
	 public static boolean isFrequencyEqual(String num) {
	        int n = num.length();
	        int[] freq = new int[10]; // To store the frequency of each digit (0-9)

	        for (int i = 0; i < n; i++) {
	            int digit = num.charAt(i) - '0'; // Convert character to integer
	            freq[digit]++; // Increment the count of the current digit
	        }

	        for (int i = 0; i < n; i++) {
	            int digit = num.charAt(i) - '0'; // Convert character to integer
	            if (freq[i] != digit) {
	                return false;
	            }
	        }

	        return true;
	    }

}
