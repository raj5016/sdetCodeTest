package mandatoryHomeWork.week13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class LeetCode_438_FindAllAnagramsInAString {
	
	
	/*https://leetcode.com/problems/find-all-anagrams-in-a-string/description/
	 * 
	 * Logic:
	 * Initialize List of integer array to hold output.
	 * Initialize two integer array as s array and p array with size as 26(total alpha char)
	 * Iterate with loop until length of p array.
	 * 		check both p and s char asci value and add it in corresponding array and increment both array
	 * 
	 * Check both array are equal then add array as 0 length
	 * 
	 * Iterate from p length to s length 
	 * 		check left and right asci value of char , by moving left to right
	 * 		check both array are equal
	 * 				if so index of array
	 * 
	 */
	
	@Test
	public void test() {
		Assert.assertEquals(Arrays.asList(0,6), findAnagrams("cbaebabacd", "abc"));
		Assert.assertEquals(Arrays.asList(0,1,2), findAnagrams("abab", "ab"));
		Assert.assertEquals(Arrays.asList(0,6), findAnagrams("cbaebabacd", "abc"));
	}
	
	//Time complexity- O(n)
	public List<Integer> findAnagrams(String s, String p) {
        List<Integer> answer = new ArrayList<>();
        int patternLength = p.length(), strLength = s.length();
        int patternFrequeny[] = new int[26], strFrequency[] = new int[26];

        
        if (patternLength > strLength) {
        	return answer;
        }
        
        //First sliding window
        for (int index = 0; index < patternLength; index++) {
            patternFrequeny[p.charAt(index) - 'a']++;
            strFrequency[s.charAt(index) - 'a']++;
        }
        
        if (Arrays.equals(patternFrequeny, strFrequency)) {
        	answer.add(0);
        }
        
        
        //2nd sliding window from pattern length to string length
        for (int window = patternLength; window < strLength; window++) {
            strFrequency[s.charAt(window) - 'a']++; //checks for right side
            strFrequency[s.charAt(window - patternLength) - 'a']--; //checks for left side
            if (Arrays.equals(patternFrequeny, strFrequency)) {
            	answer.add(window - patternLength + 1);
            }
        } 
        return answer;
    }

}
