package mandatoryHomeWork.week9;

import org.junit.Test;
import org.testng.Assert;

public class CW3_LeetCode_1221_SplitAStringWithBalancedString {
	
	//https://leetcode.com/problems/split-a-string-in-balanced-strings/description/
	/*
	 * Input 1: S=RLRRLLRLRL  , Output=4
	 * Input 2: S=RLRRRLLRLL ,OutPut=2
	 * Input 3: S=LLLLRRRR,   Output=1
	 * Input 4: S=RL     ,  Output=1
	 * 
	 * 
	 */
	
	@Test
	public void test() {
		Assert.assertEquals(4, returnBalanceSubStringcount("RLRRLLRLRL"));
	}
	
	@Test
	public void test1() {
		Assert.assertEquals(2, returnBalanceSubStringcount("RLRRRLLRLL"));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(1, returnBalanceSubStringcount("LLLLRRRR"));
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(1, returnBalanceSubStringcount("RL"));
	}
	
	
	public int returnBalanceSubStringcount(String s) {
		int count=0;
		int flag=0;
		
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='R') {
				count++;
			}
			if(s.charAt(i)=='L') {
				count--;
			}
			if(count==0) {
				flag++;
			}
		}
		return flag;
				
	}
	
	

}
