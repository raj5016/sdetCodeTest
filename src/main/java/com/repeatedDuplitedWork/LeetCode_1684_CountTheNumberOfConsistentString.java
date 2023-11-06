package com.repeatedDuplitedWork;

import java.util.HashSet;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_1684_CountTheNumberOfConsistentString {
	
	
	@Test
	public void test() {
		Assert.assertEquals(2, countConsistentStrings("ab", new String[] {"ad","bd","aaab","baa","badab"}));
	}
	
	// allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
	   public int countConsistentStrings(String allowed, String[] words) {
		   int count=0;
		   HashSet<Character>  hset=new HashSet<Character>() ;
		   
		   for (int i = 0; i < allowed.length(); i++) {
			   		hset.add(allowed.charAt(i));
		   }
		   
		   for (String word : words) {
			    for (int i = 0; i < word.length(); i++) {
					if(!hset.contains(word.charAt(i))) {
						break;
					}
					if(i==word.length()-1) {
						count++;
					}
				}
			
		   }
		   return count;
	   }

}
