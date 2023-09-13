package mandatoryHomeWork.week11;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_557_ReverseEachWordInSentence {
	
	/*
	 * https://leetcode.com/problems/reverse-words-in-a-string-iii/
	 * 
	 * Input: s = "Let's take LeetCode contest"
	   Output: "s'teL ekat edoCteeL tsetnoc"
		
		Logic:
		String outputString="";
		Split the sentences to get the Words[]
		Iterate with loop until word length
			convert the word to char and take the length of c and assign the variable ,and assign j=0
			Using while loop(j<n) , swap the char and increment j, decrement n 
		add the reverse word to output string 
		Finally return the sentences.
		
	 */
	
	@Test
	public void test() {
		Assert.assertEquals("s'teL ekat edoCteeL tsetnoc", reverseWords("Let's take LeetCode contest"));
	}
	
	@Test
	public void test1() {
		Assert.assertEquals("doG gniD", reverseWords("God Ding"));
	}
	
	public String reverseWords(String str) {
		StringBuilder sb = new StringBuilder();
		String[] words = str.split(" ");
		for (int i = 0; i < words.length; i++) {
			char[] c = words[i].toCharArray();
			
			// reverse the arrays of letters
			int n = c.length - 1, j = 0;

			while (j < n) {
				char temp = c[j];
				c[j] = c[n];
				c[n] = temp;
				n--;
				j++;
			}
			// append to result
			sb.append(new String(c));
			if (i != words.length - 1) {
				sb.append(" ");
			}
		}

		return sb.toString();

	}

}
