package mandatoryHomeWork.week17;

import java.util.Stack;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_394_DecodeTheString {
	
	//https://leetcode.com/problems/decode-string/description/  
	
	@Test
	public void test() {
		Assert.assertEquals("aaabcbc", decodeString("3[a]2[bc]"));
	}
	
	 public String decodeString(String s) {
		 Stack<Integer> countStack = new Stack<>();
	        Stack<String> stringStack = new Stack<>();
	        String currentString = "";
	        int count = 0;

	        for (char c : s.toCharArray()) {
	            if (Character.isDigit(c)) {
	                count = count * 10 + (c - '0');
	            } else if (c == '[') {
	                countStack.push(count);
	                stringStack.push(currentString);
	                count = 0;
	                currentString = "";
	            } else if (c == ']') {
	                int repeatCount = countStack.pop();
	                StringBuilder repeatedString = new StringBuilder();
	                for (int i = 0; i < repeatCount; i++) {
	                    repeatedString.append(currentString);
	                }
	                currentString = stringStack.pop() + repeatedString.toString();
	            } else {
	                currentString += c;
	            }
	        }

	        return currentString;
	        
	    }

}
