package com.solveprogram;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class LeetCode_13_RomanToInteger {
	//https://leetcode.com/problems/roman-to-integer/
	/*
	 * Logic:
	 * 
	 * Define Hashmap and all roman and integer
	 * Add all the given symbol and value in it
	 * Need a sum variable to add roman equalvenet value
	 * Iterate with given string until length
	 *    Check the condition the given char is less than and next char  //III 
	 *         take the corresponding value from map and add to sum
	 *    else substarct the two value to previuos roman to current value
	 *    
	 *       
	 * 
	 * 
	 */	
	@Test
	public void testConversionOfRomanToIntegerMethod() {
		System.out.println(conversionOfRomanToInteger("MCMXCIV"));
	}

	private int conversionOfRomanToInteger(String input) {
		Map<Character,Integer>  hmap=new HashMap<>(); 
		hmap.put('I', 1);
		hmap.put('V', 5);
		hmap.put('X', 10);
		hmap.put('L', 50);
		hmap.put('C', 100);
		hmap.put('D', 500);
		hmap.put('M', 1000);
		
		//1994
		
		int sum=hmap.get(input.charAt(0));
		
		for (int i = 1; i < input.length(); i++) {  //  IV   1 AND 
			if(hmap.get(input.charAt(i))<=hmap.get(input.charAt(i-1))) {
				sum+=hmap.get(input.charAt(i));
			}else {
				sum+=hmap.get(input.charAt(i))-2 * hmap.get(input.charAt(i-1));
			}
		}
		return sum;

	}

}
