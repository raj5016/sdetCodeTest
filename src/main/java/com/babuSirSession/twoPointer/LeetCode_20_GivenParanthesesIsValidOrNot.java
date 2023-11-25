package com.babuSirSession.twoPointer;

import java.util.Stack;

import org.junit.Assert;
import org.junit.Test;

public class LeetCode_20_GivenParanthesesIsValidOrNot {
	
	//https://leetcode.com/problems/valid-parentheses/submissions/
	
	@Test
	public void test() {
		/*Assert.assertTrue(isGivenParanthesesIsValidOrNot("()"));
		Assert.assertFalse(isGivenParanthesesIsValidOrNot("(]"));
		Assert.assertTrue(isGivenParanthesesIsValidOrNot("{}"));
		Assert.assertFalse(isGivenParanthesesIsValidOrNot("(])"));*/
		
		Assert.assertTrue(isGivenParanthesesIsValidOrNot("([{}])"));
	}
	
	
	public boolean isGivenParanthesesIsValidOrNot(String str) {
		Stack<Character> st = new Stack<Character>();
		char[] ch=str.toCharArray();
		
		for (Character c : ch) {
			if(c == '(' || c == '{' || c == '[') {
				st.push(c);
			}else {
				if(st.isEmpty()) {
					return false;
				}if(c==')'&& st.peek()!='(') {
					return false;
				}if(c==']'&& st.peek()!='[') {
					return false;
				}if(c=='}'&& st.peek()!='{') {
					return false;
				}else {
					st.pop();
				}
			}
		}
		return st.isEmpty();
	}

}
