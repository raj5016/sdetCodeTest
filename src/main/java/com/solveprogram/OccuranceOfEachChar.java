package com.solveprogram;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class OccuranceOfEachChar {
	
	
	/* Pseudocode: 
	 * 
	 * String str="testleaf"
	 *  Output should be t=2, e=2,s=1,l=1,a=1,f=1
	 *  
	 * Creating a HashMap containing char as a key and occurrences as  a value
	 * Convert the given string into char array
	 * Iterate over the loop untill the length of char -checking each char of strArray
	 * check for the condition map contains char ,If char is present in charCountMap,
       incrementing it's count by 1
       If char is not present in charCountMap,putting this char to charCountMap with 1 as it's value
	 * */
	@Test
	public void test1() {
		countChar("testleaf");
	}
	
	
	public void countChar(String input) {
		
		HashMap<Character, Integer> countmap=new HashMap<Character, Integer>();
		char[] ch=input.toCharArray();
		
		for(char c: ch) {
			if(countmap.containsKey(c)) {
				 // If char is present in charCountMap,
                // incrementing it's count by 1
				countmap.put(c, countmap.get(c)+1);
			}else {
				// If char is not present in charCountMap,
                // putting this char to charCountMap with 1 as it's value
				countmap.put(c, 1);
			}
		}
		
		//printing the value
		for(Map.Entry entry:countmap.entrySet()) {
			System.out.println(entry.getKey() + " = "+ entry.getValue());
		}
		
	}
}
