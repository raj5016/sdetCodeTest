package com.repeatedDuplitedWork;

import java.util.HashMap;
import java.util.Map;
import org.junit.Test;

public class CountTheRepeatedLetterInAString {
	
	
	@Test
	public void test() {
		returnRepeatedCharCount("apple");
	}
	
	@Test
	public void test1() {
		returnRepeatedCharCount("aApple");
	}
	
	@Test
	public void test3() {
		returnRepeatedCharCount("aApplCe");
	}
	
	public void returnRepeatedCharCount(String str) {
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		char[] chars=str.toCharArray();

		for (char c : chars) {
			//Here we are validating if char is upper case we skipping and going for next step
			if(Character.isLowerCase(c)) {
				if (map.containsKey(c)) {
	            	map.put(c, map.get(c)+1);
	            }else {
	            	map.put(c, 1);
	            }
			}
		}
		System.out.println("========= Occurance of char in the String is :"+ str +" ===========");
		for (Map.Entry<Character,Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
