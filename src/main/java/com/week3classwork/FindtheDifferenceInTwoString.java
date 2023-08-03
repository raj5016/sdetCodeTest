package com.week3classwork;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class FindtheDifferenceInTwoString {
	
	@Test
	public void test1() {
		char c=returnDifferenceInTwoString("abcd", "abcde");
		System.out.println(c);
	}
	
	@Test
	public void test2() {
		char c=returnDifferenceInTwoString("abcd", "aecdb");
		System.out.println(c);
	}
	
	@Test
	public void test3() {
		char c=returnDifferenceInTwoString("", "y");
		System.out.println(c);
	}
	
	public char returnDifferenceInTwoString(String s,String t) {
		char output = 0;
		HashMap<Character, Integer> hmap=new HashMap<Character, Integer>();
		
		for (int i = 0; i < s.length(); i++) {
			if(hmap.containsKey(s.charAt(i))) {
				hmap.put(s.charAt(i), hmap.get(s.charAt(i))+1);
			}else {
				hmap.put(s.charAt(i),1);
			}
		}
		
		for (int i = 0; i < t.length(); i++) {
			if(hmap.containsKey(t.charAt(i))) {
				hmap.put(t.charAt(i), hmap.get(t.charAt(i))+1);
			}else {
				hmap.put(t.charAt(i),1);
			}
		}
		
		for (Map.Entry<Character,Integer> entry : hmap.entrySet()) {
			if (entry.getValue()==1) {
				output=entry.getKey();
			}
		}
		
		return output;
		
	}

}
