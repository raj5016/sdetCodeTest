package mandatoryHomeWork.week12;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_1358_NumberOfSubstring {
	
	//https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/description/
	@Test
	public void test() {
		Assert.assertEquals(10, numberOfSubString("abcabc"));
	}
	public int numberOfSubString(String s) {
		 int[] count = new int[3]; // Array to store the count of 'a', 'b', and 'c' in the current window
		    int left = 0; // Left pointer of the window
		    int result = 0;

		    for (int right = 0; right < s.length(); right++) {
		        char c = s.charAt(right);
		        count[c - 'a']++; // Update the count for the current character

		        // Move the left pointer to the right until we have at least one 'a', 'b', and 'c' in the window
		        while (count[0] > 0 && count[1] > 0 && count[2] > 0) {
		            char leftChar = s.charAt(left);
		            count[leftChar - 'a']--; // Decrease the count of the left character
		            left++;
		        }

		        // The number of substrings ending at the current right pointer and containing all three characters is (left + 1)
		        result += left;
		    }

		    return result;
		}
	}

