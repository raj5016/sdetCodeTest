package mandatoryHomeWork.week7;

import org.junit.Assert;
import org.junit.Test;

public class HM2_FindTheGivenNumberIsSpyNumberOrNot {
	
	/*
	 * A number is said to be a Spy number if the sum of all the digits is equal to the product of all digits. 
	 */
	
	
	@Test
	public void test() {
		//Assert.assertEquals(true, isSpy(132));
		Assert.assertEquals(true, isSpyOrNot(132));
	}
	
	@Test
	public void test1() {
		Assert.assertEquals(true, isSpy(1124));
		Assert.assertEquals(true, isSpyOrNot(1124));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(false, isSpy(1125));
		Assert.assertEquals(false, isSpyOrNot(1125));
	}
	
	
	public boolean isSpy(int num) {
		String numstr=Integer.toString(num);
		String[] digits=numstr.split("");
		int sum = 0;
		int product=1;
		for (int i = 0; i <digits.length; i++) {
			int value=Integer.parseInt(digits[i]);
			sum=sum+value;
			product=product*value;
		}
		if(sum==product) {
			return true;
		}
		return false;
	}
	
	
	public boolean isSpyOrNot(int num) {
		int sum = 0;
		int product=1;
		int lastdigit;
		while(num>0) {
			lastdigit=num%10;
			sum=sum+lastdigit;
			product=product*lastdigit;
			num=num/10;
		}
		if(sum==product) {
			return true;
		}
		return false;
	}
	
}
