package mandatoryHomeWork.week5;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_2544_AlternateDigitSum {
	
	//https://leetcode.com/problems/alternating-digit-sum/description/
	/*
	 * 
			 * //Input: num
		//Output : sum (int)
		//Logic: initialize sum;
		//1. Convert the given num to string and to char []
		//2. Run a for loop, convert the char to inv using getNumericValue and store in digit
		//3. subtract the digit from sum when th index is odd else add digit to sum
		//4. return sum
	 */
	
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
