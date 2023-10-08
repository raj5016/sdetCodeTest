package mandatoryHomeWork.week12;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;


public class CodeChef_YourNameIsMine {
	
	@Test
	public void test() {
		Assert.assertEquals("YES", isSubsequence("john johanna"));
	}
	
	@Test
	public void test1() {
		Assert.assertEquals("YES", isSubsequence("ira ira"));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals("YES", isSubsequence("kayla jayla"));
	}
	
	public String isSubsequence(String s) {
		String[] words=s.split(" ");
		 String M=words[0];
		 String W= words[1];
		 char[] charArrayM=M.toCharArray();
		 char[] charArrayW=W.toCharArray();
		 Arrays.sort(charArrayM);
		 Arrays.sort(charArrayW);
		 if (Arrays.equals(charArrayM, charArrayW)) {
	            return "YES";
	        } else {
	            return "NO";
	        }
	}

}
