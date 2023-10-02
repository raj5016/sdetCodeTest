package mandatoryHomeWork.week9;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_1768_MergeString {
	
	//https://leetcode.com/problems/reverse-prefix-of-word/
	
	//Input= abcdefd ,ch=d	
	//Output ==dcbaefd
	
	/*
	 * 1:  Word1  --- abc   word2=pqr
	 *    Output  --- apbqcr
	 *    
	 *  2:  Word1  --- ab   word2=pqrs
	 *    Output  --- apbqrs
	 * 
	 * 
	 *
	 */
	
	@Test
	public void test() {
		Assert.assertEquals("apbqcr", mergeTheString("abc", "pqr"));
	}
	
	@Test
	public void test1() {
		Assert.assertEquals("apbqrs", mergeTheString("ab", "pqrs"));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals("apbqcd", mergeTheString("abcd", "pq"));
	}
	
	
	
	public String mergeTheString(String word1, String word2) {
		String mergeString="";
		int l1=word1.length();
		int l2=word2.length();
		
		int i=0;
		
		while(i<l1 || i<l2) {
			if(i<l1) {
				mergeString=mergeString+word1.charAt(i);
			}
			if(i<l2) {
				mergeString=mergeString+word2.charAt(i);
			}
			i++;
		}
		return mergeString;
	}
	}
