package mandatoryHomeWork.week15;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_819_MostCommonWord {
	
	//https://leetcode.com/problems/most-common-word/
	/*
	 * Logic:
	 * 1.convert to lowercase and remove punctuation
	 * 2.Split the paragraph into words
	 * 3.Create a set of banned words to add in it
	 * 4.Initialize a map to keep track of word frequencies
	 * 5.Iterate through the words in the paragraph and update word frequencies
	 * 6. Find the most frequent non-banned word
	 * 
	 */
	
	@Test
	public void test() {
		Assert.assertEquals("ball", mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[] {"hit"}));
	}
	
	public String mostCommonWord(String paragraph, String[] banned) {
	  
	    paragraph = paragraph.toLowerCase();
	    paragraph = paragraph.replaceAll("[^a-zA-Z ]", " ");
	    
	    String[] words = paragraph.split("\\s+");
	    
	    HashSet<String> bannedSet = new HashSet<>();
	    for (String word : banned) {
	        bannedSet.add(word);
	    }
	    Map<String, Integer> wordCounts = new HashMap<>();
	    
	    for (String word : words) {
	        if (!bannedSet.contains(word)) {
	            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
	        }
	    }  
	    
	    String mostFrequentWord = "";
	    int maxFrequency = 0;
	    
	    for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
	        if (entry.getValue() > maxFrequency) {
	            mostFrequentWord = entry.getKey();
	            maxFrequency = entry.getValue();
	        }
	    }
	    
	    return mostFrequentWord;
    }

}
