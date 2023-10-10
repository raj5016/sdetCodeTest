package mandatoryHomeWork.week15;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_2678_NumberOfSeniorCitizens {
	
	//https://leetcode.com/problems/number-of-senior-citizens/description/	
	
	@Test
	public void test() {
		Assert.assertEquals(2, countSeniors(new String[] {"7868190130M7522","5303914400F9211","9273338290F4010"}));
		Assert.assertEquals(2, countSeniors1(new String[] {"7868190130M7522","5303914400F9211","9273338290F4010"}));
	}
	
	//1 st approach
	 public int countSeniors(String[] details) {
		 int count=0;
		 for (String sc : details) {
			int age=Integer.parseInt(sc.substring(11, 13));
			if(age>60) {
				count++;
			}
		}
		 return count;
	 }
	 
	// 2nd Approach
	 public int countSeniors1(String[] details) {
		 int count=0;
		 for (String sc : details) {
			char char1=sc.charAt(11);
			char char2=sc.charAt(12);
			
			if(char1=='6'&& char2>'0') count++;
			else if(char1>'6'&& char2>='0') count++;
		}
		return count;
	 }
}
