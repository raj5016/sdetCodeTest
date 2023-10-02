package mandatoryHomeWork.week6;

import org.junit.Assert;
import org.junit.Test;

public class LeetCode_1952_ThreeDivisorsLeetcode {
	
	/*
	 * https://leetcode.com/problems/three-divisors/
	 * Given an integer n, return true if n has exactly three positive divisors. Otherwise, return false.

		An integer m is a divisor of n if there exists an integer k such that n = k * m.
		
		 
		
		Example 1:
		
		Input: n = 2
		Output: false
		Explantion: 2 has only two divisors: 1 and 2.
		Example 2:
		
		Input: n = 4
		Output: true
		Explantion: 4 has three divisors: 1, 2, and 4.
	 */
		@Test
		public void test() {
			Assert.assertEquals(false, isThree(2));
		}
		
		@Test
		public void test1() {
			Assert.assertEquals(true, isThree(4));
		}
		
		@Test
		public void test2() {
			Assert.assertEquals(false, isThree(12));
		}
	
	
		public boolean isThree(int n) {
			int count=0;
			for (int i = 1; i <=n; i++) {
				if(n%i==0) {
					count+=1;
				}
			}
			if(count==3) {
				return true;
			}else {
				return false;
			}
    }
}
