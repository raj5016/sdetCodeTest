package mandatoryHomeWork.week12;

import org.junit.Test;

public class LeetCode_2562_FindTheArrayConcatenationValue {
	
	/*
	 * https://leetcode.com/problems/find-the-array-concatenation-value/description/
	 * 
	 * Logic:
	 * 
	 * Declare i as startpoint and j as endpoint and declare outputvariable
	 * Have a condition i<j,
	 * 		Take nums[i] and convert and store it string s1
	 * 		Take nums[j] and convert and store it string s2
	 * 		Concat two s1 and s2 and store it in s3
	 * 		Add the convert concat string s3 and add it to output
	 * 		and increment i and decrement j
	 * 
	 * And check the condition nums of length not equal to 0, if so get nums[i] and add it to output
	 */
	@Test
	public void test() {
		//Assert.assertEquals(673, bytwoPointer_findTheArrayConcVal(new int[] {5,14,13,8,12}));
		System.out.println( bytwoPointer_findTheArrayConcVal(new int[] {5,14,13,8,12}));  //673
	}
	
	@Test
	public void test1() {
		System.out.println(bytwoPointer_findTheArrayConcVal(new int[] {7,52,2,4}));  //596
	}
	
	public Long bytwoPointer_findTheArrayConcVal(int[] nums) {
	    int i=0;
		long output=0;
		int j=nums.length-1;;

		
		while(i<j) {
			String s1=Integer.toString(nums[i]);
			String s2=Integer.toString(nums[j]);
			String s3=s1+s2;
			output+=Integer.parseInt(s3);
			i++;
			j--;
		}
		
		if(nums.length%2 != 0) {
			output+=nums[i];
		}
		
		return output;
	}
	
	
	
	
	
	

}
