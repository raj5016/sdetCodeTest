package mandatoryHomeWork.week9;

import org.junit.Test;
import org.testng.Assert;

public class CW1_LeetCode_2000_StringReverseWithGivenPrefix {
	
	//https://leetcode.com/problems/reverse-prefix-of-word/
	//Input= abcdefd ,ch=d	
	//Output ==dcbaefd
	
	/*
	 * 1:  Input  --- abcdefd  ch =d
	 *    Output  --- dcbaefd
	 *    
	 *  2.input--- edfghjk  ch=k
	 *  Output-  kjhgfde
	 *  
	 *  3.Input= google  ch=s
	 *  Output=google
	 *  
	 *  3.Input= google  ch=o
	 *  Output=ogogle
	 * 
	 * 
	 *
	 */
	
	@Test
	public void test() {
		Assert.assertEquals("dcbaefd", reverseWordWithPrefix("abcdefd", 'd'));
	}
	
	@Test
	public void test1() {
		Assert.assertEquals("kjhgfde", reverseWordWithPrefix("edfghjk", 'k'));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals("google", reverseWordWithPrefix("google", 's'));
	}
	
	@Test
	public void test3() {
		Assert.assertEquals("ogogle", reverseWordWithPrefix("google", 'o'));
	}
	
	
	public String reverseWordWithPrefix(String word, char ch) {
		StringBuilder res=new StringBuilder();
		int index=word.indexOf(ch);
		
		for (int i=index;i>=0;i--) {
			res.append(word.charAt(i)); //dcda
		}
		res.append(word.substring(index+1));
		
		return res.toString();
		
	}

}
