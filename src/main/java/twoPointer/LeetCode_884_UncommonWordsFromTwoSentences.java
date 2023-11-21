package twoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class LeetCode_884_UncommonWordsFromTwoSentences {
	//https://leetcode.com/problems/uncommon-words-from-two-sentences/

	/**
	 * Logic:
	 * 
	 * 1.Create a new HashMap and a new ArrayList
	 * 2.Iterate each word s in s1 split by space
	 * 			Increment the count of word s in map or set it to 1 if not present
	 * 3.Iterate each word s in s2 split by space
	 * 			Increment the count of word s in map or set it to 1 if not present
	 * 4.For each entry m in map,If the value of m is 1:
	 * 			Add the key of m to the list
	 * 5.Convert the list to an array and assign it to arr
	 * 6. Return arr
	 * 			
	 */
	
	@Test
	public void testUnCommonWordFromSentences() {
		String[] result=uncommonFromSentences("this apple is sweet","this apple is sour");
		System.out.println(Arrays.toString(result));
	}

    	public String[] uncommonFromSentences(String s1, String s2) {
    		 Map<String , Integer> map = new HashMap<String , Integer>();
    	        List<String> list = new ArrayList<>();
    	        
    	        for(String s : s1.split("")){ 
    	            map.put(s,map.getOrDefault(s,0)+1);
    	        }
    	        
    	        for(String s : s2.split(" ")){
    	            map.put(s,map.getOrDefault(s,0)+1);
    	        }
    	        
    	       // System.out.println(map);
    	        for(Map.Entry<String,Integer> m : map.entrySet()){
    	            if(m.getValue()==1)
    	              list.add(m.getKey());
    	        }
    	        //System.out.println(list);
    	        String[] arr = list.toArray(new String[list.size()]);
    	     //   System.out.println(Arrays.toString(arr));      
    	        return arr;
    }
}
