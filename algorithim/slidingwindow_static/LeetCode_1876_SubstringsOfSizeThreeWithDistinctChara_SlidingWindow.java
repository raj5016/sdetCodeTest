package slidingwindow_static;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_1876_SubstringsOfSizeThreeWithDistinctChara_SlidingWindow {
	
	/*
	 * https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/description/
	 * 
	 * 
	 */
	
	@Test
	public void test() {
		Assert.assertEquals(1, countGoodSubstrings("xyzzaz"));
	}
	
	@Test
	public void test1() {
		Assert.assertEquals(4, countGoodSubstrings("ajiaji"));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(1, countGoodSubstrings("abc"));
	}
	
    public static int countGoodSubstrings(String s) {
    	int n=s.length();
    	
    	if(n<3) {
    		return 0;
    	}
    	
    	int count=0;
    	int[] charCount=new int[26];
    	
    	for (int i = 0; i < 3; i++) {
    		charCount[s.charAt(i)-'a']++;
		}
    	 for (int i = 3; i <= n; i++) {
             // Check if the current substring is "good"
             boolean isGood = true;
             for (int j = 0; j < 26; j++) {
                 if (charCount[j] > 1) {
                     isGood = false;
                     break;
                 }
             }

             if (isGood) {
                 count++;
             }

             // Update the character count for the sliding window
             if (i < n) {
                 charCount[s.charAt(i - 3) - 'a']--; // Remove the leftmost character
                 charCount[s.charAt(i) - 'a']++;     // Add the rightmost character
             }
         }

         return count;
     }
    }
    
