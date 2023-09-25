package mandatoryHomeWork.week13;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_1446_ConsecutiveCharacters {
	/*
	 * https://leetcode.com/problems/consecutive-characters/description/
	 * 
	 * Logic:  Dynamic window approach
	 *  Declare left and right and distance variable
	 *  Have a condition to iterate until with string of length
	 *  	Check for condition left char and right char is equal if so increment right
	 *  	If condition not match take the max power distance and  assign left as right
	 *  And end of while loop check for max power 
	 *  Return the diatance
	 * 
	 */
	
	@Test
	public void test() {
		Assert.assertEquals(2, maxPower("ccbccbb"));
		Assert.assertEquals(2, maxPower("leetcode"));
		Assert.assertEquals(5, maxPower("abbcccddddeeeeedcba"));
	}
	
	//Time complexity=O(n)
	 public int maxPower(String s) {  //leetcode
		 int left=0,right=0,distance=0,n=s.length();
		 
		 while(right<n) {
			 if(s.charAt(left)==s.charAt(right)) {
				 right++;
			 }else {
				 if(right==n) {
					 break;
				 }
				 distance=Math.max(distance, right-left);
				 left=right;
			 }
		 }
		 distance = Math.max(distance, right - left);
		 return distance;
	 }

}
