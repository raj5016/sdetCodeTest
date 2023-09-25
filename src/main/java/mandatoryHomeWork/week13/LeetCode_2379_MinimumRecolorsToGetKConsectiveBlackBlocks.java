package mandatoryHomeWork.week13;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_2379_MinimumRecolorsToGetKConsectiveBlackBlocks {
	
	
	/*https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/description/
	 * 
	 * 
	 * Logic:
	 * 	Declare a variable left,right , white as 0 and Minwhite as Integer maximumvalue
	 * 
	 *				1st sliding window
	 * 	Iterate a loop with right pointer until k value
	 * 		check each index which as W, if so increment the white 
	 * 	And increment the right pointer
	 * So next take the minwhite by comparing the white and minwhite
	 * 
	 * 				2nd sliding window
	 * Iterate a loop with right pointer until length of string (right pointer will be in k)
	 * 		Check left index contains 'W' , if so decrement white count
	 * Increment left pointervalue.
	 * 		Check right index contains 'W', if so increment white count
	 * Increment right pointer value
	 * So next take the minwhite by comparing the white and minwhite
	 * Return min white
	 */
	
	@Test
	public void test() {
		//Assert.assertEquals(3, minimumRecolors("WBBWWBBWBW", 7));
		Assert.assertEquals(0, minimumRecolors("WBWBBBW", 2));

	}
	
	
	//Sliding window , Time complexity -O(N)
	public int minimumRecolors(String blocks, int k) {
		int left=0,right=0, white=0, minWhite=Integer.MAX_VALUE;
		
		while(right<k) {
			if(blocks.charAt(right)=='W') {
				white++;
			}
			right++;
		}
		
		minWhite=Math.min(minWhite, white);
		
		while(right<blocks.length()) {
			if(blocks.charAt(left)=='W') {
				white--;
			}
			left++;
			if(blocks.charAt(right)=='W') {
				white++;
			}
			right++;
			minWhite=Math.min(minWhite, white);
		}
		return minWhite;
    }

}
