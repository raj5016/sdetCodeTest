package mandatoryHomeWork.week10;

import org.junit.Test;

public class LeetCode_2828_StringIsAcronym {
		//https://leetcode.com/problems/check-if-a-string-is-an-acronym-of-words/
	
	@Test
	public void test() {
		System.out.println(isStringAcronym(new String [] {"alice","bob","charlie"}, "abc"));
	}
	
	@Test
	public void test1() {
		System.out.println(isStringAcronym(new String [] {"alice","bob","charlie"}, "acd"));
	}
	
	
	@Test
	public void test2() {
		System.out.println(isStringAcronym(new String [] {"never","gonna","give","up","on","you"}, "ngguoy"));
	}
	
	@Test
	public void test3() {
		System.out.println(isStringAcronym(new String [] {"an","apple"}, "a"));
	}
	
	
	

	public boolean isStringAcronym(String[] words, String actOutput) {
		String expOutput = "";
		String word = "";
		for (int i = 0; i < words.length; i++) {
				word=words[i];
				char c=word.charAt(0);
				expOutput=expOutput+String.valueOf(c);
			}
		
		return actOutput.equals(expOutput);
		
	}
}
