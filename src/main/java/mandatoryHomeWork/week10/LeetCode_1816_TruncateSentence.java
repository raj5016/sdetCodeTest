package mandatoryHomeWork.week10;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_1816_TruncateSentence {
	
	/*https://leetcode.com/problems/truncate-sentence/
	 * 
	 * Input is : Sentences in String and k= int value to truncate the words 
	 * OutPut: Truncated string
	 * 
	 */
	
	@Test
	public void test() {
		Assert.assertEquals("Hello how are you", returnTruncatedString("Hello how are you Contestant", 4));
	}
	
	public String returnTruncatedString(String str,int k) {
		String[] words=str.split(" ");
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i <k; i++) {
			sb.append(words[i]).append(" ");
		}
        sb.setLength(sb.length() - 1);
		return sb.toString();
	}
}
