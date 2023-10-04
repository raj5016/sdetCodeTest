package mandatoryHomeWork.week14;

import java.util.HashMap;
import org.junit.Test;
import org.testng.Assert;

public class LeetCode_771_JewelsAndStones {
	
	//https://leetcode.com/problems/jewels-and-stones/description/
	/*
	 * Logic:
	 * 
	 * Define HashMap to hold character and integer
	 * Iterate with stones length and add the value to HMap
	 * Define a count variable
	 * Iterate with Jewel length,and check map contain the jewel char and if map contains the jewel char
	 * 			Get the key value and add it to count.
	 * 
	 */

	@Test
	public void test() {
		Assert.assertEquals(3, numJewelsInStones("aA", "aAAbbbb"));
		Assert.assertEquals(0, numJewelsInStones("z", "ZZ"));
	}
	
	 public int numJewelsInStones(String jewels, String stones) {
	        HashMap<Character, Integer> hmap=new HashMap<Character,Integer>();
	      
	         for(int i=0;i<stones.length();i++){
	            hmap.put(stones.charAt(i),hmap.getOrDefault(stones.charAt(i),0)+1);
	        }
	        int count=0;
	        for(int i=0;i<jewels.length();i++){
	            if(hmap.containsKey(jewels.charAt(i))){
	                   count+= hmap.get(jewels.charAt(i));
	            }
	        }
	        return count;
	    }
	 
}
