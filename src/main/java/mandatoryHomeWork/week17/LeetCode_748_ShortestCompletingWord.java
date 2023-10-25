package mandatoryHomeWork.week17;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_748_ShortestCompletingWord {
	
	//https://leetcode.com/problems/shortest-completing-word/description/
	
	@Test
	public void test() {
		Assert.assertEquals("steps", shortestCompletingWord("1s3 PSt", new String[] {"step","steps","stripe","stepple"}));
	}
	
	@Test
	public void test1() {
		Assert.assertEquals("pest", shortestCompletingWord("1s3 456", new String[] {"looks","pest","stew","show"}));
	}
	
	
	public String shortestCompletingWord(String licensePlate, String[] words) {
		Map<Character, Integer> freqMap = new HashMap<Character, Integer>();
		String lp = licensePlate.toLowerCase();

		//Adding  licensePlate string into freqmap 
		for (int i = 0; i < lp.length(); i++) {
			char ch = lp.charAt(i);
			if (Character.isLetter(ch)) {
				freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
			}
		}

		//final output string
		String result = "";

		//Iterating with words and adding word into map and comparing with licensePlate map
		for (String word : words) {
			Map<Character, Integer> wordFreqMap = new HashMap<>();
			boolean check = true;

			for (char letter : word.toCharArray()) {
				wordFreqMap.put(letter, wordFreqMap.getOrDefault(letter, 0) + 1);
			}
			
			//Comparing  freqMap with wordFreqMap 
			for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
				char letter = entry.getKey();
				if (wordFreqMap.containsKey(letter)) {
					if (wordFreqMap.get(letter) < entry.getValue()) {
						check = false;
						break;
					}
				} else {
					check = false;
					break;
				}
			}
			if (check) {
				if (result.equals("") || result.length() > word.length()) {
					result = word;
				}
			}
		}
		return result;
	}
        
    }


