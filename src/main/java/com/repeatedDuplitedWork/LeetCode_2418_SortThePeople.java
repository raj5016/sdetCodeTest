package com.repeatedDuplitedWork;

import java.util.Map;
import java.util.TreeMap;

import org.junit.Assert;
import org.junit.Test;

public class LeetCode_2418_SortThePeople {
	
		//names = ["Mary","John","Emma"], heights = [180,165,170]
	
	@Test
	public void test() {
		Assert.assertArrayEquals(new String[] {"Mary","Emma","John"}, sortPeople(new String[] {"Mary","John","Emma"}, new int[] {180,165,170}));
	}
	
	
	 	public String[] sortPeople(String[] names, int[] heights) {
	 		Map<Integer,String>  tmap=new TreeMap<Integer,String>();
	         String[] result = new String[names.length];

	 		for (int i = 0; i < names.length; i++) {  //For String Alphabetical order, for int descending order
	 			tmap.put(heights[i],names[i]);   //once added //165,170,180---John,emma,mary
			}
	 		
	 		int size=heights.length-1;
	 		
	 		for(Map.Entry<Integer,String>  entries : tmap.entrySet()) {
	 			result[size]=entries.getValue();
	 			size--;
	 		}
	 		return result;
	        
	    }

}
