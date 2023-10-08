package twopointerApproach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_228_SummaryRanges_TwoPointerApproach {
	
	
	
	
	// 	https://leetcode.com/problems/summary-ranges/description/
	
	@Test
	public void test() {
		Assert.assertEquals(Arrays.asList("0->2","4->5","7"), summaryRanges(new int[] {0,1,2,4,5,7}));
	}

	
	 public List<String> summaryRanges(int[] nums) {
	
		 List<String> outputString=new ArrayList<String>();
		 if(nums.length==0) {
			 return outputString;
		 }
		 
		 int start=nums[0];
		 int end=nums[0];
		 
		for (int i= 0; i < nums.length-1; i++) {
			int curNum=nums[i];
			int nextNum=nums[i+1];
			
			if(nextNum-curNum==1) {
				end++;
			}
			else {
				outputString.add(format(start, end));
				start=nextNum;
				end=nextNum;
			}
		} 
		outputString.add(format(start, end));
		return outputString;
	 }
	 
	 
	 public String format(int start,int end) {
		 if(start==end) {
			 return start+ "";
		 }else {
			 return start+"->"+end;
		 }
	 }

}
