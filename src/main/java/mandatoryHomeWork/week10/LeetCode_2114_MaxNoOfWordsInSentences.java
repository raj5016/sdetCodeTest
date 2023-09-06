package mandatoryHomeWork.week10;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_2114_MaxNoOfWordsInSentences {
	
	/*
	 * https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
	 * 
	 * Logic:
	 * 
	 * Input : Arrays of Strings in Sentence 
	 * Output: Int (No of Words)
	 * 
	 * Declare temp and current count variable
	 * Iterate with for loop until sentences length to get sentence
	 * From sentences[i] get the no of words and using split to get no of word
	 * Get the words of length and store in count variable
	 * 
	 * 
	 */
	
	@Test
	public void test() {
		String[] sentences= {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
		Assert.assertEquals(6, returnOfWordsinSenetences(sentences));
	}
	
	@Test
	public void test1() {
		String[] sentences= {"please wait", "continue to fight", "continue to win"};
		Assert.assertEquals(3, returnOfWordsinSenetences(sentences));
	}
	
	@Test
	public void test2() {
		String[] sentences= {"please  ", "please", "continue"};
		Assert.assertEquals(2, returnOfWordsinSenetences(sentences));
	}
	
	public int returnOfWordsinSenetences(String[] sentences) {
		int tempCount=0;
		int currentCount=0;
		for (int i = 0; i < sentences.length; i++) {
			String sentence=sentences[i];
			String[] words=sentence.split("\\s");
			currentCount=words.length;
			if(tempCount<currentCount) {
				tempCount=currentCount;
			}
		}
		
		return tempCount;
	}

}
