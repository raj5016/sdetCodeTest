package mandatoryHomeWork.week12;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_2269_FindTheKBeautyOfANumber {
	
	/*
	 * https://leetcode.com/problems/find-the-k-beauty-of-a-number/description/
	 * 
	 * Logic:
	 *  Convert the given number into String,
	 *  Declare Count variable, and two pointer start as 0 and end as k-1;
	 *  Have a condition end<stringlength
	 *  		Take substring of start and end+1 and store it in variable,
	 *  		Divide the Number by substringNum, if it dividing equal to zero, increase the count 
	 *  		Increment start and end
	 * Return the count
	 */
	
	@Test
	public void test() {
		Assert.assertEquals(2, By_SlidingWindow_divisorSubstrings(430043, 2));
	}
	
	@Test
	public void test1() {
		Assert.assertEquals(2, By_SlidingWindow_divisorSubstrings(240, 2));
	}
	
	public int By_SlidingWindow_divisorSubstrings(int num, int k) {
			String strNum=Integer.toString(num);
			int count=0;
			int start=0,end=k-1;
			
			while(end<strNum.length()) {
				
				String subString=strNum.substring(start, end+1);
				if (Integer.parseInt(subString)!=0) {
					if(num%Integer.parseInt(subString)==0) {
						count++;
					}
				}
				start++;
				end++;
			}
			return count;
	}
}
