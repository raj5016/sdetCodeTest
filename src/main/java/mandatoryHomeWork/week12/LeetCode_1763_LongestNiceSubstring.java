package mandatoryHomeWork.week12;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_1763_LongestNiceSubstring {
	//	https://leetcode.com/problems/longest-nice-substring/description/
	
	@Test
	public void test() {
		Assert.assertEquals("aAa", By_BruteForce_longestNiceSubstring("YazaAay"));
	}
	
	public String By_BruteForce_longestNiceSubstring(String s) {
		 Set<Character> charSet = new HashSet<>();
	        for (int i = 0; i < s.length(); i++) {
	            charSet.add(s.charAt(i));
	        }
	        for (int i = 0; i < s.length(); i++) {
	            if (charSet.contains(Character.toUpperCase(s.charAt(i))) &&
	                    charSet.contains(Character.toLowerCase(s.charAt(i)))) {
	                continue;
	            }
	            String s1 = By_BruteForce_longestNiceSubstring(s.substring(0, i));
	            String s2 = By_BruteForce_longestNiceSubstring(s.substring(i+1));
	            return s1.length()>= s2.length() ? s1 : s2;
	        }
	        return s;
	    }
}
	

