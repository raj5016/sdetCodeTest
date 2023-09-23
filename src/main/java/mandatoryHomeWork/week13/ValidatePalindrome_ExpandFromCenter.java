package mandatoryHomeWork.week13;

import org.junit.Test;
import org.testng.Assert;

public class ValidatePalindrome_ExpandFromCenter {
	
	@Test
	public void test() {
		Assert.assertEquals(true, isPalindrome_ExpandFromCenter("RADAR"));
		Assert.assertEquals(true, isPalindromeForInt_ExpandFromCenter(454));
		Assert.assertEquals(true, isPalindromeForInt_WithoutString(454));

	}
	
	@Test
	public void test1() {
		Assert.assertEquals(false, isPalindrome_ExpandFromCenter("RADARS"));
		Assert.assertEquals(false, isPalindromeForInt_ExpandFromCenter(1232123));
		Assert.assertEquals(false, isPalindromeForInt_WithoutString(1232123));
	}

	@Test
	public void test2() {
		Assert.assertEquals(false, isPalindrome_ExpandFromCenter("RaDar"));
	}

	
	//Expand from center without extra space:
	
	public boolean isPalindrome_ExpandFromCenter(String s) {
		int left=s.length()/2-1;
		int right = (s.length()%2==0)? s.length()/2 : s.length()/2 +1;
		
		while(right<s.length()) {
			if(s.charAt(left)!=s.charAt(right)) {
				return false;
			}
			left--;
			right++;
		}
		return true;
	}
	
	//converting string way
	public boolean isPalindromeForInt_ExpandFromCenter(int num) {
		String s=String.valueOf(num);
		int left=s.length()/2-1;
		int right = (s.length()%2==0)? s.length()/2 : s.length()/2 +1;
		
		while(right<s.length()) {
			if(s.charAt(left)!=s.charAt(right)) {
				return false;
			}
			left--;
			right++;
		}
		return true;
	}
	
	//without converting string way
		public boolean isPalindromeForInt_WithoutString(int num) {
			int remaindar,temp, sum=0;
			temp=num;
			while(num>0) {
				remaindar=num%10;
				sum=(sum*10)+remaindar;
				num=num/10;
			}
			if(temp==sum) {
				return true;
			}
			return false;
		}
}
