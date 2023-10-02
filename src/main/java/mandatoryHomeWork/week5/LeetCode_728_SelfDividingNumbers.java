package mandatoryHomeWork.week5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class LeetCode_728_SelfDividingNumbers {
	
	//Pseudocode   https://leetcode.com/problems/self-dividing-numbers/
	
	/*
	 * Declare a list to return the output 
	 * And Initialize the count 
	 * Input is two Integer number
	 * Initialize a loop with left as start and right as end
	 * Have a condition if n is greater than 9,the individual number and 
	 * 					divide with input number and verify it is equal to 0
	 * 
	 */
	
	//https://leetcode.com/problems/self-dividing-numbers/
		
	@Test
	public void Test() {
		System.out.println(returnListOfNumbersWhichIsSelfDividing(1, 22));
		Assert.assertEquals(Arrays.asList(1,2,3,4,5,6,7,8,9,11,12,15,22), returnListOfNumbersWhichIsSelfDividing(1, 22));
	}
	
	public List<Integer> returnListOfNumbersWhichIsSelfDividing(int left ,int right ){
		List<Integer> list=new ArrayList<Integer>();
		
		for (int i = left; i <= right; i++) {
			if(check(i)) {
				list.add(i);
			}
		}
		
		return list;
		
	}
	
	public boolean check(int n) {
		int temp=n;
		while(temp!=0) {
			int remaindar=temp%10;
			if(remaindar==0 ||n%remaindar!=0) {
				return false;
			}
			temp=temp/10;
		}
        return true;
	}

}
