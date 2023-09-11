package mandatoryHomeWork.week11;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_2810_FaultyKeyBoard {
	
	/*
	 * https://leetcode.com/problems/faulty-keyboard/
	 * 
	 * Input 1:string           OutPut1:rtsng
	 * input 2:poiinter			OutPut2:ponter
	 * Input 3:greekining				OutPut3:keergning ,ngreekng
	 * 
	 * Logic:
	 * 
	 * 1. Declare a variable output string to holds for final output
	 * 2.Find the index of i and hold in variable
	 * 3.Iterate with for loop until "total length - 'i' index length"
	 * 			a.Use each char using charAt(i) and add it to outputstring
	 * 			b.And the add other remain char in string to output string using substring
	 *  	
	 * 			
	 * 
	 */
	
	@Test
	public void test() {
		Assert.assertEquals("rtsng", finalString("string"));
	}
	
	@Test
	public void test1() {
		Assert.assertEquals("ponter", finalString("poiinter"));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals("ngreekng", finalString("greekining"));
	}
	
	@Test
	public void test3() {
		Assert.assertEquals("Java", finalString("Java"));
	}
	
	@Test
	public void test4() {
		Assert.assertEquals("vyksq", finalString("qskyviiiii"));
	}
	
	public String finalString(String s) {
		 StringBuilder sb = new StringBuilder();
		 for (char c : s.toCharArray()) {
		      if (c == 'i') {
		        sb.reverse();
		      } else {
		        sb.append(c);
		      }
		    }
		    return sb.toString();
		  }
}