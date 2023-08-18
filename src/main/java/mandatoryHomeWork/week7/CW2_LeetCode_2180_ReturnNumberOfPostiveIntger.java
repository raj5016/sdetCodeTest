package mandatoryHomeWork.week7;

import org.junit.Assert;
import org.junit.Test;

public class CW2_LeetCode_2180_ReturnNumberOfPostiveIntger {
	
	//https://leetcode.com/problems/count-integers-with-even-digit-sum/
	/*
	 * Given a positive integer num, return the number of positive integers less than or equal to num whose digit sums are even.
		The digit sum of a positive integer is the sum of all its digits.
		Example 1:
		
		Input: num = 4
		Output: 2
		Explanation:
		The only integers less than or equal to 4 whose digit sums are even are 2 and 4.    
		Example 2:
		
		Input: num = 30
		Output: 14
		Explanation:
		The 14 integers less than or equal to 30 whose digit sums are even are
		2, 4, 6, 8, 11, 13, 15, 17, 19, 20, 22, 24, 26, and 28.
	 */
	
	//Taken 26 ms in leetcode
	
	@Test
	public void test() {
		Assert.assertEquals(14, returnTheCountOfPostiveIntgerNum(30));
	}
	
	@Test
	public void test1() {
		Assert.assertEquals(2, returnTheCountOfPostiveIntgerNum(4));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(14, optimizeSolution(30));
	}
	
	public int returnTheCountOfPostiveIntgerNum(int num) {
		int count = 0;
		int sum = 0;
		for (int i = 2; i <= num; i++) {
			if ((i % 2 == 0) && (i < 10)) 
			{
				count++;
			} 
			else if (i >= 10) {
				String strnum = String.valueOf(i);
				String[] str = strnum.split("");
				for (int j = 0; j < str.length; j++) {
					int value = Integer.parseInt(str[j]);
					sum = sum + value;
				}
				if (sum % 2 == 0) {
					count++;
				}
				sum = 0;
			}
		}
		return count;

	}
	
	//Method 2 
	
	public int optimizeSolution(int num) {
		int count = 0;
        for (int i = 1; i <= num; i++) {
            if (isDigitSumEven(i)) {
                count++;
            }
        }
        return count;
	}
	
	public boolean isDigitSumEven(int num) {
        int sum = 0;
        int remaindar=0;
        while (num > 0) {
        	remaindar= num % 10;
        	sum	=remaindar+sum;
            num = num/10;
        }
        return sum % 2 == 0;
    }
}
