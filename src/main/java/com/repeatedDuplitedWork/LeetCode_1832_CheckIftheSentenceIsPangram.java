package com.repeatedDuplitedWork;

import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;

public class LeetCode_1832_CheckIftheSentenceIsPangram {
	
	
	@Test
	public void test() {
		Assert.assertTrue(checkIfPangramByHashSet("thequickbrownfoxjumpsoverthelazydog"));
	}
	
	
	//sentence = "thequickbrownfoxjumpsoverthelazydog"
	public boolean checkIfPangram(String sentence) {
		
		boolean[] arr=new boolean[26];
		for (char ch : sentence.toCharArray()) {
			arr[ch-'a']=true;
		}
		
		for (boolean b : arr) {
			if(!b) {
				return false;
			}
		}
		return true;
	}
	
	//sentence = "thequickbrownfoxjumpsoverthelazydog"
		public boolean checkIfPangramByHashSet(String sentence) {
			HashSet<Character>  hset=new HashSet<Character>();
			for (char character : sentence.toCharArray()) {
				  hset.add(character);
			}
			
			return hset.size()==26?true:false;
		}

}
