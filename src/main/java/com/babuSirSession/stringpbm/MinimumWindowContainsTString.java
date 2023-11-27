package com.babuSirSession.stringpbm;

import org.junit.Test;

public class MinimumWindowContainsTString {
	//https://leetcode.com/problems/minimum-window-substring/
	/*
	 * Given a string S and a string T, find the minimum window in S that contains all the characters of T in complexity O(n).
		String S = "ADOBECODEBANC";
		String T = "ABC";
		// Output: "BANC"
	 * 
	 */
	
	@Test
	public void testReturnMinimumWindowWhichContainsTString() {
		String s="ADOBECODEBANC";
		String t="ABC";
		String output=returnMinimumWindowWhichContainsTString(s,t);
		System.out.println(output);
	}

	//BruteForce
	private String returnMinimumWindowWhichContainsTString(String s, String t) {
		int lengS=s.length();
		String smallestSubString="";
		int minLength=Integer.MAX_VALUE;
		
		for (int i = 0; i < lengS; i++) {
			for (int j = i; j < lengS; j++) {
				String subString = s.substring(i, j + 1);
				if (containsAllCharacter(subString, t)) {
					int currLength = subString.length();
					if (currLength < minLength) {
						minLength = currLength;
						smallestSubString = subString;
					}
				}
			}
		}
		return smallestSubString;
	}

	private boolean containsAllCharacter(String subString, String t) {
        int[] count = new int[256];
        for (char ch : t.toCharArray()) {
			count[ch]++;
		}
        for (char ch : subString.toCharArray()) {
        	if(count[ch]>0) {
    			count[ch]--;
        	}
		}
        
        for (int i = 0; i < 256; i++) {
            if (count[i] > 0)
                return false;
        }
		return true;
	}

}
