package mandatoryHomeWork.week16;

import java.util.Stack;

import org.junit.Assert;
import org.junit.Test;

public class LeetCode_20_ValidParentheses {
	
	//https://leetcode.com/problems/valid-parentheses/submissions/
	
	@Test
	public void test() {
		Assert.assertTrue(isValid("()"));
		Assert.assertFalse(isValid("(]"));
		Assert.assertTrue(isValid("{}"));
		Assert.assertFalse(isValid("(])"));
		Assert.assertTrue(isValid("([{}])"));
	}
	
	
	public boolean isValid(String s) {

		char[] ch = s.toCharArray();
		Stack<Character> st = new Stack<Character>();
		if (s.length() == 1)
			return false;

		for (Character c : ch) {
			if (c == '(' || c == '{' || c == '[') {
				st.push(c);
			} else {
				if (st.isEmpty())
					return false;

				if (c == ')' && st.peek() != '(')
					return false; // () ---condition true
				else if (c == '}' && st.peek() != '{')
					return false;
				else if (c == ']' && st.peek() != '[')
					return false;
				st.pop();
			}
		}
		return st.isEmpty();

	}
	
	public boolean isValid1(String input) {
        Stack<Character> stack = new Stack<>();
        for(char eachChar: input.toCharArray()){
            switch (eachChar){
                case '}':
                    if(stack.isEmpty() || stack.pop() != '{') return false;
//                    else stack.pop();
                    break;
                case ')':
                    if(stack.isEmpty() || stack.pop() != '(') return false;
//                    else stack.pop();
                    break;
                case ']':
                    if(stack.isEmpty() || stack.pop() != '[') return false;
//                    else stack.pop();
                    break;
                default:
                    stack.push(eachChar);
            }

        }
        return stack.isEmpty();
    }
}
