package mandatoryHomeWork.week13;

import java.util.Arrays;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_821_ShortestDistanceToACharacter {
	
	
	/*
	 * https://leetcode.com/problems/shortest-distance-to-a-character/description/
	 * 
	 * Logic:
	 *  Create a new array with length of given input array length
	 *  
	 * 
	 * 
	 */
	
	@Test
	public void test() {
		Assert.assertEquals(new int[] {3,2,1,0,1,0,0,1,2,2,1,0}, shortestToChar("loveleetcode", 'e'));
	}
	
	public int[] shortestToChar(String s, char c) {
	    int n = s.length();
	    int[] result = new int[n];
	    
	    int prev = -1;

	    // Initialize the left and right pointers
	    for (int i = 0; i < n; i++) {
	        if (s.charAt(i) == c) {
	            prev = i;
	        }
	        if (prev != -1) {
	            result[i] = i - prev;
	        }
	    }
	    
	    prev = -1;
	    
	    for (int i = n - 1; i >= 0; i--) {
	        if (s.charAt(i) == c) {
	            prev = i;
	        }
	        if (prev != -1) {
	            if (result[i] == 0) {
	                // If result[i] was set to 0 in the left-to-right pass, no need to update it
	                continue;
	            }
	            result[i] = Math.min(result[i], prev - i);
	        }
	    }
	    
	    return result;
	}

}
