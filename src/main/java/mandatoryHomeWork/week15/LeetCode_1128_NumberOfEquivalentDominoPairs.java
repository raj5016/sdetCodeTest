package mandatoryHomeWork.week15;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_1128_NumberOfEquivalentDominoPairs {
	//https://leetcode.com/problems/number-of-equivalent-domino-pairs/description/
	
	@Test
	public void test() {
        int[][] dominoes1 = {{1, 2}, {2, 1}, {3, 4}, {5, 6}};
        int expected1 = 1;
        int result1 = numEquivalentDominoPairs(dominoes1);
        Assert.assertEquals(expected1, result1);
	}
	
	@Test
	public void test1() {
        int[][] dominoes1 = {{1, 2}, {1, 2}, {1, 1}, {1, 2}, {2, 2}};
        int expected1 = 3;
        int result1 = numEquivalentDominoPairs(dominoes1);
        Assert.assertEquals(expected1, result1);
	}
	
	
	public int numEquivalentDominoPairs(int[][] dominoes) {
	    int[] count = new int[100]; // Since the values in dominoes are between 1 and 9
	    int result = 0;
	    
	    for (int[] domino : dominoes) {
	        int min = Math.min(domino[0], domino[1]);
	        int max = Math.max(domino[0], domino[1]);
	        int value = min * 10 + max; // Combine values to create a unique identifier
	        
	        result += count[value]; // Increment the count for this identifier
	        count[value]++; // Increment the count for the current domino
	    }
	    
	    return result;
	}
}
