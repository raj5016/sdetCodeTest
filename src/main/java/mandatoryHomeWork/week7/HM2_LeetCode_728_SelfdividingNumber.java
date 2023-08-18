package mandatoryHomeWork.week7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class HM2_LeetCode_728_SelfdividingNumber {
	
	
	//https://leetcode.com/problems/self-dividing-numbers/
		
	@Test
	public void Test() {
		System.out.println(returnListOfNumbersWhichIsSelfDividing(1, 22));
		Assert.assertEquals(Arrays.asList(1,2,3,4,5,6,7,8,9,11,12,15,22), returnListOfNumbersWhichIsSelfDividing(1, 22));
	}
	
	@Test
	public void Test1() {
		System.out.println(returnListOfNumbersWhichIsSelfDividing(47, 85));
		Assert.assertEquals(Arrays.asList(48,55,66,77), returnListOfNumbersWhichIsSelfDividing(47, 85));
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
		if(n<=0) {
			return false;
		}
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
