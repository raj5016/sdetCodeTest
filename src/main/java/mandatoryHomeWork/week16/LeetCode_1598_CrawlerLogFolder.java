package mandatoryHomeWork.week16;

import java.util.Stack;

import org.junit.Assert;
import org.junit.Test;

public class LeetCode_1598_CrawlerLogFolder {
	
	@Test
	public void test() {
		Assert.assertEquals(2, minOperations(new String[] {"d1/","d2/","../","d21/","./"}));
	}
	
	//https://leetcode.com/problems/crawler-log-folder/
	public int minOperations(String[] logs) {
	    
			int count=0;
			Stack<String> st=new Stack<String>();
			for (String log : logs) {
				if(log.equals("../")) {
					if(!st.isEmpty()){
						st.pop();
						count--;
					}
					continue;
				}else if(log.equals("./")) {
					continue;
				}else {
					st.push(log);
					count++;
				}
			}
	       
			return count;    
		}
}
