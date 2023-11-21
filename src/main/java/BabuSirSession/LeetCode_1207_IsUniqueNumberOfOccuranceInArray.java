package BabuSirSession;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_1207_IsUniqueNumberOfOccuranceInArray {
	//https://leetcode.com/problems/unique-number-of-occurrences/description/
	
	/**
	 * Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.
		Input: arr = [1,2,2,1,1,3]
		Output: true
		
		Logic:(Since not sorted, we cant go for two pointer)
		1.Define HashMap to add the values 
		2.Iterate until the array length
				a . add the values into hmap
		3.Define hashset and add the hamp values into hashset
		4.compare the hmap and hashset size and return true if same
		
		
	 */
	
	@Test
	public void test() {
		Assert.assertEquals(true, isUniqueNumberOfOOcurance(new int[] {1,2,2,1,1,3}));
	}
	
	public boolean isUniqueNumberOfOOcurance(int[]  arr) {
		Map<Integer,Integer>  hmap=new HashMap<Integer,Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			hmap.put(arr[i], hmap.getOrDefault(arr[i], 0)+1);
		}
		
		HashSet<Integer> hset=new HashSet<Integer>(hmap.values());
		return hmap.size()==hset.size();

	}

}
