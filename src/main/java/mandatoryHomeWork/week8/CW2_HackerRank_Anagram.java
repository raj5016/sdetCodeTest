package mandatoryHomeWork.week8;

import org.junit.Assert;
import org.junit.Test;

public class CW2_HackerRank_Anagram {
	
	//https://www.hackerrank.com/challenges/java-anagrams/problem
	
	@Test
	public void test() {
		Assert.assertEquals(true, isAnagram("anagram", "margana"));
	}
	
	@Test
	public void test1() {
		Assert.assertEquals(false, isAnagram("anagramm", "marganaa"));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(true, isAnagram("Hello", "hello"));
	}
	
	public boolean isAnagram(String str1,String str2) {
		char[] ch1=str1.toLowerCase().toCharArray();
		char[] ch2=str2.toLowerCase().toCharArray();
		if(ch1.length!=ch2.length) {
			return false;
		}
		int[] frequencies=new int[26];
		
		for (int i = 0; i < ch1.length; i++) {
			frequencies[ch1[i]-'a']++;
			frequencies[ch2[i]-'a']--;
		}
		
		for (int frequency: frequencies) {
			if(frequency!=0) {
				return false;
			}
		}
		
		return true;
	}

}
	