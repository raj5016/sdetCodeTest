package mandatoryHomeWork.week5;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_2544_AlternateDigitSum {
	
	//https://leetcode.com/problems/alternating-digit-sum/description/
	
	@Test
	public void test() {
		Assert.assertEquals(4, alternateDigitSum(521));
	}
	
	 public int alternateDigitSum(int n) {
	        String s= ""+n;
	        
	        int total=0;
	        for(int i=0;i<s.length();i++){
	        	
	            if(i%2==0) {
	            	total=total+ s.charAt(i)-'0';
	            }
	            else {
	            	total=total-s.charAt(i)-'0';
	            }
	        }

	        return total;
	    }

}
