package com.babuSirSession.string.anagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class GroupAnagarm {
	/*https://leetcode.com/problems/group-anagrams/description/
	 * 
	 * Given an array of strings, group anagrams together.
		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
		Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
	 */
	
	
	@Test
	public void testGroupAnagram() {
		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
		List<List<String>> groupedAnagrams = returnGroupAnagramList(strs);
		System.out.println(groupedAnagrams);
		//		Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
	}
	
	//strs==n==6, ch==m=3   ,  sort-O(n*mlogm)
	public List<List<String>> returnGroupAnagramList(String[] strs){
        Map<String, List<String>> hmap = new HashMap<>();
        
        for (String word : strs) {
			char[] ch=word.toCharArray();
			Arrays.sort(ch);
			String sortedWord=String.valueOf(ch);
			if(!hmap.containsKey(sortedWord)) {
                hmap.put(sortedWord, new ArrayList<>());
			}
            hmap.get(sortedWord).add(word);
		}
       // System.out.println(new ArrayList<>(hmap.values()));
        return new ArrayList<>(hmap.values());
	}
}
