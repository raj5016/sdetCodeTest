package mandatoryHomeWork.week16;

import java.util.Stack;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_1021_RemoveOutermostParentheses {
	
	/*https://leetcode.com/problems/remove-outermost-parentheses/description/
	 * Logic:
	 * 
	 * Declare stack and string builder
	 * convert string into character array and iterate
	 * Check for ch is opening braces
	 * 		check if stack is empty or not i.e its first opening bracket or not 
	 * 			adds to sb if opening bracket but not first
	 * 		if stack is not empty,push element into stack
	 * if it is close braces,
	 * 		check if stack is empty or not i.e its first close bracket or not 
	 * 			adds to sb if closing bracket
	 * 		if stack is not empty,pop element from stack
	 *return the string
	 * 		
	 * 
	 */
	
	@Test
	public void test() {
		Assert.assertEquals("()()()", removeOuterParentheses("(()())(())"));
	}
	
	
    public String removeOuterParentheses(String S) {
    	Stack<Character>  st=new Stack<Character>();
    	StringBuilder sb=new StringBuilder();
    	
    	for (char ch : S.toCharArray()) {
			if(ch=='(') {
				if(st.size()>=1) {
					sb.append(ch);
				}
				st.push(ch);
			}else {
				if(st.size()>1) {
					sb.append(ch);
				}
				st.pop();
			}
		}
    	return sb.toString();
    }

}
