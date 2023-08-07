package mandatoryHomeWork.week5;

import org.junit.Test;
import org.testng.Assert;

public class HM_6_AverageValueOfEvenNumbersInList {
	
	//https://leetcode.com/problems/average-value-of-even-numbers-that-are-divisible-by-three/description/
	
	@Test
	public void test() {
		Assert.assertEquals(9, averageValue(new int[] {1,3,6,10,12,15}));
	}
	
	
	@Test
	public void test1() {
		Assert.assertEquals(0, averageValue(new int[] {1,2,4,7,10}));
	}
	
	@Test //pass
	public void test2() {
		Assert.assertEquals(6, averageValue(new int[] {9,3,8,4,2,5,3,8,6,1}));
	}
	
	public int averageValue(int[] num) {
		int sum=0;
		int average=0;
		int count=0;
		for (int i = 0; i < num.length; i++) {
				if((num[i]%2==0)&&(num[i]%3==0)) {
					sum=sum+num[i];
					count++;
				}
		}
		if(count!=0) {
			return sum/count;	
		}
		return average;
		
	}

}
