package mandatoryHomeWork.week7;

import org.junit.Assert;
import org.junit.Test;

public class HM1_LeetCode_2652_SumOfMultiple {
	
	
	public int returnSumOfMultiple(int n) {
		
		int sumOfGivenNumber = 0;
		
		for (int i = 3; i <= n; i++) {
			if(i%3==0 || i%5==0 || i%7==0) {
				sumOfGivenNumber=sumOfGivenNumber+i;
			}
		}
		return sumOfGivenNumber;
	}
	
	
	@Test
	public void test() {
		Assert.assertEquals(21, returnSumOfMultiple(7));
	}
	
	@Test
	public void test1() {
		Assert.assertEquals(40, returnSumOfMultiple(10));
	}

	@Test
	public void test2() {
		Assert.assertEquals(30, returnSumOfMultiple(9));
	}

}
