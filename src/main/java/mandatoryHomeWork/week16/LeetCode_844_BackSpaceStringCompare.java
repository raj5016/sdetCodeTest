package mandatoryHomeWork.week16;

import java.util.Stack;

import org.junit.Assert;
import org.junit.Test;

public class LeetCode_844_BackSpaceStringCompare {
	//https://leetcode.com/problems/backspace-string-compare/
	
	//s = "ab#c", t = "ad#c"
	@Test
	public void test() {
		Assert.assertTrue(backspaceCompare("ab#c", "ad#c"));
		Assert.assertTrue(backspaceCompare("ab##", "c#d#"));
		Assert.assertFalse(backspaceCompare("a#c", "b"));
		Assert.assertTrue(backspaceCompare("a##c", "#a#c"));

	}
	
	  public boolean backspaceCompare(String s, String t) {
			Stack<Character> st1 = new Stack<Character>();
			for (char schar : s.toCharArray()) {
				if(schar=='#') {
					if(!st1.isEmpty()) {
						st1.pop();
					}
					continue;
				}else {
					st1.push(schar);
				}
			}
			
			Stack<Character> st2 = new Stack<Character>();
			for (char tchar : t.toCharArray()) {
				if(tchar=='#') {
					if(!st2.isEmpty()) {
						st2.pop();
					}
					continue;
				}else {
					st2.push(tchar);
				}
			}
			return st1.equals(st2);
	  }

}
