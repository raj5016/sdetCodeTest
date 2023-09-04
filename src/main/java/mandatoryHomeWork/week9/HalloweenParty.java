package mandatoryHomeWork.week9;

import org.junit.Assert;
import org.junit.Test;


public class HalloweenParty {
//https://www.hackerrank.com/challenges/halloween-party/problem?isFullScreen=true
	
	public static long halloweenParty(int k) {
	    // Write your code here
	                long quotient=k/2;
	                long remindar=k-quotient;
	                return quotient*remindar;
	    }
	
	@Test
	public void test() {
		Assert.assertEquals(6, halloweenParty(5));
	}
	
	@Test
	public void test1() {
		Assert.assertEquals(16, halloweenParty(8));
	}
}
