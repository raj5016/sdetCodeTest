package mandatoryHomeWork.week6;

import org.junit.Assert;
import org.junit.Test;


public class CLW_2_IsPrime {
	
	
	@Test
	public void test() {
		Assert.assertEquals(true, isPrime(5));
	}
	
	@Test
	public void test1() {
		Assert.assertEquals(true, isPrime(193));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(false, isPrime(194));
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(true, isPrime(23));
	}
	
	@Test
	public void test4() {
		Assert.assertEquals(true, isPrime(991));
	}
	
	@Test
	public void test5() {
		Assert.assertEquals(false, isPrime(908));
	}
	
	
	
	public boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
		
	}

}
