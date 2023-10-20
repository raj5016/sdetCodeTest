package mandatoryHomeWork.week16;

import java.util.Stack;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_1047_RemoveAllAdjacentDuplicatesInString {
	
	//https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
	
	@Test
	public void test() {
		Assert.assertEquals("ca", removeDuplicates("abbaca"));
	}

	public String removeDuplicates(String s) {
		
		Stack<Character> st1 = new Stack<Character>();
		
		for (int i = 0; i < s.length(); i++) {
			if(!st1.isEmpty()) {
				if(st1.peek()==s.charAt(i)) {
					st1.pop();
				}else {
					st1.push(s.charAt(i));
				}
			}else {
                st1.push(s.charAt(i));
			}
		}
		StringBuilder sb = new StringBuilder("");
		while(!st1.isEmpty()) {
			sb.append(st1.pop());
		}
		return sb.reverse().toString();
    }
}
