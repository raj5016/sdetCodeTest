package mandatoryHomeWork.week14;

import java.util.HashMap;
import org.junit.Assert;
import org.junit.Test;

public class LeetCode_383_RansomNote {
	
	/*
	 * https://leetcode.com/problems/ransom-note/description/
	 * 
	 * Logic for Freuence array:
	 * 		1. Declare two short array
	 * 		2.Iterate with ransomnote and magazine and add to the respoective array using asci
	 * 		3.Iterate with ransomnote length and compare ransome array index value is greater than magazine array index value if so return false
	 * 		4.On last return true
	 * 
	 */
	
	@Test
	public void test() {
		Assert.assertTrue(isRansomCanConstruct_ByFrequencyArray("aa", "aab"));
		Assert.assertFalse(isRansomCanConstruct_ByFrequencyArray("a", "b"));
		Assert.assertFalse(isRansomCanConstruct_ByFrequencyArray("aa", "ab"));
		
		//2nd approach
		Assert.assertTrue(canConstruct("aa", "aab"));
		Assert.assertFalse(canConstruct("a", "b"));
		Assert.assertFalse(canConstruct("aa", "ab"));
	}
	
	//Frequency Array approach:
	public boolean isRansomCanConstruct_ByFrequencyArray(String ransomNote, String magazine) {
		short[] ran=new short[26];
		short[] mag=new short[26];

		for (int i = 0; i < magazine.length(); i++) {
			mag[magazine.charAt(i)-'a']++;
		}
		for (int i = 0; i < ransomNote.length(); i++) {
			ran[ransomNote.charAt(i)-'a']++;
		}
		
		for (int i = 0; i < ran.length; i++) {
			if(ran[i]>mag[i]) {
				return false;
			}
		}
		
		return true;
	}
	
	// 2nd Frequency approach
	
	 public static boolean canConstruct(String ransomNote, String magazine) {
	        int[] charCount = new int[26]; 

	        // Populate the charCount array with characters from magazine
	        for (char c : magazine.toCharArray()) {
	            charCount[c - 'a']++;
	        }

	        // Check if ransomNote can be constructed
	        for (char c : ransomNote.toCharArray()) {
	            if (charCount[c - 'a'] > 0) {
	                charCount[c - 'a']--;
	            } else {
	                return false; // Not enough characters available in magazine
	            }
	        }

	        return true;
	    }
	//=================================using hashmap=====================================================================

	@Test
	public void test1() {
		Assert.assertTrue(isRansomCanConstruct_ByHashMap("aa", "aab"));
		Assert.assertFalse(isRansomCanConstruct_ByHashMap("a", "b"));
		Assert.assertFalse(isRansomCanConstruct_ByHashMap("aa", "ab"));
	}
	
	//HashMap  approach:
		public boolean isRansomCanConstruct_ByHashMap(String ransomNote, String magazine) {
			 HashMap<Character,Integer> hm = new HashMap<>();
			 for(int i=0;i<magazine.length();i++) {
			      hm.put(magazine.charAt(i), hm.getOrDefault(magazine.charAt(i), 0)+1);
			    }
				for (int i = 0; i < ransomNote.length(); i++) {
					 hm.put(ransomNote.charAt(i), hm.getOrDefault(ransomNote.charAt(i), 0)-1);
		            if (hm.get(ransomNote.charAt(i)) < 0) {
		                return false;
		            }
		        }
				return true;
	    }
}
