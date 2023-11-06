package stringLongestSubString_subSequence;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_2177_SumOfThreeConsectiveNumber {
	
	//https://leetcode.com/problems/find-three-consecutive-integers-that-sum-to-a-given-number/
	
	
	/**
	 * Let the number be x and let y=x/3
		then 3y=x;
		y+y+y=x
		y-1 +y +y+1 will also be equal to x;
			 
	 */
	
	@Test
	public void test() {
		//Assert.assertEquals(new long[] {10,11,12}, sumOfThree(33));
		Assert.assertEquals(new long[] {}, sumOfThree(4));

	}
	
	public long[] sumOfThree(long num) {
		if(num%3!=0) {
			return new long[] {};
		}
		
		long a=num/3;
		return new long [] {a-1,a,a+1};
        
    }

}
