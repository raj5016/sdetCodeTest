package stringLongestSubString_subSequence;


import org.junit.Test;
import org.testng.Assert;

public class LongestCommonSubString {
	
	//https://www.geeksforgeeks.org/longest-common-substring-dp-29/
	
	/**
	 * Given two strings ‘X’ and ‘Y’, find the length of the longest common substring. 
	 * Input : X = “abcdxyz”, y = “xyzabcd” 
	   Output : 4
	   
	   Approach is dynamic approach memoization
	 */
	
	@Test
	public void test() {
		Assert.assertEquals(4, returnLongestSubStringLength("abcdxyz", "xyzabcd"));
	}
	
	public int returnLongestSubStringLength(String input1,String input2) {
		int max=0;
		char[] ch1=input1.toCharArray();
		char[] ch2=input2.toCharArray();
		int n=input1.length();
		int m=input2.length();
		
		int[][] dp=new int[n+1][m+1];
		
		for (int i = 1; i <= n; i++) {
			for(int j=1;j<=m;j++) {
				if(ch1[i-1]==ch2[j-1]) {
					dp[i][j]=dp[i-1][j-1]+1;   //get the number from diagonally opposite and add 1
					max=Math.max(dp[i][j], max);
				}
			}
		}
		return max;
	}
	
	

}
