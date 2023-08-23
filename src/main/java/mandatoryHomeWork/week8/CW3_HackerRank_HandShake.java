package mandatoryHomeWork.week8;

import org.junit.Test;
import org.testng.Assert;

public class CW3_HackerRank_HandShake {
	
	//https://www.hackerrank.com/challenges/handshake/problem?isFullScreen=true
	
	//The formula for the number of handshakes possible at a party with n people is

		//# handshakes = n*(n - 1)/2.
	
		@Test
		public void test() {
			Assert.assertEquals(45, findCountOfHandShake(10));
		}
	
		@Test
		public void test1() {
			Assert.assertEquals(3, findCountOfHandShake(3));
		}
		
		public int findCountOfHandShake(int n) {
			return n*(n-1)/2;
		}
		
}
