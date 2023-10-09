package mandatoryHomeWork.week15;

import java.util.Map;
import java.util.TreeMap;

import org.junit.Assert;
import org.junit.Test;


public class LeetCode_2418_SortThePeople {
	
	//https://leetcode.com/problems/sort-the-people/description/
	
	@Test
	public void test() {
		Assert.assertArrayEquals(new String[] {"Mary","Emma","John"}, sortThePeople(new String[] {"Mary","John","Emma"}, new int[] {180,165,170}));
	}
	
	public String[] sortThePeople(String[] names, int[] heights) {
	    String[] result = new String[names.length];
		Map<Integer, String>  treeMap=new TreeMap<Integer, String>(); //Tree map is used bacz it maintains sorted ascending to descending
		
		for (int i = 0; i < heights.length; i++) {   //165,170,180---John,emma,mary
			treeMap.put(heights[i],names[i]);
		}
		
		int size=heights.length-1;
		for(Map.Entry<Integer, String> entry:treeMap.entrySet()) {  //  marry-180 with size 2 index
			result[size]=entry.getValue();
			size--;
		}
		return result;
	}

}
