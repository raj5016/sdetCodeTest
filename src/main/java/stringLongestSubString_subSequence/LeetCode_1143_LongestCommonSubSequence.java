package stringLongestSubString_subSequence;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_1143_LongestCommonSubSequence {
	//https://leetcode.com/problems/longest-common-subsequence/description/
	
	@Test
	public void test() {
		Assert.assertEquals(3, returnLongestCommonSubSequence("abcde", "ace"));
	}
	
	public int returnLongestCommonSubSequence(String input1,String input2) {
		char[] ch1=input1.toCharArray();
		char[] ch2=input2.toCharArray();
		int n=input1.length();
		int m=input2.length();
		
		int[][] dp=new int[n+1][m+1];
		
		for (int i = 1; i <= n; i++) {
			for(int j=1;j<=m;j++) {
				if(ch1[i-1]==ch2[j-1]) {
					// when new char is added we have to get the number from diagonally opposite and add 1
					//Vertically opposite value +1
					dp[i][j]=1+dp[i-1][j-1];  
				}else {
					//value are not same pick up value at top and value at bottom and compare and update max value
					dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]); 
				}
			}
		}
		return dp[input1.length()][input2.length()];
	}

}
